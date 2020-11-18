import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.lang.System;

class File_operations
{
		static String dir_path = "/Users/synup/Documents/gitRepositories/File_handling/test/";
		static String file_path = "";

		// Get files in ascending order
		public static void get_files()
		{
			System.out.println("Hello World");
		}

		// Adding files to directory
		public static void add_files()
		{
			try
			{
				Scanner sc = new Scanner(System.in);
				System.out.print("\nEnter file name: ");
				String file_obj = sc.nextLine();
				file_path = dir_path + file_obj;
				File file = new File(file_path);

				if(file.createNewFile())
					System.out.println("Created file "+file.getName());
				else
					System.out.println("File already exists");
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
		}

		// Deleting files from directory
		public static void delete_files()
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("\nEnter file name: ");
			String file_obj = sc.nextLine();

			file_path = dir_path + file_obj;

			File file = new File(file_path);

			if(file.getName().equalsIgnoreCase(file_obj))
			{
				if(file.delete())
					System.out.println("Deleted file: "+file.getName());
				else
					System.out.println("Failed to delete the file.");
			}
		}

		// Search for a file in the directory
		public static void search_file()
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("\nEnter file name: ");
			String file_obj = sc.nextLine();
			file_path = dir_path;

			File file = new File(file_path);

			File [] list = file.listFiles();

			if (list!=null)
			{
				for (File fil: list)
				{
					if (file.exists())
					{
						if (file_obj.equalsIgnoreCase(fil.getName()))
							System.out.println(file_obj + " is present in " + fil.getParentFile());
					}
					else
					{
							System.out.println(file_obj + " is not present");
							break;
					}
				}
			}
		}

		// Exit application
		public static void exit_application()
		{
			System.out.println("Exiting application");
			System.exit(0);
		}
}

// Inherit parent class File_operations to call for respective methods
class Execute extends File_operations
{
	// Method definitions
	public static void file_operations(int user_option)
	{
		switch(user_option)
		{
			case 1: get_files();
			        break;
			case 2: add_files();
				    	break;
			case 3: delete_files();
			        break;
			case 4: search_file();
							break;
			case 5: exit_application();
							break;
			default: System.out.println("Option not available");
		}
	}
	// Generic function to take user input
	public void user_interface()
	{
		String context = "";
		Scanner sc = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		do
		{
			System.out.println("\nApplication: File Handler");
			System.out.println("Developer: Soumi Basu");
			System.out.println("===============================================");
			System.out.println("\nUser Interface");
			System.out.println("====================");
			System.out.println("Enter 1. to retrieve all files in the system");
			System.out.println("Enter 2. to add a user specified file in the system");
			System.out.println("Enter 3. to delete a user specified file in the system");
			System.out.println("Enter 4. to search for a file in the system");
			System.out.println("Enter 5. to close the application");

			System.out.print("\nEnter option: ");

			int option = sc.nextInt();

			file_operations(option);

			System.out.print("\nContinue? (y/n): ");
			context = input.next();
		}while(!context.equals("n"));
		sc.close();
		input.close();
	}
}

public class File_handling
{
	public static void main(String [] args)
	{
		Execute exe  = new Execute();
		exe.user_interface();
	}
}

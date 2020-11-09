import java.util.Scanner;

class File_operations
{
		// Get files in ascending order
		public static void get_files()
		{
			System.out.println("Hello World");
		}

		// Adding files to directory
		public static void add_files()
		{
			System.out.println("add a user specified file in the system");
		}

		// Deleting files from directory
		public static void delete_files()
		{
			System.out.println("delete a user specified file in the system");
		}

		// Search for a file in the directory
		public static void search_file()
		{
			System.out.println("search for a file in the system");
		}

		// Some method
		public static void navigate_context()
		{
			System.out.println("navigate context");
		}

		// Exit application
		public static void exit_application()
		{
			System.out.println("close application");
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
			case 5: navigate_context();
							break;
			case 6: exit_application();
							break;
			default: System.out.println("Option not available");
		}
	}
	// Generic function to take user input
	public void user_interface()
	{
		String exit = "";
		Scanner sc = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		do
		{
			System.out.println("User Interface");
			System.out.println("====================");
			System.out.println("Enter 1. to retrieve all files in the system");
			System.out.println("Enter 2. to add a user specified file in the system");
			System.out.println("Enter 3. to delete a user specified file in the system");
			System.out.println("Enter 4. to search for a file in the system");
			System.out.println("Enter 5. to navigate context");
			System.out.println("Enter 6. to close the application");

			System.out.print("\nEnter option: ");

			int option = sc.nextInt();

			file_operations(option);

			System.out.print("\nContinue? (y/n): ");
			exit = input.next();
		}while(!exit.equals("n"));
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

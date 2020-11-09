import java.util.*;

class File_operations
{
		public static void get_files()
		{
			System.out.println("Hello World");
		}

		public static void add_files()
		{
			System.out.println("add a user specified file in the system");
		}

		public static void delete_files()
		{
			System.out.println("delete a user specified file in the system");
		}

		public static void search_file()
		{
			System.out.println("search for a file in the system");
		}

		public static void navigate_context()
		{
			System.out.println("navigate context");
		}

		public static void exit_application()
		{
			System.out.println("close application");
		}
}

class Execute extends File_operations
{
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
		}
	}

	public void user_interface()
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
		Scanner sc = new Scanner(System.in);

		int option = sc.nextInt();

		file_operations(option);
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

import java.util.*;

class Operations
{
	public static void file_operations(int user_option)
	{
		switch(user_option)
		{
			case 1: System.out.println("retrieve all files in the system");
			        break;
			case 2: System.out.println("add a user specified file in the system");
				    	break;
			case 3: System.out.println("delete a user specified file in the system");
			        break;
			case 4: System.out.println("search for a file in the system");
							break;
			case 5: System.out.println("navigate context");
							break;
			case 6: System.out.println("close application");
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
		Operations fo = new Operations();
		fo.user_interface();
	}
}
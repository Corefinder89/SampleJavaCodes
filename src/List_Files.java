import java.io.File;

public class List_Files 
{
	public static void file_list(String dir_path)
	{	
		File directory = new File(dir_path);
			
		File[] listofFiles = directory.listFiles();
			
		for(int i=0;i<listofFiles.length;i++)
		{	
			System.out.println(listofFiles[i]);
		}
	}
	public static void main(String [] args)
	{
		String dir_path = "E:\\Automation\\OncorpsAutomation\\OncorpsProjects\\GISD\\TestReports\\Screenshot";
		file_list(dir_path);
	}
}

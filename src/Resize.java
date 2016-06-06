import java.io.File;

public class Resize 
{
	public static void main(String [] args)
	{
		int IMG_WIDTH = 100;
		int IMG_HEIGHT = 100;
		
		String dir_path = "E:\\Automation\\OncorpsAutomation\\OncorpsProjects\\GISD\\TestReports\\Screenshot";
		File directory = new File(dir_path);
		
		File[] listofFiles = directory.listFiles();
		
		for(int i=0;i<listofFiles.length;i++)
		{
			if(listofFiles[i].isFile())
			{
				double filesize = listofFiles[i].length();
				double filesize_kb = filesize / 1024;
				double filesize_mb = filesize_kb / 1024;
				
				System.out.println("File Name: " +listofFiles[i].getName() + "\tFile Size in mb: " +filesize_mb);
			}
		}
	}
}

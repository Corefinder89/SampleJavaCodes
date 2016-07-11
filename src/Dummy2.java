import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dummy2 
{
	public void create_directory()
	{
		String current_DateTime = new SimpleDateFormat("MM-dd-yyyy_HH-mm-ss")
				.format(new Date().getTime());
		
		String dir_name = "dir_"+current_DateTime;
		
		File f = new File("C:\\Users\\logesh.kumar\\Desktop\\"+dir_name);
		
		if(!f.exists())
		{
			f.mkdir();
			System.out.println("Directory created");
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
			System.out.println("After Format : " + sdf.format(f.lastModified()));
			System.out.println("File Name: " +f.getName());
		}
	}
	
	public static void main(String [] args)
	{
		Dummy2 d = new Dummy2();
		d.create_directory();
	}
}

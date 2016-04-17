import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

class Read
{
	FileReader instream;
	public String getDataFromConfigFile(String variable) throws IOException
	{
		String value=null;
		try
		{
			final String dir = System.getProperty("user.dir");
	        System.out.println("current dir = " + dir);
			instream = new FileReader("/Users/soumyajit/Desktop/abc/Config.properties");
			Properties prop = new Properties();
			prop.load(instream);
			value = prop.getProperty(variable);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File Not found");
			e.printStackTrace();
		}
		return value;
	}
}

class Read_config
{
	public static void main(String [] args) throws IOException
	{
		Read r = new Read();

		String username = r.getDataFromConfigFile("username");
		System.out.println(username);
	}
}


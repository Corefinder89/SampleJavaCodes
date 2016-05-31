import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Zipper 
{
	List<String> fileList;
	private static final String OUTPUT_ZIP_FILE = "/Users/soumyajit/Desktop/Screenshots.zip";
	private static final String SOURCE_FOLDER = "/Users/soumyajit/Desktop/CIP_App/TestReports/Screenshot";
	
	Zipper()
	{
		fileList = new ArrayList<String>();
	}
	public static void main(String [] args)
	{
		Zipper zip = new Zipper();
		zip.generateFileList(new File(SOURCE_FOLDER));
		zip.zipit(OUTPUT_ZIP_FILE);
	}
	
	public void zipit(String zipFile)
	{
		byte[] buffer = new byte[1024];
		
		try
		{
			FileOutputStream fos = new FileOutputStream(zipFile);
			ZipOutputStream zos = new ZipOutputStream(fos);
			
			System.out.println("Output to zip: " +zipFile);
			for(String file: this.fileList)
			{
				System.out.println("File added: " +file);
				ZipEntry ze = new ZipEntry(file);
				zos.putNextEntry(ze);
				
				FileInputStream fis = new FileInputStream(SOURCE_FOLDER + File.separator + file);
				
				int len;
				while((len = fis.read(buffer)) > 0)
				{
					zos.write(buffer,0,len);
				}
				
				fis.close();
			}
			
			zos.closeEntry();
			zos.close();
			
			System.out.println("Done");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	public void generateFileList(File node)
	{
		if(node.isFile())
		{
			fileList.add(generateZipEntry(node.getAbsoluteFile().toString()));
		}
		
		if(node.isDirectory())
		{
			String[] subnode = node.list();
			for(String filename: subnode)
			{
				generateFileList(new File(node,filename));
			}
		}
	}
	
	String generateZipEntry(String file)
	{
		return file.substring(SOURCE_FOLDER.length()+1,file.length());
	}
}

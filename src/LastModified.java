import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import org.apache.commons.io.filefilter.AgeFileFilter;

public class LastModified {

	public static void main(String[] args) throws IOException {

		File directory = new File("E:\\Automation\\OncorpsAutomation\\OncorpsProjects\\GISD\\TestReports\\Screenshot");

		Calendar cal = Calendar.getInstance();
		Date cutoffDate = cal.getTime();

		System.out.println("All Files");
		displayFiles(directory, null);

		System.out.println("\nBefore " + cutoffDate);
		displayFiles(directory, new AgeFileFilter(cutoffDate));

		System.out.println("\nAfter " + cutoffDate);
		displayFiles(directory, new AgeFileFilter(cutoffDate, false));

	}

	public static void displayFiles(File directory, FileFilter fileFilter) {
		File[] files = directory.listFiles(fileFilter);
		for (File file : files) {
			Date lastMod = new Date(file.lastModified());
			System.out.println("File: " + file.getName() + ", Date: " + lastMod + "");
		}
	}

}
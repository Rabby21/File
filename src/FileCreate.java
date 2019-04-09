import java.io.File;
import java.io.IOException;
import java.util.Formatter;


public class FileCreate {
	public static void main(String[] args) throws IOException {
		File f1=new File("C://Users//golam.rabby//Desktop");
		f1.mkdir();
		File f2=new File("C://Users//golam.rabby//Desktop//record.text");
	System.out.println(f1.getAbsolutePath());			
	   f2.createNewFile();
	   Formatter f3=new Formatter("C://Users//golam.rabby//Desktop//record.text");
	   f3.format("%s %s %s\r\n","Name","Age","Address");
	   f3.format("%s %d %s","Rabby",25,"Dhaka");
	   f3.close();
	   
	}
	

}

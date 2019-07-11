import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Io2 {

	
	public static void main(String[] args)
	{
		try {
			File dir1=new File("Abc");
			dir1.mkdir();
			File dir2=new File(dir1,"xyz");
			dir2.mkdir();
			File file=new File(dir2,"atoz.txt");
			PrintWriter pWriter = new PrintWriter(new FileOutputStream(file,true));
			 pWriter.println("Created using program");
			 pWriter.flush();
			 pWriter.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

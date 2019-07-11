
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class InOut {

	
	public static void main(String[] args)
	{
		try {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter file name: ");
			String fname=br.readLine();
			File file = new File(fname);
			if(file.exists())
			{
			     BufferedReader fr=new BufferedReader(new FileReader(fname));
                             String line= null;
      			     while((line=fr.readLine())!=null)
                             {
                             System.out.println(line);
                             }
                        }
			else
			{
				System.out.println("Sorry File doesnt exist!");
			}
                        br.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

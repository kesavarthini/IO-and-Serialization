import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.security.acl.Permission;

public class SerializeDemo {

	
	public static void main(String[] args)
	{
		try {
			Person p1=new Person();
			p1.name="Subash";
			p1.age=25;
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("person.ser"));
			objectOutputStream.writeObject(p1);
			objectOutputStream.close();
			System.out.println("Successful");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

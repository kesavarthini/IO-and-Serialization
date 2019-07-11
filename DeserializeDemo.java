import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.security.acl.Permission;

public class DeserializeDemo {

	
	public static void main(String[] args)
	{
		try {
			ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("person.ser"));
			Person p=(Person) objectInputStream.readObject();
			objectInputStream.close();
			
			System.out.println("Name:"+p.name);
			System.out.println("Age:"+p.age);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

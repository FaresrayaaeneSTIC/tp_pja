package devoir;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.File ;
import java.io.ObjectInputStream;
public class demoDes {
	public static void main(String[]args) {
		Employee e =null ;
		try
		{
		FileInputStream fileIn=new FileInputStream("employee.ser");
		ObjectInputStream in=new ObjectInputStream(fileIn);
		 e =(Employee)in.readObject();
		
		in.close();
		fileIn.close();
		}catch(IOException i)
		{
		i.printStackTrace();
		return;
		}catch(ClassNotFoundException c)
		{
		System.out.println("classe Employee non trouvee");
		c.printStackTrace();
		return;
		}
		System.out.println("Employeedeserialise...");
		System.out.println("Nom: "+ e.name);
		System.out.println("Adresse: "+e.address);
		System.out.println("SSN: "+e.SSN);
		System.out.println("Number: "+e.number);
		}

		
	}

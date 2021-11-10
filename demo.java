package devoir;

import java.io.FileOutputStream ;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File ;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;

public class demo
{
public static void main(String[]args)
{
	Scanner keybord = new Scanner (System.in) ;
	 int i ; 
	 
	System.out.println("Please enter number of emps : ");
	int nbr = keybord.nextInt() ;
	Employee[] arr  ; 
	ArrayList<Employee> list = new ArrayList<>();
	
	
	
	for( i = 1 ;i<nbr ; i++) {
		arr = new Employee[nbr];
		System.out.println("Please enter the name  : ");
		String  name = keybord.next() ;
		System.out.println("Please enter the address  : ");
		String  adr = keybord.next() ;
		System.out.println("Please enter SSN number  : ");
		int ssn = keybord.nextInt() ;
		System.out.println("Please enter  number  : ");
		int n = keybord.nextInt() ;
		
		arr[i] = new Employee(name,adr ,ssn,n);
		list.add(arr[i]);
		
	}
	
	

	try
	{
	FileOutputStream fileOut=
	new FileOutputStream("employee.ser"); // il faut dbrcreer un FileOutPutStream avant OjectOu…..

	ObjectOutputStream out=new ObjectOutputStream(fileOut);
	out.writeObject(list);
	out.close();
	fileOut.close();
	
	System.out.printf("donnee sserialisees sauvegardees dans employee.ser");
	/*File f =new File ("employee.ser");
	System.out.println(f.getAbsolutePath());*/
	}
	catch(IOException c)
	{
	c.printStackTrace();
	}
	



}
}

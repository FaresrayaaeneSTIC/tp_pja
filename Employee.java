package devoir;

import java.io.Serializable;
import java.util.Scanner ; 

public class Employee implements Serializable
{
 private static final String serialVersionUID = "8023368122284944704" ;
	String name;
 String address;
public int SSN; // ne pas transférer -> mettre 0 à sa place
public int number;


 public  Employee(String n  ,String adr , int ssn , int num) {
	 this.name = n ;
	 this.address =adr ; 
	 this.SSN =ssn ; 
	 this.number = num;
 }


}




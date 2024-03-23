package Student_data;

import java.util.Scanner;
import java.io.Serializable;

public class Student implements Serializable {
String name,sub;
int marks,roll,percentage;

Student()
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter student details: ");
	System.out.println("Enter name: ");
	name=sc.next();
	System.out.println("Enter roll number: ");
	roll=sc.nextInt();
	System.out.println("\n1.English  \n2.Math \n3. Science");
	System.out.println("Please type name of subject as shown...");
	System.out.println("Enter subject:");
	sub=sc.next();
	sub=sub.toUpperCase();
	if(!sub.equals("MATH") && !sub.equals("SCIENCE") && !sub.equals("ENGLISH"))
	{
		System.out.println("Please enter correct subject...");
		return;
	}
	
	System.out.println("Enter marks: ");
	marks=sc.nextInt();
	if(marks<0 || marks>500)
	{
		System.out.println("invalid marks");
		System.exit(1);
	}
	percentage=(marks*100)/500;
	
}

void disp()
{
	System.out.println("Name: " + name);
	System.out.println("Roll no: " + roll);
	System.out.println("Subject: " + sub);
	System.out.println("Total marks: " + marks);
	System.out.println("Percentage: " + percentage);
}
}

package File_sorting;

import java.io.Serializable;
import java.util.Scanner;

public class Student_details implements Serializable {
String name,subject;
int id,marks,per;
Student_details()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter student Details: ");
	System.out.println("Enter name: ");
	name=sc.next();
	System.out.println("Enter Roll no(Id no):");
	id=sc.nextInt();
	System.out.println("Subject:\n1.Math \n2.Science \n3.English");
	System.out.println("Enter major subject(Any one):");
	subject=sc.next();
	subject=subject.toUpperCase();
	if(!subject.equals("MATH") && !subject.equals("SCIENCE") && !subject.equals("ENGLISH"))
	{
		System.out.println("Please enter correct subject");
		return;
	}
	
	System.out.println("Enter marks(Out of 500): ");
	marks=sc.nextInt();
	per=marks/(100*500);
	
}
void disp()
{
	System.out.println("Name: " + name);
	System.out.println("Roll number: " + id);
	System.out.println("Major Subject: " + subject);
	System.out.println("Total Marks: " + marks);
	System.out.println("Percentage: " + per);
}

}

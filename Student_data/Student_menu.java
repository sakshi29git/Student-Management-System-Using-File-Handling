package Student_data;

import java.io.IOException;
import java.util.Scanner;

public class Student_menu {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		int choice;
		Student_operation obj=new Student_operation();
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("1. Add Details");
			System.out.println("2.Display details");
			System.out.println("3. Search Details");
			System.out.println("4. Result");
			System.out.println("5. Exit");
			System.out.print("Choice");
			
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				obj.add_details();
				break;
				
				
			case 2:
				obj.read_det();
				break;
				
				
			case 3:
				obj.search_det();
				break;
				
			case 4:
				obj.result_det();
				break;
				
				
			case 5:
				System.out.println("Exit");
				break;
				
			default:
				System.out.println("Wrong choice");
				break;
				
			}
			
			
		}while(choice!=5);
	}

}

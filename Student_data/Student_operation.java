package Student_data;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Student_operation {
    Scanner sc = new Scanner(System.in);

    void add_details() throws IOException {
        // Open the file for writing
        try (FileOutputStream fo = new FileOutputStream("Student.txt"); // give filename in which you want to store the data
             ObjectOutputStream oo = new ObjectOutputStream(fo)) {
            
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < 2; i++) {
                System.out.println("Enter student details for student " + (i+1) + ":");
                Student obj = new Student();
                oo.writeObject(obj);
                System.out.println("Details added successfully for student " + (i+1) + ".");
                System.out.println();
            }
        }
    }



    void read_det() throws ClassNotFoundException, IOException {
    	System.out.println();
        try (FileInputStream fi = new FileInputStream("Student.txt");//enter file name including file path
             ObjectInputStream oi = new ObjectInputStream(fi)) {
            Student obj;
            while (true) {
                try {
                    obj = (Student) oi.readObject();
                    obj.disp();
                } catch (EOFException e) {
                    break;
                }
            }
        }
    }

    void search_det() throws IOException, ClassNotFoundException {
    	System.out.println();
        System.out.println("Enter roll number: ");
        int num = sc.nextInt();
        try (FileInputStream fi = new FileInputStream("Student.txt");//enter file name including file path
             ObjectInputStream oi = new ObjectInputStream(fi)) {
            Student obj;
            while (true) {
                try {
                    obj = (Student) oi.readObject();
                    if (obj.roll == num) {
                        obj.disp();
                        return;
                    }
                } catch (EOFException e) {
                    break;
                }
            }
        }
        System.out.println("Details not found");
    }

    void result_det() throws IOException, ClassNotFoundException {
        int mp = 0, mf = 0, sp = 0, sf = 0, ep = 0, ef = 0;
        try (FileInputStream fi = new FileInputStream("Student.txt");//enter file name including file path
             ObjectInputStream oi = new ObjectInputStream(fi)) {
            Student obj;
            int choice;
            do {
                System.out.println("Choose following option");
                System.out.println("1. Check Science List");
                System.out.println("2. Check Math List");
                System.out.println("3. Check English List");
                System.out.println("4. Exit");
                System.out.print("Choice: ");
                choice = sc.nextInt();

                // Reset counters
                mp = mf = sp = sf = ep = ef = 0;

                switch (choice) {
                    case 1:
                    	System.out.println();
                        while (true) {
                            try {
                                obj = (Student) oi.readObject();
                                if (obj.sub.equals("SCIENCE") && obj.marks > 200) {
                                    mp++;
                                }
                                if (obj.sub.equals("SCIENCE") && obj.marks < 200) {
                                    mf++;
                                }
                            } catch (EOFException e) {
                                break;
                            }
                        }
                        System.out.println("Total number of students pass in science subject: " + mp);
                        System.out.println("Total number of students fail in science subject: " + mf);
                        break;

                    case 2:
                    	System.out.println();
                        while (true) {
                            try {
                                obj = (Student) oi.readObject();
                                if (obj.sub.equals("MATH") && obj.marks > 200) {
                                    sp++;
                                }
                                if (obj.sub.equals("MATH") && obj.marks < 200) {
                                    sf++;
                                }
                            } catch (EOFException e) {
                                break;
                            }
                        }
                        System.out.println("Total number of students pass in math subject: " + sp);
                        System.out.println("Total number of students fail in math subject: " + sf);
                        break;

                    case 3:
                    	System.out.println();
                        while (true) {
                            try {
                                obj = (Student) oi.readObject();
                                if (obj.sub.equals("ENGLISH") && obj.marks > 200) {
                                    ep++;
                                }
                                if (obj.sub.equals("ENGLISH") && obj.marks < 200) {
                                    ef++;
                                }
                            } catch (EOFException e) {
                                break;
                            }
                        }
                        System.out.println("Total number of students pass in english subject: " + ep);
                        System.out.println("Total number of students fail in english subject: " + ef);
                        break;

                    case 4:
                        System.out.println("Exit");
                        break;

                    default:
                        System.out.println("Wrong choice");
                        break;
                }
            } while (choice != 4);
        }
    }
}

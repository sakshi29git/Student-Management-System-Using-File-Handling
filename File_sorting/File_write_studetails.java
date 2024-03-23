package File_sorting;

import java.io.*;
import java.util.Scanner;

public class File_write_studetails {

    void writedet() throws IOException {
        try (FileOutputStream fw = new FileOutputStream("C:\\Users\\lenovo\\Desktop\\Sakshi Java CDAC\\Student_file_sorting\\src\\File_sorting\\Student Details.txt", true);
             ObjectOutputStream ow = new ObjectOutputStream(fw)) {
            Student_details obj = new Student_details();
            ow.writeObject(obj);
            System.out.println("Details added Successfully.");
        }
    }

    void readet() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\lenovo\\Desktop\\Sakshi Java CDAC\\Student_file_sorting\\src\\File_sorting\\Student Details.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line); // Display each line of the file
            }
            System.out.println("Details found Successfully.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }


    // Method to find the result
    // Implement this method according to your requirements

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        File_write_studetails obj = new File_write_studetails();
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Add Details in file");
            System.out.println("2. Display Details");
            System.out.println("3. Find result");
            System.out.println("4. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    obj.writedet();
                    break;
                case 2:
                    obj.readet();
                    break;
                case 3:
                    // Implement find_res() method call here
                    System.out.println("Find result option is not implemented yet.");
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Wrong choice. Please enter a valid option.");
                    break;
            }
        } while (choice != 4);

        sc.close();
    }
}

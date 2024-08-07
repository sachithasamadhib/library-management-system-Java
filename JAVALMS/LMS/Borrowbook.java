package LMS;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Borrowbook {
    public void Borrowbook(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("**********Borrow A Book**********");
        System.out.println("How many books do you want to Borrow?");
        int count = scanner.nextInt();
        scanner.nextLine();   
        for (int i = 0; i < count; i++) {
            try {
                System.out.print("Enter book Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter book ISBN: ");
                String ISBN = scanner.next();
                scanner.nextLine(); 
                System.out.print("Enter book Borrow date: ");
                String borrowdate = scanner.nextLine();
                System.out.print("Enter book return date: ");
                String returndate = scanner.nextLine();
                String filePath = "BookBorrow.txt";

                FileWriter fileWriter = new FileWriter(filePath, true);

                fileWriter.write("Name: " + name + "\n");
                fileWriter.write("ISBN: " + ISBN + "\n");
                fileWriter.write("Borrow Date: " + borrowdate + "\n");
                fileWriter.write("Return Date: " + returndate + "\n");
                fileWriter.write("----------------------------\n");

                System.out.println("The Book Borrowed successfully.");
                System.out.println("                                             ");
              
                fileWriter.close();

            } catch (IOException cant) {
                System.out.println("Can not Borrow the Book, please try again: ");
            }
        }
    }            

        
    }


package LMS;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 * Users 
 */
public class Users {
    public void Users(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("**********Make a Account**********");
        System.out.println("                                  ");
        try {
            System.out.print("Enter your Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter your Address: ");
            String Address = scanner.next();
            scanner.nextLine(); 
            System.out.print("Enter phone number: ");
            String number = scanner.nextLine();
            System.out.print("Enter Email: ");
            String email = scanner.nextLine();
            System.out.print("Payment: ");
            float payment = scanner.nextFloat();
            if (payment == 2500.00 || payment> 2500.00 )
            {
                System.out.println("Your Payment successful");
            }
            else{
                System.out.println("please pay Rs2500.00 for payment");
                System.out.println("please try again next time");
                System.out.println("Exiting...");
                scanner.close();
                System.exit(0);
            }

            scanner.nextLine();

            String filePath = "user.txt";

            FileWriter fileWriter = new FileWriter(filePath, true);

            fileWriter.write("Name: " + name + "\n");
            fileWriter.write("Address: " + Address + "\n");
            fileWriter.write("phone number: " + number  + "\n");
            fileWriter.write("Email: " + email  + "\n");
            fileWriter.write("Payment: " + payment  + "\n");
            fileWriter.write("----------------------------\n");



            System.out.println("Your registration is successfully.");
            fileWriter.close();

        } catch (IOException cant) {
            System.out.println("Can not Registration, please try again: ");
        }
    }
}            
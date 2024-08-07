package LMS;

import java.util.Scanner;
public class Dashboard {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("                                                                 ");
        System.out.println("************Wellcome to the Library Management System************");
        System.out.println("**************Select a one from below options *******************");
        System.out.println("                                                                 ");
        System.out.println("1. Login as an admin");
        System.out.println("2. Login as an  User");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
              Adminview n = new Adminview();
               n.Admin();
                 
                break;
            case 2:
               Userview u = new Userview();
               u.User();
                break;
            case 3:
            System.out.println("Exiting...");
            scanner.close();
            System.exit(0);
                break;

             default:
             System.out.println("Invalid choice. Please select again.");
              

    }   

    }
}
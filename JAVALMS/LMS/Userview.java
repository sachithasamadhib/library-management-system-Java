package LMS;
import java.util.Scanner;

public class Userview {
    public void User(){
      Scanner scanner = new Scanner(System.in);
            System.out.println("                                                                 ");
            System.out.println("************Wellcome to the Library Management System************");
            System.out.println("***************************User View*****************************");
            System.out.println("**************Select a one from below options *******************");
            System.out.println("                                                                 ");
            System.out.println("1. Search Book");
            System.out.println("2. Make a Account");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. View Account Information");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
              case 1:
                Searchbook sc = new Searchbook();
                sc.Searchbook();
               break;
            
              case 2:
                 Users u = new Users();
                 u.Users();
               break;

              case 3:
                Borrowbook bk = new Borrowbook();
                bk.Borrowbook();
               break;

              case 4:
               Returnbook rb = new Returnbook();
               rb.Returnbook();
               break;

              case 5:
               Accountview ac =new Accountview();
               ac.Accountview();

               break;

              case 6:
               System.out.println("Exiting...");
               scanner.close();
               System.exit(0);
               break;

              default:
              System.out.println("Invalid choice. Please select again.");
              break;
               
            }
            
}
}


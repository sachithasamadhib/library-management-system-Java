package LMS;
import java.util.Scanner;

public class Adminview {
    public void Admin() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the username and password");
        String username = scanner.nextLine();
        String password = scanner.nextLine();

        if (username.equals("yasith") && password.equals("1")) {
            System.out.println("                                                                 ");
            System.out.println("************Welcome to the Library Management System*************");
            System.out.println("***************************Admin View****************************");
            System.out.println("**************Select a one from below options *******************");
            System.out.println("                                                                 ");
            System.out.println("1. Search Book");
            System.out.println("2. Add Book");
            System.out.println("3. Update Book Information");
            System.out.println("4. Manage Users");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                     BookSearch bs = new BookSearch();
                     bs.BookSearch();
                     break;

                  case 2:
                    System.out.println("                               ");
                    System.out.println("**********Add A Book**********");
                    System.out.println("                               ");
                    System.out.println("which type of book do you want to add?");
                    System.out.println("                                         ");
                    System.out.println("1. Books");
                    System.out.println("2. Magazine");
                    System.out.println("3. Newspaper");
                    System.out.println("4. Journals");
                    int bookType = scanner.nextInt();
                    scanner.nextLine();  
                    switch (bookType){
                        case 1:
                            bookself B = new bookself();
                            B.Books();
                            break;

                        case 2:
                            bookself M = new bookself();
                            M.Magazine();
                            break;

                        case 3:
                            bookself N = new bookself();
                            N.Newspaper();
                            break;

                        case 4:
                            bookself J = new bookself();
                            J.Journals();
                            break;

                        default:
                            System.out.println("Invalid Book Type. Please select again");
                            break;
                    }
                    break;

                case 3:
                    UpdateBook ub = new UpdateBook();
                    ub . updateBook();;
                    break;

                case 4:
                    Usermanage Um = new Usermanage();
                     Um.Usermanage();
                     break;

                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please select again.");
                    break;
            } 
        } else {
            System.out.println("Invalid username and password");
        } 
    }
}

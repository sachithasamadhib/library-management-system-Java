package LMS;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class bookself {
    
    public void Books() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("**********Add A Book**********");
        System.out.println("How many books do you want to add?");
        int count = scanner.nextInt();
        scanner.nextLine();   

        for (int i = 0; i < count; i++) {
            try {
                System.out.print("Enter book Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter book author: ");
                String author = scanner.nextLine();
                System.out.print("Enter book ISBN: ");
                String ISBN = scanner.next();
                scanner.nextLine(); 
                System.out.print("Enter book Price: ");
                float price = scanner.nextFloat();
                scanner.nextLine();
                System.out.print("Enter book Publisher Name: ");
                String publisherName = scanner.nextLine();
                System.out.print("Enter Released year: ");
                String releasedYear = scanner.nextLine();

                String filePath = "BookDetail.txt";

                FileWriter fileWriter = new FileWriter(filePath, true);

                fileWriter.write("Name: " + name + "\n");
                fileWriter.write("Author: " + author + "\n");
                fileWriter.write("ISBN: " + ISBN + "\n");
                fileWriter.write("Price: " + price + "\n");
                fileWriter.write("Publisher Name: " + publisherName + "\n");
                fileWriter.write("Released Year: " + releasedYear + "\n");
                fileWriter.write("----------------------------\n");

                System.out.println("The Book Added successfully.");
                fileWriter.close();

            } catch (IOException cant) {
                System.out.println("Can not add the Book, please try again: ");
            }
        }
    }            

    public void Magazine() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("                                     ");
        System.out.println("*************Add A Magazine**********");
        System.out.println("                                     ");
        System.out.println("How many Magazine do you want to add?");
        int count = scanner.nextInt();
        scanner.nextLine();  

        for (int i = 0; i < count; i++) {
            try {
                System.out.print("Enter Magazine Name: ");
                String Magazinename = scanner.nextLine();
                System.out.print("Enter Magazine author: ");
                String Magazineauthor = scanner.nextLine();
                System.out.print("Enter Magazine ISBN: ");
                String MagazineISBN = scanner.next();
                scanner.nextLine(); 
                System.out.print("Enter Magazine Price: ");
                float Magazineprice = scanner.nextFloat();
                scanner.nextLine();
                System.out.print("Enter Magazine Publisher Name: ");
                String MagazinepublisherName = scanner.nextLine();
                System.out.print("Enter Released year: ");
                String MagazinereleasedYear = scanner.nextLine();

                String filePath = "MagazineDetail.txt";

                FileWriter fileWriter = new FileWriter(filePath, true);

                fileWriter.write("Magazine Name: " + Magazinename + "\n");
                fileWriter.write("Magazine Author: " + Magazineauthor + "\n");
                fileWriter.write("Magazine ISBN: " + MagazineISBN + "\n");
                fileWriter.write("Magazine Price: " + Magazineprice + "\n");
                fileWriter.write("Magazine Publisher Name: " + MagazinepublisherName + "\n");
                fileWriter.write("Magazine Released Year: " + MagazinereleasedYear + "\n");
                fileWriter.write("----------------------------\n");

                System.out.println("The Magazine Added successfully.");
                fileWriter.close();

            } catch (IOException cant) {
                System.out.println("Can not add the Magazine, please try again: ");
            }
        }
    }            
        
    public void Newspaper() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("                                     ");
        System.out.println("*************Add A Newspaper*********");
        System.out.println("                                     ");
        System.out.println("How many Newspapers do you want to add?");
        int count = scanner.nextInt();
        scanner.nextLine();  

        for (int i = 0; i < count; i++) {
            try {
                System.out.print("Enter Newspaper Name: ");
                String NewspaperName = scanner.nextLine();
                System.out.print("Enter Newspaper ISBN: ");
                String NewspaperISBN = scanner.next();
                scanner.nextLine(); 
                System.out.print("Enter Newspaper Price: ");
                float Newspaperprice = scanner.nextFloat();
                scanner.nextLine();
                System.out.print("Enter Newspaper Publisher Name: ");
                String NewspaperpublisherName = scanner.nextLine();
                System.out.print("Enter Newspaper year: ");
                String NewspaperRleasedYear = scanner.nextLine();

                String filePath = "NewspaperDetail.txt";

                FileWriter fileWriter = new FileWriter(filePath, true);

                fileWriter.write("Newspaper Name: " + NewspaperName + "\n");
                fileWriter.write("Newspaper ISBN: " + NewspaperISBN + "\n");
                fileWriter.write("Newspaper Price: " + Newspaperprice + "\n");
                fileWriter.write("Newspaper Publisher Name: " + NewspaperpublisherName + "\n");
                fileWriter.write("Newspaper Released Year: " +NewspaperRleasedYear + "\n");
                fileWriter.write("----------------------------\n");

                System.out.println("The Newspaper Added successfully.");
                fileWriter.close();

            } catch (IOException cant) {
                System.out.println("Can not add the Newspaper, please try again: ");
            }
        }
    }            
        
    public void Journals() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("                                     ");
        System.out.println("*************Add A Journal***********");
        System.out.println("                                     ");
        System.out.println("How many Journals do you want to add?");
        int count = scanner.nextInt();
        scanner.nextLine();  

        for (int i = 0; i < count; i++) {
            try {
                System.out.print("Enter Journal Name: ");
                String JournalName = scanner.nextLine();
                System.out.print("Enter Journal ISBN: ");
                String JournalISBN = scanner.next();
                scanner.nextLine(); 
                System.out.print("Enter Journal Price: ");
                float Journalprice = scanner.nextFloat();
                scanner.nextLine();
                System.out.print("Enter Journal Publisher Name: ");
                String JournalpublisherName = scanner.nextLine();
                System.out.print("Enter Journal year: ");
                String JournalRleasedYear = scanner.nextLine();

                String filePath = "JournalDetail.txt";

                FileWriter fileWriter = new FileWriter(filePath, true);

                fileWriter.write("Journal Name: " + JournalName + "\n");
                fileWriter.write("Journal ISBN: " + JournalISBN + "\n");
                fileWriter.write("Journal Price: " + Journalprice + "\n");
                fileWriter.write("Journal Publisher Name: " + JournalpublisherName + "\n");
                fileWriter.write("Journal Released Year: " +JournalRleasedYear + "\n");
                fileWriter.write("----------------------------\n");

                System.out.println("The Journal Added successfully.");
                fileWriter.close();

            } catch (IOException cant) {
                System.out.println("Can not add the Journal, please try again: ");
            }
        }
    }
}

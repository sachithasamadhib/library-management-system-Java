package LMS;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Searchbook {
    public void Searchbook(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the bookself name: ");
        System.out.println("BookDetail.txt, JournalDetail.txt, MagazineDetail.txt, NewspaperDetail.txt");
        String bookselfename = scanner.nextLine();
        System.out.print("Enter the book name: ");
        String Name = scanner.nextLine();

        try {
            File file = new File(bookselfename);
            scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains(Name)) {
                    String[] parts = line.split("Name: ");
                    if (parts.length > 1) {
                        String fbn = parts[1].trim();
                        System.out.println("Book Name: " + fbn);
                        System.out.println("Book found go to the " +bookselfename);


                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Book not found: ");
        } 
        }
    }

    

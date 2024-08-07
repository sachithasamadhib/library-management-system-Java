package LMS;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class BookSearch {
    public void BookSearch(){     
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the filename:(BookDetail,JournalDetail,MagazineDetail,NewspaperDetail):");
        String filename = scanner.nextLine();
      

        System.out.print("Enter the Book to search: ");
        String Bookname = scanner.nextLine();

        try {
            File bf = new File(filename);
            scanner = new Scanner(bf);
            
            
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.contains(Bookname)) {
                    System.out.println("Book found in the : " + filename);
                }
            }
        } catch (FileNotFoundException bf) {
            System.out.println("Book not found in : ");
            bf.getMessage();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}

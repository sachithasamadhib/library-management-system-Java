package LMS;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class UpdateBook {

    public void updateBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of The Book Categories:");
        System.out.println("BookDetail.txt, JournalDetail.txt, MagazineDetail.txt, NewspaperDetail.txt");
        String categories = scanner.nextLine();

        displayFileDetails(categories);

        scanner.close();
    }

    private void displayFileDetails(String categories) {
        try {
            File file = new File(categories);

            if (!file.exists() || !file.isFile()) {
                System.out.println("The Book Category can not be found");
                return;
            }

            Scanner fileScanner = new Scanner(file);
            System.out.println("********** " + categories + " Details **********");

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }

            fileScanner.close();
        } catch (IOException e) {
            System.out.println("Error reading " + categories);
        }
    }
}

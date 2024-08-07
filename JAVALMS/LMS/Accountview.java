package LMS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Accountview {
    public void Accountview(){
        try{
        String file = "user.txt";
        File f = new File(file);
        Scanner sc = new Scanner(f);
        System.out.println("**********Account Data**********");
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }

        sc.close();
    } catch (FileNotFoundException err){
        System.out.println("Error reading the Account");
    }
    }
}z

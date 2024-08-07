package LMS;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Usermanage {
    public void Usermanage(){
    try{
        String file = "user.txt";
        File f = new File(file);
        Scanner sc = new Scanner(f);
        System.out.println("**********User Data**********");
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(line);
        }

        sc.close();
    } catch (FileNotFoundException err){
        System.out.println("Error reading the user data file");
    }

    }
}

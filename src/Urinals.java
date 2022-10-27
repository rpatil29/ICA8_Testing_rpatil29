package ICA8_Testing_rpatil29.src;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * SER-515 ICA8 Urinals class
 *
 * @author Rushikesh Patil, rpatil29@asu.edu
 * @version 1.0
 * @since 10-27-2022
 */
public class Urinals {

    public static int goodString(String str)
    {
        System.out.println("Not yet Implemented");
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("Main Function");
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose: \n 1. File Input \n 2. Console(String) Input");
        int choice = sc.nextInt();
        ArrayList<Integer> res = new ArrayList<>(); //Result will be stored in Array list
        if(choice==2){
            //String input here
            System.out.println("Enter the urinals, (-1 to print output and exit the program)");
            String str = sc.next();
            while(str!="-1")
            {
                res.add(goodString(str));
            }
        } else if (choice==1) {
            //File input code here
            System.out.println("Enter the path to file here");
            String path = sc.next();
            BufferedReader reader;
            try{
                reader = new BufferedReader(new FileReader(path));
                String str = reader.readLine();
                while(str!=null || str!="-1"){
                    res.add(goodString(str));
                    str = reader.readLine();
                }
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        //Code to print Result
        for(int i : res)
            System.out.println(i);

    }
}

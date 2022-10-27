package ICA8_Testing_rpatil29.test;

import ICA8_Testing_rpatil29.src.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UrinalsTest {
    public static void main(String[] args) {
        System.out.println("Main Function");
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose: \n 1. File Input \n 2. Console(String) Input");
        int choice = sc.nextInt();
        List<Integer> res = new ArrayList<>(); //Result will be stored in Array list
        if (choice == 2) {
            //String input here2

            System.out.println("Enter the urinals, (-1 to print output and exit the program)");
            String str = "";
            str = sc.next();
            while(!str.equals("-1")){
                res.add(Urinals.goodString(str));
                str = sc.next();
            }
        } else if (choice == 1) {
            //File input code here
            System.out.println("Enter the path to file here");
            String path = sc.next();
            BufferedReader reader;
            try {
                reader = new BufferedReader(new FileReader(path));
                String str = reader.readLine();
                while (str != null || str != "-1") {
                    res.add(Urinals.goodString(str));
                    str = reader.readLine();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        for (int i : res)
            System.out.println(i);
    }
}
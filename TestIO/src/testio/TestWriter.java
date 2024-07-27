package testio;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class TestWriter {
    public static void main(String[] args) {
        try{
            File f = new File("/home/administrator/Documents/j2se/xyz.txt");
            FileWriter fw = new FileWriter(f);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Some text");
            String data = sc.nextLine();
            fw.write(data);
            System.out.println("Operation Success...");        
            fw.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}

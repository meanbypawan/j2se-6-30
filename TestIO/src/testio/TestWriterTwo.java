package testio;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class TestWriterTwo {
public static void main(String[] args) {
       File f = new File("/home/administrator/Documents/j2se/xyz.txt");
          
       try(FileWriter fw = new FileWriter(f);){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Some text");
            String data = sc.nextLine();
            fw.write(data);
            System.out.println("Operation Success...");        
             
       }
        catch(Exception e){
            e.printStackTrace();
        }
    }    
}

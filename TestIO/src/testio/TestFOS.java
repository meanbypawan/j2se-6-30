package testio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TestFOS {
    public static void main(String[] args) {
      try{  
        File f = new File("/home/administrator/Documents/j2se/abc.txt");
        
        FileOutputStream fout = new FileOutputStream(f,true);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Some Text");
        String text = sc.nextLine();
        byte data[] = text.getBytes();
        fout.write(data);
          System.out.println("Operation success..");
      }
      catch(IOException e){
          e.printStackTrace();
      }
     }
    
}

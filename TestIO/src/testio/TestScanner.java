package testio;

import java.io.File;
import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        try{
          File f = new File("/home/administrator/Documents/j2se/TestIO/src/testio/TestWriteObject.java");
          Scanner sc = new Scanner(f);
          while(sc.hasNextLine()){
             String data =  sc.nextLine();
              System.out.println(data);
          }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}

package testio;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class TestOIS {
    public static void main(String[] args) {
        try{
         File f = new File("/home/administrator/Documents/j2se/customer.txt");
            FileInputStream fin = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fin);
            Object o = ois.readObject();
            Customer c = (Customer)o;
            System.out.println(c);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}

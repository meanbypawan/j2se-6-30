package testio;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class TestWriteObject {
    public static void main(String[] args) {
        try{
            File f = new File("/home/administrator/Documents/j2se/customer.txt");
            if(f.exists()){
                FileOutputStream fout = new FileOutputStream(f);
                ObjectOutputStream oos = new ObjectOutputStream(fout);
                Customer c = new Customer(1, "ABC", "abc22323dsd", "9009111222", 21, "Vijay nagar, indore");
                oos.writeObject(c);
                System.out.println("Operation Success...");
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}

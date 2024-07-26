package testio;

import java.io.File;
import java.io.FileInputStream;

public class TestFIS {
    public static void main(String[] args) {
        try{
            File f = new File("/home/administrator/Documents/j2se/abc.txt");
            FileInputStream fin = new FileInputStream(f);
            String data = "";
            while(true){
              int x = fin.read();
              if(x == -1)
                  break;
              data =  data + (char)x;
            }
            System.out.println(data);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}

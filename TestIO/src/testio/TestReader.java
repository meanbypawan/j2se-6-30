package testio;

import java.io.File;
import java.io.FileReader;

public class TestReader {
    public static void main(String[] args) {
        try{
            File f = new File("/home/administrator/Documents/j2se/TestIO/src/testio/TestWriteObject.java");
            FileReader fr = new FileReader(f);
            String data = "";
            while(true){
                int x = fr.read();
                if(x==-1)
                    break;
                data = data +(char)x;
            }
            System.out.println(data);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
}

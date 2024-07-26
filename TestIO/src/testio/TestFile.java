package testio;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFile {
    public static void main(String[] args) {
        File f = new File("/home/administrator/Documents/j2se/abc.txt");
        System.out.println("Name : "+f.getName());
        System.out.println("Path : "+f.getAbsolutePath());
        System.out.println("canRead : "+f.canRead());
        System.out.println("canWrite : "+f.canWrite());
        System.out.println("canExecute : "+f.canExecute());
        System.out.println("isHidden : "+f.isHidden());
        System.out.println("size : "+f.length());
        
        long time = f.lastModified();
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
        String dateTime = sd.format(new Date(time));
        System.out.println("lastModified : "+dateTime);
    }
    
}

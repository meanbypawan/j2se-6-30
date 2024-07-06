/*
   String method
    length() : int
    toUpperCase(): String
    toLowerCase(): String
    trim(): String
    compareTo(String) : int [0,+,-]
    compareToIgnoreCase(String) : int
    substring(int index) : String
    substring(int begIndex, int endIndex) : String
    splite(String/char): String[]
 */
import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter String");
       String s1 = sc.next();
       System.out.println("Length : "+s1.length());

       System.out.println("Enter String to convert in uppercase");
       s1 = sc.next();
       System.out.println("Uppercase String : "+s1.toUpperCase());
       
    }
}
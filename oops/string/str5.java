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
       
       System.out.println("Enter 1st string");
       String s1 = sc.next();
       
       System.out.println("Enter 2nd string");
       String s2 = sc.next();

       //int x = s1.compareTo(s2);
       int x = s1.compareToIgnoreCase(s2);
       if(x==0)
        System.out.println("Both are same");
       else if(x > 0)
             System.out.println(s1+" > "+s2);
            else
             System.out.println(s1+" < "+s2);  
    }
}
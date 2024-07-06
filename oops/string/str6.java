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
        //           0123456789012345678901234567890
        String s1 = "Indore is cleanest city of india";
        //String s2 = s1.substring(7);
        String s2 = s1.substring(7,18);
        System.out.println(s2);
    }
}
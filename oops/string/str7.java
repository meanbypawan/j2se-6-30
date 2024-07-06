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
        String s1 = "Indore-is-cleanest-city-of-india";
        String items[] = s1.split("\\$");
        for(String element: items)
         System.out.println(element);
    }
}
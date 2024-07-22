/*
  try{
    s----1; // IME
    s----2; // NP
    s----3;
  }
  catch(InputMismatchException e){
  }
  catch(NullPointerException e){
  }
  catch(Exception e){
  }
 */
import java.util.Scanner;
import java.util.InputMismatchException;
class TestMain{
    public static void main(String arg[]){
      Scanner sc  = new Scanner(System.in);
      try{
        System.out.println("Enter 1st value..");
        int a = sc.nextInt();

        System.out.println("Enter 2nd value..");
        int b = sc.nextInt();

        int c = a / b;
        System.out.println("Result : "+c);

        System.out.println("Enter String");
        String s = sc.next();

        System.out.println("Char At 5th index : "+s.charAt(5));
      }
      catch(ArithmeticException e){
        System.out.println("Denominator can't be zero...");
      }
      catch(InputMismatchException e){
        System.out.println("Please enter integer only...");
      }
      catch(Exception e){
        System.out.println("Oops! something went wrong...");
      }
      System.out.println("At the end.....");
    }
}
/*
  try{}
  catch(){}
  catch(){}
  finally{}
 */
import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      try{
        System.out.println("Enter 2 number");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a/b;
        System.out.println("Result : "+c);
      }
      catch(Exception e){
        System.out.println("Catch Executed | Exception Caught");
      }
      finally{
        System.out.println("Finally Block executed...");
      }
      System.out.println("At the end..");
    }
}
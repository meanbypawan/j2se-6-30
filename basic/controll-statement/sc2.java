import java.util.Scanner;
class TestMain{
    public static void main(String agres[]){
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter 1st value");
      int x = sc.nextInt();
    
      System.out.println("Enter 2nd value");
      int y = sc.nextInt();

      System.out.println("Addition : "+(x+y));
    }
}
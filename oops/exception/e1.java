import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 1st value");
        int a = sc.nextInt();
    
        System.out.println("Enter 2nd value");
        int b = sc.nextInt();

        int c = a / b;
        System.out.println("Result : "+c);

        System.out.println("At the end..");
    }
}
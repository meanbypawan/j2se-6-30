import java.util.Scanner;
class Operation{
    private int a;
    private int b;
    public void setData(int x, int y){
        a = x;
        b = y;
    }
    public void add(){
        System.out.println("Addition : "+(a+b));
    }
    public void sub(){
        System.out.println("Subtraction : "+(a-b));
    }
}
class TestMain{
    public static void main(String args[]){
       Operation obj = new Operation();// obj {a:20,b:10}
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter 1st value");
       int a = sc.nextInt();
       System.out.println("Enter 2nd value");
       int b = sc.nextInt();
       
       obj.setData(a,b); // a = 20 ,b = 10       
       obj.add();
    }
}
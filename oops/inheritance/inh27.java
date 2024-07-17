/*
   Univerisity (RGPV) : Interface
     dc();
     pg();

   Colleges (class)
    AITR implements RGPV
      dc(){--}
      pg(){--}
    IPS implements RGPV
      dc(){---}
      pg(){---}
    LNCT implments RGPV
      dc(){----}
  -----------------------------------------
 */
import java.util.Scanner;
interface Shape{
    void getArea();
}

class Circle implements Shape{
   public void getArea(){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter radius");
     float radius = sc.nextFloat();
     System.out.println("Circle Area : "+(3.14 * radius * radius));
   }   
}
class Rectangle implements Shape{
    public void getArea(){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter length & width");
       int l = sc.nextInt();
       int w = sc.nextInt();
       System.out.println("Rectangle Area : "+(l*w));
    }
}
class TestMain{
    public static void main(String args[]){
        Shape s = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for circle");
        System.out.println("Press 2 for rectangle");
        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();
        if(choice == 1)
          s = new Circle();
        else if(choice == 2)
          s = new Rectangle();
        
        if(s!=null)
          s.getArea();     
    }
}
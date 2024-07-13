
/*
   m1();
   m2();
   m3(){}
   m3(){}
 */
abstract class A{
    abstract public void m1();
    abstract public void m2();
    public void wish(){
        System.out.println("GM....");
    }
    public static void greetUser(){
        System.out.println("Hello...");
    }
}

class B extends A{
   public void m1(){
     System.out.println("m1()-executed...");
   } 
   public void m2(){
     System.out.println("m2()-executed...");
   }
}
class TestMain{
    public static void main(String args[]){
        A obj = new B();
        obj.m1();
        obj.m2();
        obj.wish();

        A.greetUser();
    }
}
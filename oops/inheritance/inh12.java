/*
   Overriding :-
    
 */
class A{
    public void wish(){
        System.out.println("GM...");
    }
}
class B extends A{
  public void wish(){
    System.out.println("GE...");
  }
}
class TestMain{
    public static void main(String args[]){
        B obj = new B();
        obj.wish();
    }
}
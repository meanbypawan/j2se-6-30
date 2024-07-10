class A{
    public A(int x){
        System.out.println("A-parameter....");
    }
}
class B extends A{
   public B(){
     super(100);
     System.out.println("B-default...");
   }
   public B(int x){
    super(x);
    System.out.println("B-parameter...");
   }
}
class TestMain{
    public static void main(String args[]){
        B obj = new B();
     
    }
}
class A{
    public A(){
        System.out.println("A-default...");
    }
    public A(int x){
        System.out.println("A-parameter....");
    }
}
class B extends A{
   public B(){
     //super(100);
     super();
     System.out.println("B-default...");
   }
}
class TestMain{
    public static void main(String args[]){
        B obj = new B();
     
    }
}
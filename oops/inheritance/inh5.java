class A{
    public A(){
        System.out.println("A-default..");
    }
    public A(int x){
        System.out.println("A-parameter....");
    }
}
class B extends A{
   public B(){
    System.out.println("B-default...");
   }
   public B(int x){
    System.out.println("B-parameter...");
   }
}
class TestMain{
    public static void main(String args[]){
        //B obj = new B();
        B obj = new B(100);
    }
}
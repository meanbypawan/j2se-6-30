class A{
    static{
        System.out.println("A-Static-Block");
    }
    { // Initializer block
      System.out.println("A-Initializer Block");
    }
    public A(){
        System.out.println("A-default...");
    }
    
}
class B extends A{
    static{
        System.out.println("B-Static-Block");
    }
    { // Initializer block
      System.out.println("B-Initializer Block");
    }
    public B(){
        System.out.println("B-default...");
    }

}
class TestMain{
    public static void main(String args[]){
        new B();
    }
}
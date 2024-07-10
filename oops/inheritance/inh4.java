class A{
    public A(){
        System.out.println("A-default...");
    }
}
class B extends A{
    public B(){
        System.out.println("B-default...");
    }
}
class C extends B{
    public C(){
        System.out.println("C-default...");
    }
}
class TestMain{
    public static void main(String args[]){
        //B obj = new B();
        C obj = new C();
    }
}
class A{
    static{
        System.out.println("Block-A");
    }
}
class B{
    static{
        System.out.println("Block-B");
    }
}
class C{
    public static void main(String args[]){
        B obj = new B();
        B obj2 = new B();
        new A();
        System.out.println("Main end");
    }
}
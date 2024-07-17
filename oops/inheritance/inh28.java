interface I{
    void m1();
    default void wish(){
        System.out.println("GM...");
    }
    static void greetUser(){
        System.out.println("Hi..");
    }
   
}

class Test implements I{
    public void m1(){
        System.out.println("m1()-executed...");
    }
    public void wish(){
        System.out.println("Hello...");
    }
}
class TestMain{
    public static void main(String args[]){
        I obj = new Test();
        obj.m1();
        obj.wish();

        I.greetUser();
    }
}
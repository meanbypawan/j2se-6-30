// Constructor chaining
class A{
    public A(int x, int y){
        this(x);
        System.out.println("I-I version");
     }
    public A(int x){
        this();
        System.out.println("I- version");
    }
    public A(){
        System.out.println("Default version");
    }
}
class TestMain{
    public static void main(String args[]){
        new A(20,10);
    }
}
// Constructor chaining
class A{
    public A(int x, int y){
        this(100);
        System.out.println("I-I version");
     }
    public A(int x){
        this(20,10);
        System.out.println("I- version");
    }
}
class TestMain{
    public static void main(String args[]){
        new A(20,10);
    }
}
// Constructor Overloading
// this(), method - overloading
class A{
   public A(String x){
    System.out.println("String wala constructor executed...");
   }
   public A(boolean x){
    System.out.println("Boolean parameter executed...");
   }
   public A(){
    System.out.println("Default construcotr executed....");
   }
}
class TestMain{
    public static void main(String args[]){
        A obj = new A("hello");
        A obj2 = new A(true);
        A obj3 = new A();
    }
}
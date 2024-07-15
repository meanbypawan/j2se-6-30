// Static method are hidden but not overridden
class A{
    public static void wish(){
        System.out.println("Hello A");
    }
}
class B extends A{
   public static void wish(){
    System.out.println("Hello B");
   }
}
class TestMain{
    public static void main(String args[]){
        A obj = new B();
        obj.wish();
    }
}
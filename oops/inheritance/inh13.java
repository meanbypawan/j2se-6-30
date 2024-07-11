class A{
    public void wish(){
        System.out.println("A-wish");
    }
}
class B extends A{
  public void wish(){
    System.out.println("B-wish");
  }
}
class TestMain{
    public static void main(String args[]){
       A obj = new B();
       obj.wish();
       /*
       A obj = new A();
       obj.wish();
       B obj2 = new B();
       obj2.wish();
       */
    }
}
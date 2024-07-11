class A{
    public void wish(){
        System.out.println("A-wish");
    }
    public void m2(){
        System.out.println("A-m2()");
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
       obj.m2();
       /*
       A obj = new A();
       obj.wish();
       B obj2 = new B();
       obj2.wish();
       */
    }
}
class A{
    static class B{
        public void m1(){
            System.out.println("m1-executed..");
        }
    }
    class C{
        public void wish(){
            System.out.println("GM...");
        }
    }
    public void m2(){
        System.out.println("m2()-executed..");
    }
}
class Child extends A{

}
class TestMain{
    public static void main(String args[]){
       Child.B obj = new Child.B();
       obj.m1();

       Child.C obj2 = new Child().new C();
       obj2.wish();     
    }
}
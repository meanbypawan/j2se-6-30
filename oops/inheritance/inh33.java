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
        A.B obj =  new A.B();
        obj.m1();

        A aobj = new A();
        A.C obj2 = aobj.new C();
        obj2.wish();
    }
}
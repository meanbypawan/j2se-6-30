class A{
    public void m1(int x){
        System.out.println("A-m1()");
    }
    public void m2(){
        System.out.println("A-m2()");
    }
    public void m3(){
        System.out.println("A-m3()");
    }
    public void m4(){
        System.out.println("A-m4()");
    }
}
class B extends A{
    public void m1(int y){
        System.out.println("B-m1()");
    }
    public void m3(){
        System.out.println("B-m3()");
    }
    public void m5(){
        System.out.println("B-m5()");
    }
}
class TestMain{
    public static void main(String args[]){
        A obj = new B();
        //obj.m1(100);
        //obj.m2();
        //obj.m3();
        obj.m5();
    }
}
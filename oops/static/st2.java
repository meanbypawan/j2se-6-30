class Test{
    public static void m1(){
        System.out.println("m1-executed...");
    }
}
class TestMain{
    public static void main(String args[]){
        //Test.m1();
        Test obj = new Test();
        obj.m1();
    }
}
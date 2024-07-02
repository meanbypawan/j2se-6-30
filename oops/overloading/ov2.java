/*
  In case of overloading compiler first go for
  perfect  matching If perfect matching is not found
  then compiler will go for suitable matching if suitable
  matching is not found then compiler will generate an error
 */
class Test{
    public void m1(float x){
      System.out.println("Float version");
    }
    public void m1(int x){
        System.out.println("Integer version");
    }
}
class TestMain{
    public static void main(String args[]){
       Test obj = new Test();
       obj.m1(20); // 1-parameter, type int 
    }
}
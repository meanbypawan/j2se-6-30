class Test{
  public void m1(int... x){
    System.out.println("Var-arg version");
  }  
  public void m1(int x){
    System.out.println("Integer version");
  }
}
class TestMain{
    public static void main(String args[]){
      new Test().m1(1,2,3);
    }
}
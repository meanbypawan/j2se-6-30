/*
  var-arg : Variable Length Argument
  zero or any number of argument
 */
class Test{
   public void m1(int... x){
     for(int element : x)
       System.out.println(element);
     System.out.println("m1-executed...");
   }
}
class TestMain{
    public static void main(String args[]){
      Test obj = new Test();
      obj.m1(20,10,20,4,5,6,7);
    }
}
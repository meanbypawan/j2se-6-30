/*
  class A{
  }
  ===>
  class A{
     public A(){}
   }
 */
class Test{
    public int m1(){
      try{
        /*----
          ----- 
        */
       if(true)
         throw new ArithmeticException();
       //return 100;
      }
      catch(Exception e){
        System.out.println("Catch Executed...");
        //return 200;
      }
      finally{
        System.out.println("Finally Executed....");
        //return 300;
      }
      return 400;
    }
}
class TestMain{
    public static void main(String args[]){
       Test obj = new Test();
       System.out.println(obj.m1());
    }
}
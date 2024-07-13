/*
  Overriding :-
   
   access-modifier retrurn-type methodName(argumet-list){
   }
 -----------------------------------------------
 can we chnage access modifier of method while overriding it ?
 Answer : yes we can change
 Condition :- Access modifier should be higher or equal to
 parent class method

 private
 <default>
 protected
 public   
 
 Error :-
   Attempting to assign weaker access priviledge ; was protected
 */
class A{
    protected void wish(){
        System.out.println("GM....");
    }
    public void m1(){
        System.out.println("A-m1()....");
    }
}
class B extends A{
    public void wish(){
        System.out.println("GN....");
    }
    public void m1(){
        System.out.println("B-m1()...");
    }
}
class TestMain{
    public static void main(String args[]){
        A obj = new B();
        obj.wish();
    }
}
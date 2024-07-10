/*
   Inheritance :-
    When object of one class acquire the properties of another object
    is called inheritance.
    ----------------------------------------
    By using existing thing, to develop something new
    but there should not be any changes in existing thing.
    Types of Inheritance :-
      a. Single level
      b. Multilevel
      c. Hierarichal inheritance
     Single parent concept 
     
     Example :-
      Let suppose there is an object(mobile p-hone)
      samsung J5 having two functionaity
      receivingCall() and rejectingCall()

      Let suppose there is an object(mobile p-hone)
      samsung J7 having three functionaity
      receivingCall() and rejectingCall(), camera()
 Developer (Java Team)
 Programmer
 End-user      
 */
class J5{
    public void receivingCall(){
        System.out.println("Call Received....");
    }
    public void rejectingCall(){
        System.out.println("Call Rejected...");
    }
}
class J7 extends J5{
  public void camera(){
    System.out.println("photo clicked...");
  }
}
class TestMain{
   public static void main(String args[]){
      J7 j7 = new J7();
      j7.receivingCall();
      j7.rejectingCall();
      j7.camera();
   }
}
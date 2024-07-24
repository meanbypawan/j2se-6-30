/*
1. try{}
   catch(Exception e){}
-------------------------------
try{}
catch(ArithmeticException e){}
catch(Exception e){}
-----------------------
try{}  // invalid
catch(Exception e){}
catch(AE e){}
------------------------
try{}
catch(Exception e){}
finally{}
-------------------------
try{}
catch(AE e){}
catch(Exception e){}
finally{}
----------------------
try{}
finally{}
------------------
try{} // invalid
catch(Exception e){}
finally{}
finally{}
-------------------------
try{
   try{}
   catch(Exception e){}
   finally{}
}   
catch(Exception e){
   try{}
   catch(){}
   finally{}
}
finally{
   try{}
   catch(){}
   finally{}
}
 Cheeku is cusomter ICICI Bank
 Cheeku has 50000 in his account
 ---> withdrawal()
 ---> atmTransaction()
 public class Exception{
    private String exceptionMessage;
    public Exception(String exceptionMessage){
      this.exceptioMessage = exceptionMessage;
    }
 }
 */
import java.util.Scanner;
// amount > bal
class InsufficientBalanceException extends Exception{
   public InsufficientBalanceException(){
    super("You have less money...");
   }
}
// amount > 10000
class TransactionLimitExceed extends Exception{
    public TransactionLimitExceed(){
        super("Limit Exceed | Amout is greater then 10000");
    }
}
class TestMain{
    public static void main(String args[]){
      int bal = 50000;
      Scanner sc = new Scanner(System.in);
      try{
        System.out.println("Enter Amount..");
        int amount  = sc.nextInt();
        if(amount > bal)
          throw new InsufficientBalanceException();
        
        if(amount > 10000)  
          throw new TransactionLimitExceed();

        bal -= amount;
        System.out.println("Witdrawal succes...");
        System.out.println("Remaining Bal : "+bal);  
      }
      catch(InsufficientBalanceException e){
        e.printStackTrace();
      }    
      catch(TransactionLimitExceed e){
        e.printStackTrace();
      }
      finally{
        System.out.println("Thank you to visit us");
      }
    }
}
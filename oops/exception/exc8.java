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
class ICICI{
    public void withdrawal() throws InsufficientBalanceException, TransactionLimitExceed{
        throw new InsufficientBalanceException();
        /*
          ------
          ------
         */
    }
}
class TestMain{
    public static void main(String args[]){
        ICICI obj = new ICICI();
        try{
          obj.withdrawal();
        }
        catch(Exception e){
         e.printStackTrace();           
        }  
    }
}
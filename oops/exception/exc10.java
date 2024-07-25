class TestMain{
    public static void main(String args[]){
        try{
            System.out.println("Inside Try...");
            throw new NullPointerException();
        }
        catch(Exception e){
            System.out.println("Catch Executed | Exception Caught");
        }
        System.out.println("At the end....");
    }
    
}
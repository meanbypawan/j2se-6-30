class First extends Thread{
    public void run(){
        try{
           for(int i=1; i<=5; i++){
            System.out.println("First Thread...");
            Thread.sleep(1200);
           }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
class TestMain{
    public static void main(String args[]) throws Exception{
       First t1 = new First();
       System.out.println("After create : "+t1.getState());
       t1.start();
       System.out.println("After start : "+t1.getState());
       System.out.println("isAlive : "+t1.isAlive());
       t1.join();
       System.out.println("After exe : "+t1.getState());   
       System.out.println("isAlive : "+t1.isAlive());
    }
}
/*
    class B{}
    class A extends B implements Runnable{
    }
    -----------------
    class C extends Thread{}
 */
class First implements Runnable{
   public void run(){
     try{
       for(int i=1; i<=5; i++){
        System.out.println("First Thread..");
        Thread.sleep(3000);
       }
     }
     catch(Exception e){
        e.printStackTrace();
     }
   }
}
class Second implements Runnable{
   public void run(){
     try{
       for(int i=1; i<=5; i++){
        System.out.println("Second Thread..");
        Thread.sleep(2200);
       }
     }
     catch(Exception e){
        e.printStackTrace();
     }
   }
}
class TestMain{
    public static void main(String args[]){
       Runnable t1 = new First();
       Runnable t2 = new Second();
       Thread thread1 = new Thread(t1);
       Thread thread2 = new Thread(t2);

       thread1.start();
       thread2.start();
    }
}
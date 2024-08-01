class First extends Thread{
    public void run(){
        try{
           for(int i=1; i<=5; i++){
             System.out.println(Thread.currentThread().getName());
           }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
// main-thread, thread-schedular, garbage-collector
// MAX_PRIORITY(10), MIN_PRIORITY(1), NORM_PRIORITY(5)
class TestMain{
    public static void main(String args[]){
      Thread thread = Thread.currentThread();
      thread.setPriority(3);
      System.out.println(thread.getName());
      First t1 = new First();
      //t1.setPriority(Thread.MAX_PRIORITY); // 1 to 10
      System.out.println(t1.getPriority());
    }
}
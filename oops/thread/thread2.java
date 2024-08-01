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
class Second extends Thread{
    public void run(){
        try{
           for(int i=1; i<=5; i++){
            System.out.println("Second Thread...");
            Thread.sleep(1800);
           }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
class Third extends Thread{
    public void run(){
        try{
           for(int i=1; i<=5; i++){
            System.out.println("Third Thread...");
            Thread.sleep(2100);
           }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
class TestMain{
    public static void main(String args[]){
        First t1 = new First();
        Second t2 = new Second();
        Third t3 = new Third();

        t1.start();
        t2.start();
        t3.start();
        /*
          main
          stack-area
          [t3,t2,t1,main]
          -------------------------
          main
          [main]

          t1
          [t1]

          t2
          [t2]
         */
    }
}
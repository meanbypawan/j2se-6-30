class Task{
    synchronized public void m1(){
        try{
           for(int i=1; i<=5; i++){
             System.out.println(Thread.currentThread().getName()+" executing m1()");
             Thread.sleep(3000);
           }  
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
class First extends Thread{
    Task task;
    public First(Task task){
        this.task = task;
    }
    public void run(){
      task.m1();
    }
}
class TestMain{
    public static void main(String args[]){
        Task task1 = new Task();
        Task task2 = new Task();
        First t1 = new First(task1); // t1-->task1 --> m1() : L(task1)
        First t2 = new First(task2); // t2 -> task2--> m2() : L(task2)
        t1.setName("Thread T1 ");
        t2.setName("Thread T2 ");
        t1.start();
        t2.start();
    }
}
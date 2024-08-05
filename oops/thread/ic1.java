/*
   Producer [Cook]
     |
   Consumer [Customer]
 
 step-1:- customer placed order for pizza [Customer was in execution]
 step-2:- Cook said : pleas wait [Now customer in waiting and cook started execution]
 step-3:- Still Cook thread is in execution | Preparing order
 step-4 :- Order is completed
 step-5 :- Cook will notify Customer [Cook is terminated | Customer will start execution]
 step-6:- Customer will consume data [Customer is still in execution]
 step-7 :- Customer Terminated 
 */
class Task{
  synchronized public void producingData(){
    try{
       System.out.println(Thread.currentThread().getName() +" got a lock and executing..");
       for(int i=1; i<=5; i++){
        System.out.println("Producer producing data....");
        Thread.sleep(5000);
       }
       System.out.println("Data produced...");
       notify();
    }
    catch(Exception e){
        e.printStackTrace();
    }
  }
  synchronized public void consumingData(){
     try{
       System.out.println(Thread.currentThread().getName() +" got a lock and executing..");
       System.out.println(Thread.currentThread().getName()+" placed order for pizza..& waiting..");
       wait();
       for(int i=1; i<=5; i++){
        System.out.println(Thread.currentThread().getName()+" Consuming data....");
        Thread.sleep(5000);
       }
       System.out.println("Data consumed...");
    }
    catch(Exception e){
        e.printStackTrace();
    }
  }
}
class Producer extends Thread{
    Task task;
    public Producer(Task task){
        this.task = task;
    }
    public void run(){
        task.producingData();
    }
}
class Consumer extends Thread{
  Task task;
  public Consumer(Task task){
    this.task = task;
  }
  public void run(){
    task.consumingData();
  }
}
class TestMain{
    public static void main(String args[]) throws Exception{
        Task task = new Task();        
        Consumer c1 = new Consumer(task);
        Producer p = new Producer(task);
        c1.setName("Consumer ");
        p.setName("Producer");

        c1.start();
        c1.join(3000);
        p.start();
    }
}













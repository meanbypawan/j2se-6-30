class A{
    static{
        new A().message();
    }
    public void message(){
        System.out.println("JVM Activated...");
    }
    public static void main(String args[]){
      System.out.println("Main executed....");
    }
}
/*
  class Object{
    public String toString(){
       return this.getClass().getName()+"@"+this.hashCode()
    }
  }
 */
class Message{
   private String msg;
   public Message(String msg){
    this.msg = msg;
   }
   public String toString(){
       return msg;
   }
}
class TestMain{
    public static void main(String args[]){
       String s1 = new String("Hello");
       StringBuffer sb = new StringBuffer("World");
       Message message = new Message("GM..");
       System.out.println(s1);// s1.toString() // hello
       System.out.println(sb); // world
       System.out.println(message); // message:{msg: "GM.."}
    }
}
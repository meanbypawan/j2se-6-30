interface I{
    void wish();
}

class Message{
    public void m1(){
        System.out.println("Gm.,...");
    }
    public static void m2(){
        System.out.println("GE.....");
    }
}
class TestMain{
    public static void main(String args[]){
        // Method Reference
       I obj =  new Message()::m1;
       obj.wish();

       I obj2 = Message::m2;
       obj2.wish();
    }
}
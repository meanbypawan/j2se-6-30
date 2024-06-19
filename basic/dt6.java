/*
   Floating - point (20.5, -0.3)
    a. float : 4 byte = 6 decimal places
    b. double: 8 byte = 12 decimal places
    
    3.15 :--- double
 */
class TestMain{
    public static void main(String args[]){
       //float x = 3.14f;
       int a=10; // 4
       float b = 1.5F; // 4
       double c = 20.5; // 8
       long d = 10; // 8

       d = (long)b; // long = float
       System.out.println(d);
    }
}
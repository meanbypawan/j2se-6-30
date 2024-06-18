/*
  Typecasting :- Process of converting one type of value into another
  is called typecasting
  a. Implicit TC
     c:-  
       int x;
       x = 20.5;   compiler  20.5 ==> 20 ===> x = 20;
  b. Explicit TC
 */
class TestMain{
    public static void main(String args[]){
        byte a,b,c;
        a = 20;
        b = 10;
        c = (byte)(a + b);
        System.out.println(c);
    }
}
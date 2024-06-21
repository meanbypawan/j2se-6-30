/*
   Logical Operator (boolean)
   && AND
   || OR
   
   A        B       (A&&B)              A||B
  (a>b)    (c<d)    (a>b)&&(c<d)     (a>b)||(c<d)      
   true    false    false               true
   false   true     false               true
   true    true     true                true
   false   false    false               false
 */
class TestMain{
  public static void main(String args[]){
    int a,b,c,d;
    a = 10;
    b = 20;
    c = 30;
    d = 40;
    boolean x = (a<b) | (++c<d);
    
    System.out.println(x);  
    System.out.println("a : "+a);
    System.out.println("b : "+b);
    System.out.println("c : "+c);
    System.out.println("d : "+d); 
  }
}
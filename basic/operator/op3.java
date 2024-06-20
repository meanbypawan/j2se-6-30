/*
  Relation :-
  a > b
  a < b
  a >= b
  a <= b
  a == b
  a != b
 
  true, false
 */
class TestMain{
    public static void main(String args[]){
       int a,b,c,d;
       boolean x;
       a = 10;
       b = 10;
       c = 10;
       d = 10;
       x =  (a == b) == (c == d);
       /*
         Operator :-
            Precedence
            Associativity
              a. Left --> Right
              b. Right -> Left 
         x =  (a == b) == (c == d);
              10==10
                true == (c == d)
                true == (10 == 10)
                true == true
                    true
        
        */
       System.out.println(x);
       System.out.println(true == false);
    }
}
/*
  Increment (++)
    a. Pre-increment
        It is first increment value by one then assign
        ++a;

    b :- Post-increment
        It first assign the value then increment by one
        a++;
 */
class TestMain{
    public static void main(String args[]){
      int x,y=5;
      //x = ++y;
      x = y++;
      System.out.println("x : "+x+" y : "+y); 
    }
}
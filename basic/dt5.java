/*
  byte      1-byte(8)      -2^7 to 2^7 -1     -128 to + 127
  short     2-byte(16)     -2^15 to 2^15 -1   -32768 to +32767
  int       4-byte(32)     -2^31 to 2^31 -1   -2147483648 to 2147483647
  long      8-byte(64)     -2^63 to 2^63 -1    ? to ?
  
  byte a,b;
  b + b = i
  b + s = i
  s + s  = i
  s + i = i
  i + i = i
  ...........
  b + L = L

  byte
   0.......125, 126, 127, -128, -127, -126, -125,-124.......0
                 x    .     .     .     x
   0,100,-300000 : Integer -2147483648 to 2147483647
 
   Dealing With Integer Data

                No Typecasting is required
  --------------------------------------->
   byte     short       int         long
    1         2          4            8   
 <--------------------------------------
                Typecasting required
 */
class TestMain{
    public static void main(String args[]){
      int x = 1;
      long y = x;
      //x = x + 1;
      System.out.println(x);
      System.out.println(y);
    }
}
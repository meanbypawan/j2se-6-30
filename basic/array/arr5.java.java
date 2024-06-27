/*

  0  1  2
  ----------------
  10 20 30 -->0 ==> arr[0] [10,20,30]
  40 50 60 -->1 ==> arr[1] [40,50,60]
  70 80 90 -->2 ==> arr[2] [70,80,90]
   3 X 3

  1 2  
  r , c
  r=0, c=0 to 2
  r=1, c=0 to 2
  r=2, c=0 to 2
 */
//import java.util.Scanner;
class TestMain{
    public static void main(String args[]){
      int arr[][] = {
        {1,2}, // 0 arr[0]
        {1,2,3,4}, // 1
        {1,2,3} // 2
      };

      for(int r=0; r<arr.length; r++){
        for(int c=0; c<arr[r].length; c++){
            System.out.print(" "+arr[r][c]);
        }
        System.out.println();
      }
    }
}
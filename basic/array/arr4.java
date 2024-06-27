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
      int arr[][] = new int[3][3];
      //System.out.println(arr.length); // 3
      java.util.Scanner sc = new java.util.Scanner(System.in);
      for(int r=0; r<arr.length; r++){
        System.out.println("Enter "+arr[r].length+" element in "+(r+1)+" row");
        for(int c=0; c<arr[r].length; c++){
           arr[r][c] =  sc.nextInt();
        }
      }

      System.out.println("Given Matrix...");
      for(int r=0; r<arr.length; r++){
        for(int c=0; c<arr[0].length; c++){
            System.out.print(" "+arr[r][c]);
        }
        System.out.println();
      }
    }
}
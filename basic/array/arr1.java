import java.util.Scanner;
class Test{
    public static void main(String args[]){
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 element");
        for(int i=0; i < 5; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Data...");

        for(int i=0; i<5; i++)
          System.out.print(arr[i]+"  ");
    
        System.out.println();
    }
}
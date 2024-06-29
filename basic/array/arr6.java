class TestMainn{
    public static void main(String args[]){
        int arr[][] = {
            {1,2,3},
            {4,5,6,7},
            {8,6,2}
        };

        for(int row[] : arr){
          for(int element : row){
            System.out.print(" "+element);
          }
          System.out.println();
        }
    }
}
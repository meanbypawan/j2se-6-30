class Test{
   public int add(int... x){
    int sum = 0;
    for(int element : x){
        sum = sum + element;
    }
    return sum;
   }
}
class TestMain{
    public static void main(String args[]){
      Test obj = new Test();
      System.out.println(obj.add(2,3)); // 5
      System.out.println(obj.add(2,3,4));// 9
      System.out.println(obj.add(2,3,4,5)); // 14
    }
}
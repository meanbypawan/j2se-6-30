
class Operation{

  public void add(int a, int b){
    System.out.println("I-I version");
    System.out.println("Addition : "+(a+b));
  }
  public void add(int a, int b, int c){
    System.out.println("I-I-I version");
    System.out.println("Addition : "+(a+b+c));
  }

  public void add(int a, int b, int c, int d){
    System.out.println("I-I-I-I version");
    System.out.println("Addition : "+(a+b+c+d));
  }

}
class TestMain{
    public static void main(String args[]){
       Operation obj = new Operation();
       obj.add(20,10);
       obj.add(20,10,5);
       obj.add(1,2,3,4);
    }
}
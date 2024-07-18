interface I{
    public double calculatePower(double a, double b);
}

class TestMain{
    public static void main(String args[]){
      I obj =   Math::pow;
      double result = obj.calculatePower(2,4);
      System.out.println(result);
    }
}
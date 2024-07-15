/*
  method that can not be override
  a. final
  b. static
  c. private
  ---------------------------------------
  1. public void m1(); // Invalid missing abstract
  2. abstract public void m1(); // Valid
  3. abstract public void m1(){} // Invalid 
  4. public abstract static void m1();// Invalid 
  5. public abstract final void m1(); // Invalid
  6. public static final void m1(){---} // Valid
 ---------------------------------------------------------------
 Interface 1.7
 Why :- To Maintain Standard
        To provide the guide line [Giving Proposol]
 What :- It is complete collection of abstract method.
 
 */
interface I{
   public static final int statusCode = 404; // public static final
   void add(int x, int y); // public abstract
   void sub(int x, int y);
   public abstract void mult(int x, int y);   
}
class TestImpl implements I{
  public void add(int x, int y){
    System.out.println("Addition : "+(x+y));
  }   
  public void sub(int x, int y){
    System.out.println("Subtraction : "+(x-y));
  }
  public void mult(int x, int y){
    System.out.println("Multiplication : "+(x*y));
  }
}
class TestMain{
    public static void main(String args[]){
        I obj = new TestImpl();
        obj.add(20,10);
        obj.sub(20,10);
        obj.mult(20,10);
        System.out.println(I.statusCode);
    }
}
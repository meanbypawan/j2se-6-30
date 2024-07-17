/*
  Functional Interface
  Lamda Expression
 */
interface I{
    void wish();
}
class A implements I{
    public void wish(){
        System.out.println("GM...");
    }
}
class B implements I{
    public void wish(){
        System.out.println("GE...");
    }
}
class C implements I{
    public void wish(){
        System.out.println("GN...");
    }
}
class TestMain{
    public static void main(String args[]){
        I obj = new C();
        obj.wish();
    }
}
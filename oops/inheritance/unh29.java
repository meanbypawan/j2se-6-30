/*
  C1 extends C2
  I1 extends I2
  C1 extends C2, C3 => Invalid
  I1 extends I2,I3 ==> Valid
  C1 implments I1
  C1 implments I1,I2
  C1 extends C2 implements I1
  C1 extends C2 implements I1,I2
 */
interface I1{
    void m1();
}
interface I2{
    void m2();
}
class Test implements I1,I2{
    public void m1(){
        System.out.println("m1()-excuted...");
    }
    public void m2(){
        System.out.println("m2()-executed...");
    }
}
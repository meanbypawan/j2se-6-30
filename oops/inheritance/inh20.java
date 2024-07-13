
/*
 Rectangle
   properties : l,w,
   behaviour : getArea() : int
 */
abstract class Rectangle{
   private int l;
   private int w;

   public Rectangle(int l, int w){
    this.l = l;
    this.w = w;
   }
   public int getL(){
    return l;
   }
   public int getW(){
    return w;
   }
   abstract public int getArea();
}
class RectangleChild extends Rectangle{
    public RectangleChild(int l, int w){
        super(l,w);
    }
    public int getArea(){
        return getL() * getW();
    }
}
class TestMain{
    public static void main(String args[]){
      RectangleChild obj = new RectangleChild(2,3);
      System.out.println("Area : "+obj.getArea());
    }
}
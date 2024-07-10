class Area{
    private int l;
    private int w;
    public void setData(int l, int w){
        this.l = l;
        this.w = w;
    }
    public int getArea(){
        return l*w;
    }
}
class Volume extends Area{
   private int h;
   public void setData(int l, int w, int h){
    setData(l,w);
    this.h = h;
   }   
   public int getVolume(){
    return getArea() * h;
   }
}
class Density extends Volume{
    private float m;
    public void setData(int l, int w, int h, float m){
       setData(l,w,h);
       this.m = m; 
    }
    public float getDensity(){
        return m/getVolume();
    } 
}
class TestMain{
    public static void main(String args[]){
        Density obj = new Density();
        obj.setData(2,3,4,6);// obj:{l:2,w:3,h:4,m:6}
        System.out.println("Area : "+obj.getArea());
        System.out.println("Volume : "+obj.getVolume());
        System.out.println("Density : "+obj.getDensity());    

    }
}
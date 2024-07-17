interface I{
    void operation(int x, int y);
}
class TestMain{
    public static void main(String args[]){
        I obj1 = (x,y)->System.out.println("Addition : "+(x+y));
        I obj2 = (x,y)->System.out.println("Subtraction : "+(x-y));

        obj1.operation(2,5);
        obj2.operation(2,5);
    }
}
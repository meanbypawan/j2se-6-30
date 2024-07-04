class Test{
    private int a = 20;
    private static int b = 10;
    public void increment(){
        ++a;
        ++b;
    }
    public static void display(){
        System.out.println(a); // non-static
        System.out.println(b);
    }
}
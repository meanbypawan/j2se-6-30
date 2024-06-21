class TestMain{
    public static void main(String args[]){
        int x = 5;
        
        int y = ++x + x++ + ++x + ++x * x++;
        //    6 + 6   +   8 +   9 * 9
        // 6 + 6 + 8 + 81
        // 12 + 8 + 81
        // 20 + 81
        // 101
        // x = 10
        System.out.println("x : "+x);
        System.out.println("y : "+y);
    }
}
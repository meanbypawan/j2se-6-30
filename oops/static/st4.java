class A{
    static{
        System.out.println("Block-1");
    }
    public static void main(String args[]){
        System.out.println("Main executed...");
    }
    static{
        System.out.println("Block-2");
    }
    static{
        System.out.println("Block-3");
    }
}
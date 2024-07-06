/*
  class Object{
    public boolean equals(Object){
      // Address Comparision
    }
  }
  class String{
    public boolean equals(Object){
      // Content comparision
    }
  }
  class StringBuffer{
    public boolean equals(Object){
      // Address Comparision
    }
  }
 */
class TestMain{
    public static void main(String args[]){
        String s1 = new String("hello");
        String s2 = new String("hello");

        StringBuffer sb1 = new StringBuffer("hello");
        StringBuffer sb2 = new StringBuffer("hello");

        StringBuilder sbuild1 = new StringBuilder("hello");
        StringBuilder sbuild2 = new StringBuilder("hello");

        System.out.println("s1.equals(s2) : "+s1.equals(s2)); // true
        System.out.println("sb1.equals(sb2) : "+sb1.equals(sb2)); // false
        System.out.println("sbuild1.equals(sbuild2) : "+sbuild1.equals(sbuild2));
    }
}
/*
  String
   1. String is immutable
   2. thread-safe
  StringBuffer
   1. Mutable
   2. synchronized
   3. thread-safe
   4. slow
  StringBuilder
   1. Mutable
   2. non-synchronized
   3. not a thread-safe
   4. fast
 */
class TestMain{
    public static void main(String args[]){
        String s1 = "hello"; // String s = new String("hello");
        StringBuffer sb1 = new StringBuffer("hello");
        sb1.append("World");
        System.out.println(sb1);
    }
}
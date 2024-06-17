/*
   "20"
   "hello"
   "20.5"
   "true"
   class A{
      void m1(){}  // non-static/instance
      static void m2(){} // static
   }
   A.m2();
   TestMain.main()
   var-arg :- Variable length Argument
   JVM  main method configuration
     a. public static void main(String args[])
     b. public static final void main(String args[])
     c. public static synchronized void main(String cheeku[])
     d. public static strictfp void main(String args[])
     e. public static final strictfp synchronized void main(String args[])
     f. public static void main(String... args)
     g. public static void main(String[] args)
     h. public static void main(String []args)
    .........................
    public, static , strictfp, final, synchronized
    keyword/Reserved Word
    52 Reserved word
     a. 3 Reserved Literal
        true, false, null 
     b. 49 keyword
         aa. 2 keywors banned (const,goto)
         bb. 47 are in use
    
    Speciality of keyword:
      keyword always written in lower case
      You can not use keyword for other purpose
*/
class TestMain{
    static public void main(String args[]){
        System.out.println("Welcome in java");
    }
}
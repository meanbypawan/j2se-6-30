/*
  Welcome in java
 c:
   void main(){
     printf("Welcome in c")
   }
   cpp
   int main(){
     cout<<"Welcome in cpp";
     return 0;
   }

   Member of class
    a. Instance Member
        aa. Data member [variable at the class scope]
        bb. Method
        cc. class

    b. Static Member
        aa. Data member
        bb. Method
        cc. class
    main method is static memeber of class Test
    
    method ----> class ----> package
    println()-->PrintStream--> io

    package io;
    class PrintStream{
       println(){--}
       print(){---}
       printf(){---} // jdk1.7
    } 

    println() is instance member of PrintStream class
    out :- It is object of PrintStream class
           but it is member of System Class
      
    package lang;  
    class System{
       static PrintStream out;
    }   
    /Documents/j2se/basic/p1.java    
   
   lang :- lang is default package of java
   java.lang.
 */

class Test{
  public static void  main(String args[]){
     //System.out.println("Welcome In Java");
     System.out.printf("Welcome in Java\n");
     System.out.print("Java is platform independent");
     System.out.println("Java is simple.");   
  }
}
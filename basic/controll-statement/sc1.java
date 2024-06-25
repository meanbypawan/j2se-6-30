/*
   method---> class ----> package
    ? ------> Scanner---> util

    util is package
   
    p1[A.class,B.class,C.class]
    |--p2[D.class,E.class,F.class]

    import java.p1.*; [A.class, B.class, C.class]
    import java.p1.p2.*;
    ------------------------------------
    import java.p1.*;
        or
    import java.p1.A;
    import java.p1.B;    
   ---------------------------
   import java.util.*;
     or
   import java.util.Scanner;

   Scanner sc = new Scanner(System.in);  
 */
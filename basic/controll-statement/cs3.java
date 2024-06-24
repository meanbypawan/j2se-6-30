/*
  switch(expression){
  case label1 : statement; break;
  case label2: statement; break;

  :
  :
  default: statement; 
  }
 */
class TestMain{
    public static void main(String args[]){
       int n=3; //
       int a = 2, b=1; 
       switch(n){
        case 1: System.out.println("one");break;
        case 2: System.out.println("two");break;
        case 2+1: System.out.println("three");break;
        case 4: System.out.println("four");break;
        case 5: System.out.println("five");break;
        default: System.out.println("Invalid value..");
       }
    }
}
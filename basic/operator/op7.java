/*
  Conditional Operator:-
  syntax:
   (condition/BE) ? expression-2 : expression 3;
 */
class TestMain{
    public static void main(String args[]){
        int n;
        n = 21; // n = ?
        
        String s = (n%2 == 0) ? "Even" : "Odd"; 
        System.out.println(s);
        /*
        (ageOfCheeku >= 18) ? System.out.printf("Can vote") : System.out.printf("Can't vote");
        */
    }
}
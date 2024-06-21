/*
  Conditional Operator:-
  syntax:
   (condition/BE) ? expression-2 : expression 3;
 */
class TestMain{
    public static void main(String args[]){
        int ageOfCheeku = 49;
        int ageOfPeeku = 21;
        int ageOfRinku = 45;

        String result = (ageOfCheeku > ageOfPeeku && ageOfCheeku > ageOfRinku) ? "Cheeku is oldest" : (ageOfPeeku > ageOfRinku) ? "Peeku is oldest" : "Rinku is oldest";
        
        System.out.println(result);
    }
}
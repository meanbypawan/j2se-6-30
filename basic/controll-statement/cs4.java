class TestMain{
    public static void main(String args[]){
     
     char ch = 'a';
     switch(ch){
        case 97:System.out.println("a-vowel");break; 
        case 'e': 
        case 'i': 
        case 'o': 
        case 'u': System.out.println("Vowel");break;
        default: System.out.println("Not vowel...");
     }
    }
}
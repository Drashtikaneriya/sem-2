import java.util.Scanner;

public class Lab4_2 {
    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        System.out.println("enter line of string: ");
        String a = sc.nextLine();
                                                                                                                           
        int vowelsCount=0;
        int consonantsCount = 0;

          for (int i = 0; i < a.length(); i++){

            char Char = a.charAt(i);
            char c = a.charAt(i);

            if (Character.isLetter(Char)) {
                 
                if ( c=='A' || c=='E' || c=='I' || c=='O' || c=='U' || c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ) {
                    vowelsCount++;
                } else {
                    consonantsCount++;
                }
            }
         }
         System.out.println("Number of vowels: " + vowelsCount);
         System.out.println("Number of consonants: " + consonantsCount);
     }
}


 import java.util.Scanner;
public class Vowel_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String str=sc.nextLine();
        int vowel=0,consonant=0;
        for(int i=0;i<=str.length();i++){
            char ch=str.charAt(i);
            if(ch=='A'ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowel++;
            }else if(ch>='A' && ch<='Z'  ch>='a' && ch<='z'){
                consonant++;
            }
        }
        System.out.println(" Number of Vowels is :"+vowel);
        System.out.println(" Number of Consonants is :"+consonant);
        sc.close();
    }
}
}

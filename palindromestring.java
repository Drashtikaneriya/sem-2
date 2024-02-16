import java.util.Scanner;

public class palindromestring {
     public static void main(String[] args){
 
     Scanner sc=new Scanner(System.in);

     System.out.println("enter string: ");
     char a = sc.next().charAt(0);

      // int i,j,length;
      int i=0,j=a.length()-1;

      // System.out.println("enter string: ");
      // char a = sc.next().charAt(i);

      for(i=0;i<j;i++){

        if(a.charAt(i)!=a.charAt(j)){
          System.out.println("not palindrome number");
          System.exit(0);
        }
        
          i++;
          j--;

      }

          System.out.println(" palindrome number");
    }

}

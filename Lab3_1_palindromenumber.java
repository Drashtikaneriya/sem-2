import java.util.Scanner;

public class Lab3_1_palindromenumber {

    public static void main(String[] args){

        Scanner sc =  new Scanner(System.in);

        System.out.println("enter number:" );
        int n = sc.nextInt();
        
        int temp =  n;
        int a , sum=0;
        while(n>0){
            a = n%10;
            sum= sum*10+a;
            n = n/10;
        }

        n = temp;

        if( sum == n ){
            System.out.println("It is palindromenumber");
        }
        else{
            
            System.out.println("It is not palindromenumber");
        }
    }
    
}

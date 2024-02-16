import java.util.Scanner;
public class Rectangle_pattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter m:");

        int m = sc.nextInt();

        System.out.println("enter n:");
        int n = sc.nextInt();


        for( int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                System.out.print("*  ");
            }
            System.out.println(" ");
        }
    } 
}

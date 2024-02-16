import java.util.Scanner;
public class Lab4_4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n:");
        int n = sc.nextInt();

       int arr[]=new int[n];
      for( int i=0;i < n; i++){
       System.out.println("enter arr: ");
       arr[i] = sc.nextInt();
    }
    int sum=0;
    for(int i=(n-1); i>-1; i--){
        System.out.print(" "+arr[i]);
        
    }
}
}

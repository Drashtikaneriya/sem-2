import java.util.Scanner;

public class Lab4_3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n:");
        int n = sc.nextInt();

       int arr[]=new int[n];
      for( int i=0;i < n; i++){
       System.out.println("enter arr: ");
       arr[i] = sc.nextInt();
    }

    
    int sum = 0;
    for (int i = 0; i <arr.length; i++) {
        sum = sum +  arr[i];
    }

   
    double average = (double) sum / n;
    
    System.out.println(average);
}
}
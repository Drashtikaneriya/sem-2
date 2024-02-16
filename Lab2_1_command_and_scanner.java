import java.util.Scanner ;
public class Lab2_1_command_and_scanner {
    public static void main(String[] args){
        int a = Integer.parseInt(args[0]);
         int b = Integer.parseInt(args[1]);

         System.out.println("sum= "+(a+b));

         Scanner sc= new Scanner(System.in);

         System.out.println("Enter an integer");
         int c = sc.nextInt();

         System.out.println("Enter an integer");
         int d = sc.nextInt();

         System.out.println("sum= "+(c+d));

    }
}

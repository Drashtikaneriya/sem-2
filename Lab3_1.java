import java.util.Scanner;

public class Lab3_1 {

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        System.out.println("enter mark1:" );
        int mark1 = sc.nextInt();

         System.out.println("enter mark2:" );
        int mark2 = sc.nextInt();

         System.out.println("enter mark3:" );
        int mark3 = sc.nextInt();

         System.out.println("enter marks4:");
        int mark4 = sc.nextInt();

         System.out.println("enter marks5: ");
        int mark5 = sc.nextInt();

        double per=((mark1+mark2+mark3+mark4+mark5)*100)/5;
        System.out.println(per);

        if(per>=60){
            System.out.println("first division");
        }
        else if(per>= 50){
            System.out.println("second division");
        }
         else if(per>= 40){
            System.out.println("third division");
        }
         else if(per<40){
            System.out.println("fail....");
        }
    }
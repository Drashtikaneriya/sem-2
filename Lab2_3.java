import java.util.Scanner;
public class Lab2_3 {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
             
        System.out.println("enter the first number: ");
        double num1= sc.nextDouble();

        System.out.println("enter the second number: ");
        double num2= sc.nextDouble();

        System.out.println("enter the (+.-,/,*): ");
        char operation= sc.next().charAt(0);


        if(operation=='+'){
            System.out.println("the result is: " +(num1+num2));
        }
         else if(operation=='-'){
           System.out.println("the result is: " +(num1-num2));
        }
         else if(operation=='*'){
           System.out.println("the result is: " +(num1*num2));
        }
        else if(operation=='/'){
         System.out.println("the result is: " +(num1/num2));
        }    
     }
 }


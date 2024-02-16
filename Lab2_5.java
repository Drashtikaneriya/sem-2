import java.util.Scanner;
public class Lab2_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Fahrenheit: ");
        double f = sc.nextDouble();

        System.out.println("temperature in celsius:"+((f-32)*5/9));
    }
}

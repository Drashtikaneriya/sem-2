import java.util.Scanner;

public class Lab4_5_second_half_string {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your String:");
        String str = sc.nextLine();
        String str2 = str.substring(str.length()/2,str.length());
        System.out.println(str2);

        
    }
}
import java.util.Scanner;
public class Simple_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of principle :- ");
        float p = sc.nextFloat();
        System.out.println("Enter the value of monthly interest rate :- ");
        float r = sc.nextFloat();
        System.out.println("Enter the value of time in month :- ");
        float t = sc.nextFloat();
        float si = (p*r*t) / 100;
        System.out.println("Your simple interest is "+si);

    }
}

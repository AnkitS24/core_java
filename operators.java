import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of variable a and b :- ");
        float a = sc.nextFloat();
        float b = sc.nextFloat();

        // Arithmetic operators
        System.out.println("addition of a and b is "+(a+b));
        System.out.println("subtraction of a and b is" +(a-b));
        System.out.println("multiplication of a and b is "+(a*b));
        System.out.println("Division of a and b is "+(a/b));
        System.out.println("modulus of a and b is "+(a%b));

        // Relational operators
        System.out.println(a==b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a!=b);

        // Logical operators
        System.out.println(a>b && a==b);
        System.out.println(a>b || a<b);
        System.out.println(!(a>b));

        // Assignment operators
        b += 10;
        System.out.println(b);
        b -= 10;
        System.out.println(b);

        // unary operators
        System.out.println(b++);
        System.out.println(++a);
    }
}

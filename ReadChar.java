import java.util.Scanner;

public class ReadChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello world!");
        System.out.println("Enter your name.");
        char ch = sc.next().charAt(0);
        System.out.println("Character is "+ch);
    }
}
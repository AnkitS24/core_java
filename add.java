/*
import java.util.Scanner;
public class add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner a = new Scanner(System.in);
        System.out.println("Enter any numbers num1 : - ");
        float num1 = sc.nextFloat();
        System.out.println("Enter any numbers num2 : - ");
        float num2 = sc.nextFloat();
        float num = num1 + num2;
        System.out.println("Your addition is "+ num);
        System.out.println("Enter your name - ");
        String name = a.next();
        System.out.println("your surname is " + name) ;
    }
}
 */
// Now we do addition by class and objects.....

import java.util.Scanner;
class Main{
    int sum(int a , int b){
        int ans = a+b;
        return ans;
    }
}
public class add{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Main obj = new Main();
        int x = s.nextInt();
        int y = s.nextInt();
        int r = obj.sum(x,y);
        System.out.println(r);
    }
}
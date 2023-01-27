import java.util.Scanner;
public class loop_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns :-");
        int r = sc.nextInt();
        int c = sc.nextInt();

        // Pattern Printing : Rectangular Pattern
//
//        for(int i=1;i<=r;i++){
//            for(int j=1;j<=c;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        //Pattern Printing : Rectangle

//        for(int i=1;i<=r;i++) {
//            if (i == 1 || i == r) {
//                for (int j = 1; j <= c; j++) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//
//            } else {
//                for(int j=1; j<= c;j++){
//                    if (j==1 || j==c){
//                        System.out.print("* ");
//                    }else{
//                        System.out.print("  ");
//                    }
//                }
//                System.out.println();
//            }
//        }


        // Pattern printing : Triangular pattern
//        for(int i=1;i<=r;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//
//        for(int i=1;i<=r;i++){
//            for(int j=1;j<=c-i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//
//        for(int i=1;i<=r;i++){
//            for(int j=1;j<=r-i;j++){
//                System.out.print("  ");
//            }
//            for(int k=1;k<=(2*i-1);k++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        System.out.println();

        // Numerical Rectangular pattern
//        for (int i=1;i<=r;i++){
//            for(int j=i;j<=c;j++){
//                System.out.print(j);
//            }
//            for(int j=1;j<=i-1;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        // For each row same numbers
//        for (int i=1;i<=r;i++){
//            for(int j=1;j<=c;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }


        //Numeric pattern
//        for (int i=1;i<=r;i++){
//            for(int j=1;j<=c/2;j++){
//                if(i%2 == 0){
//                    System.out.print("21");
//                }else{
//                    System.out.print("12");
//                }
//            }
//            System.out.println();
//        }

        // Numeric pattern
//        for (int i=1;i<=r;i++){
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        // Numeric pattern
//        for(int i=1;i<=r;i++){
//            for(int j=1;j<=r-i;j++){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print(j);
//            }
//            for(int j=1;j<=i-1;j++){
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        //Numeric pattern
//        for(int i=1;i<=r;i++){
//            if ( i!=r ){
//                for(int j=1;j<=r-i;j++){
//                    System.out.print(" ");
//                }
//                for(int j=i;j<=i;j++){
//                    System.out.print(j);
//                }
//                for(int j=1;j<=(i-1);j++){
//                    System.out.print(" ");
//                }
//                for(int j=3;j<=i;j++){
//                    System.out.print(" ");
//                }
//                for(int j=i;j<=i;j++){
//                    if(j!=1){
//                        System.out.print(j);
//                    }
//                }
//                System.out.println();
//            }else{
//                for(int j=1;j<=2*c-1;j++){
//                    System.out.print(i);
//                }
//            }
//        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, total;
        Scanner input = new Scanner(System.in);
        System.out.print("enter number :");
        n = input.nextInt();
        total  = 0;


        for (int i = 1; i < n; i++) {


            if (n % i == 0) {
                total += i;

            }
        }
            if (n == total) {
                System.out.println(n + "   perfect number ." );


            } else {
                System.out.println(n+ "   doesn't perfect number.");
            }

        }
    }









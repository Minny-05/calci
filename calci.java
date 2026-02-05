import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        int r1 = n1 + n2;
        int r2 = n1 - n2;
        int r3 = n1 * n2;
        double r4 = (double) n1 / n2;

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);
    }
}

import java.util.Scanner;
// 11. Write a program to input three numbers and print the largest using nested if-else.
class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        sc.close();
        if (a >= b) {
            if (a >= c)
                System.out.println("Largest: " + a);
            else
                System.out.println("Largest: " + c);
        } else {
            if (b >= c)
                System.out.println("Largest: " + b);
            else
                System.out.println("Largest: " + c);
        }
    }
}

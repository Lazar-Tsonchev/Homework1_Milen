import java.util.Scanner;

public class Task5 {
    /*Въведете 3 различни числа от конзолата и ги разпечатайте в низходящ ред.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a:");
        double a = sc.nextDouble();
        System.out.println("Please input b:");
        double b = sc.nextDouble();
        System.out.println("Please input c:");
        double c = sc.nextDouble();

        if (a < b) {
            if (a < c) {
                if (b < c) {
                    System.out.println(c + ", " + b + ", " + a);
                } else {
                    System.out.println(b + ", " + c + ", " + a);
                }
            } else {
                System.out.println(b + ", " + a + ", " + c);
            }
        } else {
            if (a < c) {
                System.out.println(c + ", " + a + ", " + b);
            } else {
                if (b < c) {
                    System.out.println(a + ", " + c + ", " + b);
                } else {
                    System.out.println(a + ", " + b + ", " + c);
                }
            }
        }
    }
}

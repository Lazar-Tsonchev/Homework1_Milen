import java.util.Scanner;

public class Task2 {
    /*Въведете 2 различни целочислени числа от конзолата. Запишете тяхната сума,
    разлика, произведение, остатък от деление и целочислено деление в отделни
    променливи и разпечатайте тези резултати в конзолата. Опитайте същото с числа
    с плаваща запетая.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a:");
        int a = sc.nextInt();
        System.out.println("Please input b:");
        int b = sc.nextInt();

        int sum = a + b;
        int dif = a - b;
        int div = a / b;
        int mul = a * b;
        int mod = a % b;
        System.out.println("sum = " + sum);
        System.out.println("dif = " + dif);
        System.out.println("div = " + div);
        System.out.println("mul = " + mul);
        System.out.println("mod = " + mod);

        System.out.println("Please input c:");
        double c = sc.nextDouble();
        System.out.println("Please input d:");
        double d = sc.nextDouble();

        double sumd = c + d;
        double difd = c - d;
        double divd = c / d;
        double muld = c * d;
        double modd = c % d;
        System.out.println("sumd = " + sumd);
        System.out.println("difd = " + difd);
        System.out.println("divd = " + divd);
        System.out.println("muld = " + muld);
        System.out.println("modd = " + modd);
    }
}

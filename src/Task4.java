import java.util.Scanner;

public class Task4 {
    /*Въведете 2 различни числа от конзолата и ги разпечатайте в нарастващ ред.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a:");
        int a = sc.nextInt();
        System.out.println("Please input b:");
        int b = sc.nextInt();
        if (a < b)
            System.out.println(a + ", " + b);
        else
            System.out.println(b + ", " + a);
    }
}

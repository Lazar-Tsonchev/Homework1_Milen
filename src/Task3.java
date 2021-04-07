import java.util.Scanner;

public class Task3 {
    /*Въведете 2 различни числа от конзолата и разменте стойността им. Разпечатайте
    новите стойности*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a:");
        int a = sc.nextInt();
        System.out.println("Please input b:");
        int b = sc.nextInt();
        int c = b;
        b = a;
        a = c;
        System.out.println("New a = " + a);
        System.out.println("New b = " + b);
    }
}

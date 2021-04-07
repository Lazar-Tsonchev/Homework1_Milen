import java.util.Scanner;

public class Task6 {
    /*Въведете 3 числа от клавиатурата а1, а2 и а3. Разменете стойностите им така, че
а1 да има стойността на а2, а2 да има стойността на а3, а а3 да има старата
стойност на а1.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a1:");
        int a1 = sc.nextInt();
        System.out.println("Please input a2:");
        int a2 = sc.nextInt();
        System.out.println("Please input a3:");
        int a3 = sc.nextInt();
        int b = a1;
        a1 = a2;
        a2 = a3;
        a3 = b;
        System.out.println("new a1 = " + a1);
        System.out.println("new a2 = " + a2);
        System.out.println("new a3 = " + a3);
    }
}

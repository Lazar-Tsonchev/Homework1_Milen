import java.util.Scanner;

public class Task1 {
    /*Да се изведат съобщения към потребителя и да се прочетат 2 числа от
клавиатурата A и B (може да са с плаваща запетая – double). После да се прочете
3-то число C и да се провери дали то е м/у A и B. Да се изведе подходящо
съобщение за това дали C е между A и B.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a:");
        double a = sc.nextDouble();
        System.out.println("Please input b:");
        double b = sc.nextDouble();
        System.out.println("Please input c:");
        double c = sc.nextDouble();

        if (a < c && c < b) {
            System.out.println("c is bigger then a and smaller than b");
        } else {
            System.out.println("c is not between a and b");
        }
    }
}

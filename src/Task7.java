import java.util.Scanner;
import java.lang.IllegalArgumentException;

public class Task7 {
    /*Въведете 3 променливи от клавиатурата – час (целочислен тип), сума пари (число
с плаваща запетая), дали съм здрав – булев тип. Съставете програма, която
взема решения на базата на тези данни по следния начин:
- ако съм болен няма да излизам
- ако имам пари ще си купя лекарства
- ако нямам – ще стоя вкъщи и ще пия чай
- ако съм здрав
- ако имам по-малко от 10 лв ще отида на кафе и т.н
Полученото решение покажете като съобщение в конзолата.*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input time:");
        int time = sc.nextInt();
        System.out.println("How much money do you have:");
        double money = sc.nextDouble();
        System.out.println("Are you healthy?");
        boolean isHealthy = sc.nextBoolean();

        if (!isHealthy) {
            System.out.println("I am sick thus:");
            System.out.println("I would not go out");

            if (money > 0) {
                System.out.println("I will buy myself some medicines");
            } else {
                System.out.println("I will drink tea");
            }
        } else {
            if (money < 10) {
                if (time < 11) {
                    System.out.println("I will buy myself some coffee");
                } else {
                    System.out.println("I'll watch TV.");
                }
            } else if (money > 10 && time > 11 && time < 14) {
                System.out.println("I will go to a restaurant for lunch");
            } else if (money > 10 && time > 17) {
                System.out.println("I will go to a restaurant for dinner");
            } else {
                System.out.println("I will play video games until it is time for lunch or dinner");
            }
        }
    }
}

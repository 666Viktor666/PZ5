import java.util.Scanner;

public class Main {  // ← Имя класса должно совпадать с именем файла
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму вклада: ");
        float deposit = scanner.nextFloat();

        System.out.print("Введите срок вклада в месяцах: ");
        int months = scanner.nextInt();

        float result = calculateDeposit(deposit, months);

        System.out.printf("После %d месяцев сумма вклада составит: %.6f\n", months, result);

        scanner.close();
    }

    public static float calculateDeposit(float initialAmount, int months) {
        float amount = initialAmount;
        float interestRate = 0.07f;

        for (int i = 0; i < months; i++) {
            amount = amount + (amount * interestRate);
        }

        return amount;
    }
}
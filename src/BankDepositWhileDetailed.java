import java.util.Scanner;

public class BankDepositWhileDetailed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму вклада: ");
        float deposit = scanner.nextFloat();

        System.out.print("Введите срок вклада в месяцах: ");
        int months = scanner.nextInt();

        System.out.println("\n=== Расчёт вклада (while) ===");
        calculateWithWhileDetails(deposit, months);

        scanner.close();
    }

    public static void calculateWithWhileDetails(float initialAmount, int months) {
        float amount = initialAmount;
        float interestRate = 0.07f;
        int month = 1; // начинаем с первого месяца

        System.out.printf("Начальная сумма: %.2f\n", initialAmount);
        System.out.println("Процентная ставка: 7% в месяц");
        System.out.println("------------------------------");

        // while - пока месяц не превысил общее количество месяцев
        while (month <= months) {
            float interest = amount * interestRate;
            amount = amount + interest;

            System.out.printf("Месяц %d: +%.2f процентов = %.2f\n",
                    month, interest, amount);
            month++; // переходим к следующему месяцу
        }

        System.out.println("------------------------------");
        System.out.printf("Итоговая сумма после %d месяцев: %.6f\n", months, amount);
    }
}
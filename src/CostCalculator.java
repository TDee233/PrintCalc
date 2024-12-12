import java.util.InputMismatchException;
import java.util.Scanner;

public class CostCalculator {

    private Price vizitka;

    public CostCalculator() {
        this.vizitka = new Price();
    }

    public void calculateCost() {
        System.out.println("Цена за 1 визитку: " + vizitka.getBusinessCardPrice());

        int chooseCat = getCategoryChoice();
        if (chooseCat == -1) {
            System.out.println("Неверная категория");
            return;
        }

        int quantity = getQuantity();
        if (quantity <= 0) {
            System.out.println("Количество должно быть положительным числом.");
            return;
        }

        System.out.println("Расчет для количества: " + quantity);
        if (chooseCat == 1) {
            System.out.println("Общая стоимость: " + (quantity * vizitka.getBusinessCardPrice()));
        }
        if (chooseCat == 2) {
            System.out.println("Общая стоимость: " + (quantity * vizitka.getPlasticCardPrice()));
        }

    }

    private int getCategoryChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите категорию: \n 1 - визитки\n 2 - пластиковые карты");
        try {
            int chooseCat = scanner.nextInt();
            if (chooseCat == 1 || chooseCat == 2) {
                System.out.println("Вы выбрали категорию " + (chooseCat == 1 ? "Визитки" : "Пластиковые карты"));
                return chooseCat;
            }
        } catch (InputMismatchException e) {
            System.out.println("Пожалуйста, введите число.");
        }
        return -1; // Возвращаем -1 для обозначения неверного выбора
    }

    private int getQuantity() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество единиц продукции: ");
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Пожалуйста, введите число.");
            return -1; // Возвращаем -1 для обозначения неверного ввода
        }
    }

    public static void main(String[] args) {
        CostCalculator calculator = new CostCalculator();
        calculator.calculateCost();
    }
}
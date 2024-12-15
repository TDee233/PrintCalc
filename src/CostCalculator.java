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

//    public static double calculatePrice(int category, int quantity) {
//        double basePrice = 100.0; // Базовая цена за единицу
//
//        // Определяем наценку или скидку в зависимости от категории
//        double markupOrDiscount = 0.0;

//        switch (category) {
//            case 1: // Электроника
//                if (quantity > 10) {
//                    markupOrDiscount = -0.10; // Скидка 10%
//                } else {
//                    markupOrDiscount = 0.15; // Наценка 15%
//                }
//                break;
//            case 2: // Одежда
//                if (quantity > 5) {
//                    markupOrDiscount = -0.05; // Скидка 5%
//                } else {
//                    markupOrDiscount = 0.10; // Наценка 10%
//                }
//                break;
//            case 3: // Продукты
//                if (quantity > 20) {
//                    markupOrDiscount = -0.20; // Скидка 20%
//                } else {
//                    markupOrDiscount = 0.00; // Без наценки или скидки
//                }
//                break;
//            default:
//                System.out.println("Неверная категория.");
//                return 0;
//        }
//
//        // Рассчитываем итоговую стоимость
//        double pricePerUnit = basePrice * (1 + markupOrDiscount);
//        return pricePerUnit * quantity;
    }
}
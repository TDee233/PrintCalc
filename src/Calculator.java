import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    private Materials materials;

    public Calculator(Materials materials) {
        this.materials = materials;
    }

    public void calculateCost() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите категорию: \n 1 - визитки\n 2 - пластиковые карты");
        int chooseCat = scanner.nextInt();
        if (chooseCat == 1) {
            System.out.println("Вы выбрали категорию Визитки");
        }
        else System.out.println("Вы выбрали категорию Пластиковые карты");

        System.out.println("Введите количество единиц продукции: ");
        int quantity = scanner.nextInt();

        System.out.println("Расчет для количества: " + quantity);



        double totalCost = quantity * materials.getPricePerUnit();
        System.out.printf("Общая стоимость: %.2f\n", totalCost);
    }

    public static void main(String[] args) {
        // Пример фиксированной цены за единицу продукции
        Materials materials = new Materials(10.0); // Например, 10.0 за единицу
        Calculator calculator = new Calculator(materials);

        // Запуск калькулятора
        calculator.calculateCost();
    }
}
import java.util.Scanner;

public class PrintCalculator {
    private Materials materials;

    public PrintCalculator(Materials materials) {
        this.materials = materials;
    }

    public void calculateCost() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество единиц продукции: ");
        int quantity = scanner.nextInt();

        double totalCost = quantity * materials.getPricePerUnit();
        System.out.printf("Общая стоимость: %.2f\n", totalCost);
    }

    public static void main(String[] args) {
        // Пример фиксированной цены за единицу продукции
        Materials materials = new Materials(10.0); // Например, 10.0 за единицу
        PrintCalculator calculator = new PrintCalculator(materials);

        // Запуск калькулятора
        calculator.calculateCost();
    }
}
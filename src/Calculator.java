import java.util.Scanner;

public class Calculator {
    private Materials materials;

    public Calculator(Materials materials) {
        this.materials = materials;
    }

    public void calculateCost() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество единиц продукции: ");
        int quantity = scanner.nextInt();

        System.out.println("Выберите изделие: " + scanner.nextInt());

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
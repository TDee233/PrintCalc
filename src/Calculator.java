
import java.util.Scanner;

public class Calculator {
//    private Materials materials;
//
//    public Calculator(Materials materials) {
//        this.materials = materials;
//    }

    public void calculateCost() {

                Price vizitka = new Price();
                System.out.println("Цена за 1 визитку: " + vizitka.getBusinessCardPrice());


        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите категорию: \n 1 - визитки\n 2 - пластиковые карты");
        int chooseCat = scanner.nextInt();
        if (chooseCat == 1) {
            System.out.println("Вы выбрали категорию Визитки");
        }
        else if (chooseCat == 2) {
            System.out.println("Вы выбрали категорию Пластиковые карты");
        }
        else System.out.println("Неверная категория");

        System.out.println("Введите количество единиц продукции: ");
        int quantity = scanner.nextInt();

        System.out.println("Расчет для количества: " + quantity);

        if (chooseCat == 1)
            System.out.println(quantity*vizitka.getBusinessCardPrice());
//      нужна реализация под каждый материал
//        если выбрано 1 категория то расчет по одной категории и т.п.


//        double totalCost = quantity * materials.getPricePerUnit();
//        System.out.printf("Общая стоимость: %.2f\n", totalCost);
    }

//    public static void main(String[] args) {
//        // Пример фиксированной цены за единицу продукции
////        Materials materials = new Materials(888.0); // Например, 10.0 за единицу
//        Calculator firstCalc = new Calculator();

        // Запуск калькулятора
//        firstCalc.calculateCost();
    }
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Print calculator begin!");
        System.out.println("Select options");

    Scanner firstNum = new Scanner(System.in);
        System.out.println("Введите первый параметр");
        int chooseNum1 = firstNum.nextInt();
        System.out.println("вы выбрали " + chooseNum1);
    }
}
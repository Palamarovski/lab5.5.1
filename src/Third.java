import java.util.Scanner;
public class Third {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть три числа : ");
        double num1, num2, num3;
        if (sc.hasNextDouble()) {
            num1 = sc.nextDouble();
        } else {
            System.out.println("Введено не дробове число.");
            sc.close();
            return;
        }
        if (sc.hasNextDouble()) {
            num2 = sc.nextDouble();
        } else {
            System.out.println("Введено не дробове число.");
            sc.close();
            return;
        }
        if (sc.hasNextDouble()) {
            num3 = sc.nextDouble();
        } else {
            System.out.println("Введено не дробове число.");
            sc.close();
            return;
        }
        if (num1 >= num2 & num1 >= num3) {
            System.out.println("Найбільше дробове число : " + num1);
        } else if (num2 >= num1 & num2 >= num3) {
            System.out.println("Найбільше дробове число : " + num2);
        } else if (num3 >= num1 & num3 >= num2) {
            System.out.println("Найбільше дробове число : " + num3);
        } else {
            System.out.println("Усі числа рівні.");
        }
        sc.close();
    }
}
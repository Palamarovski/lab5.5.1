//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть п'ять окремих слів : ");
        String w1 = sc.next();
        String w2 = sc.next();
        String w3 = sc.next();
        String w4 = sc.next();
        String w5 = sc.next();

        String sent = w1.concat(" ").concat(w2).concat(" ").concat(w3).concat(" ").concat(w4).concat(" ").concat(w5);
        System.out.println("Складене речення : " + sent);
    }
}
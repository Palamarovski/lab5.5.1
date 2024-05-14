import java.util.Scanner;
public class Fifth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть перший рядок : ");
        String fS = sc.nextLine();
        System.out.println("Введіть другий рядок : ");
        String sS = sc.nextLine();
        if (fS.length() > sS.length()) {
            System.out.println("В першому рядку міститься більше символів");
        } else if (fS.length() < sS.length()) {
            System.out.println("В другому рядку міститься більше символів");
        } else {
            System.out.println("Кількість символів у двох рядках одинакова");
        }
    }
}
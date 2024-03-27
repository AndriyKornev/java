import java.util.Scanner;
import RequestPackage.executeRequest;

public class lab5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер месяца: ");
        int month = scanner.nextInt();

        executeRequest.executeRequest(month);

        scanner.close();
    }
}

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        String[] result = {"even", "odd"};

        System.out.println(result[number % 2]);

        scanner.close();
    }
}

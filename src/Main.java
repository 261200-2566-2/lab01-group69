import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of integers (n): ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        // อ่านจำนวนเต็ม n
        for (int i = 0; i < n; i++) {
            System.out.print("Enter integer #" + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // เรียกใช้ method เพื่อเรียงลำดับและพิมพ์จำนวนเต็ม
        sortAndPrint(numbers);
    }

    // method เพื่อเรียงลำดับและพิมพ์จำนวนเต็ม
    private static void sortAndPrint(int[] numbers) {
        Arrays.sort(numbers);

        System.out.println("Sorted integers in ascending order:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}

// Reference : https://chat.openai.com/
import java.util.Scanner;

public class ArraySorter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Array size n: ");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". element: ");
            arr[i] = input.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        input.close();
    }
}
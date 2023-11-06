package searchingalgorithms;
import java.util.Scanner;

public class LinearSearchInSortedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the sorted array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements in sorted order:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the target element to search for: ");
        int target = scanner.nextInt();

        int result = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                result = i;
                break; // Exit the loop when the target element is found
            } else if (arr[i] > target) {
                break; // Exit the loop when the current element is greater than the target (since the array is sorted)
            }
        }

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found in the array.");
        }

        scanner.close();
    }
}
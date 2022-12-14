
import java.util.Scanner;
import java.util.Arrays;

public class Insertionsort {
	static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

	static void insertionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					swap(arr, j, j - 1);
				} else
					break;
			}

		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size = in.nextInt();
		System.out.println("Enter the elements of the array:");
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.print("arr[" + i + "]=");
			arr[i] = in.nextInt();
		}
		System.out.print("The unsorted array is: ");
		System.out.println(Arrays.toString(arr));
		insertionSort(arr);
		System.out.print("THe sorted array is: ");
		System.out.println(Arrays.toString(arr));

	}

}

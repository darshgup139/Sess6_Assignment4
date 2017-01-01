import java.util.Scanner;

public class BinarySearch {
	private int i, n, searchVal, first, last, middle;
	private int[] arr;

	public void takeInput() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements in the array:");
		n = sc.nextInt();
		arr = new int[n];

		System.out.println("Enter the numbers");
		for (i = 0; i < n; i++)
			arr[i] = sc.nextInt();
	}

	public void binSearch() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the number to be searched:");
		searchVal = sc1.nextInt();
		first = 0;
		last = n - 1;
		middle = (first + last) / 2;

		while (first <= last) {
			if (arr[middle] < searchVal)
				first = middle + 1;
			else if (arr[middle] == searchVal) {
				System.out.println(searchVal + " is found at location " + (middle + 1));
				break;
			} else {
				last = middle - 1;
			}
			middle = (first + last) / 2;
		}
		if (first > last)
			System.out.println(searchVal + " is not found in the array\n");
	}

	public void sort() {
		// TODO Auto-generated method stub
		int i, j, temp;
		for (i = 0; i < n; i++) {
			for (j = i + 1; j < n; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("Sorted Array is");
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

}

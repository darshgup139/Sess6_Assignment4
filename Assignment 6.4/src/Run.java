import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice,dec=1;
		Scanner sc = new Scanner(System.in);
		BinarySearch bs = new BinarySearch();
		while(dec!=0){
		System.out.println("Is the array already sorted..?");
		System.out.println("Press 1 for Yes and 2 for No");
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			bs.takeInput();
			bs.binSearch();
			break;

		case 2:
			bs.takeInput();
			bs.sort();
			bs.binSearch();
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
		System.out.println("Press 1 to continue and 0 to exit");
		dec = sc.nextInt();
		}
	}
}

/*
 ******************************************************************************
 * Output:
 * Is the array already sorted..?
Press 1 for Yes and 2 for No
1
Enter number of elements in the array:
5
Enter the numbers
1
2
3
4
5
Enter the number to be searched:
4
4 is found at location 4
Press 1 to continue and 0 to exit
1
Is the array already sorted..?
Press 1 for Yes and 2 for No
5
Invalid Input
Press 1 to continue and 0 to exit
1
Is the array already sorted..?
Press 1 for Yes and 2 for No
2
Enter number of elements in the array:
5
Enter the numbers
7
3
1
9
5
Sorted Array is
1 3 5 7 9 
Enter the number to be searched:
5
5 is found at location 3
Press 1 to continue and 0 to exit
0

 ******************************************************************************
 * 
 */

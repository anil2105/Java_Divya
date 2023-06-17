package arrays;

public class exp1 {

	public static void main(String[] args) {

		int a[] = new int[5]; // declaration of array with 5 elements and instantiation

		// store elements into array
		a[0] = 10;
		a[1] = 20;
		a[2] = 70;
		a[3] = 40;
		a[4] = 50;

		// traversing array
		// read elements of an array

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}

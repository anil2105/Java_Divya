package arrays;

public class Reverse {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,5};
				   //0 1 2 3 4 --> array index
		
		System.out.println(arr.length);
		
		System.out.println("Array in reverse order: ");
		
		for (int i=arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i]+ " ");
		}

	}

}

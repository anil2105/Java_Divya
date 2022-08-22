package arrays;

public class Duplicate {

	public static void main(String[] args) {
		
		int arr[] = {1,2,3,4,2,7,8,8,3};
				   //0 1 2 3 4 5 6 7 8 --> array index
		
		for (int i=0; i<arr.length; i++)
		{
			for (int j=i+1; j<arr.length; j++)
			{
				if (arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
			}
		}

	}

}

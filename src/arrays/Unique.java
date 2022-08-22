package arrays;

public class Unique {

	public static void main(String[] args) {
		
		int arr[] = {10,20,20,30,30,40,50,50};
		
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i]!=0)
			{
				for (int j=i+1; j<arr.length; j++)
				{
					if (arr[i]==arr[j])
					{
						arr[j]=0;
					}
				}
			}
		}
		
		for (int i=0; i<arr.length; i++)
		{
			if (arr[i]!=0)
			{
				System.out.print(arr[i]+ " ");
			}
		}
	}

}

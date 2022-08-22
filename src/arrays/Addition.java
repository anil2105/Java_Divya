package arrays;

public class Addition {

	public static void main(String[] args) {
		
		//Multidimensional array
		
		int a[] [] = {{3,5,7}, {1,2,5}};
		int b[] [] = {{2,4,4}, {2,4,1}};
		int c[] [] = new int [2] [3];
		
		for (int i=0; i<=1; i++) //for incrementing the rows
		{
			for (int j=0; j<=2; j++) //for incrementing the columns for each row
			{
				c[i][j] = a[i][j] + b[i][j];
				
				System.out.print(c[i][j]+ " ");
			}
				System.out.println();
		}

	}

}


package arrays;

public class Multiplication {

	public static void main(String[] args) {
		
		int l[][] = {{1,2,3}, {4,5,6}, {7,8,9}};
		int m[][]= {{9,8,7}, {6,5,4}, {3,2,1}};
		int n[][] = new int [3][3];
		
		System.out.println(l.length); //3
		System.out.println(m.length); //3
		
		for (int i=0; i<=2; i++)
		{
			for (int j=0; j<=2; j++)
			{
				n[i][j] = l[i][j]*m[i][j];
						  
					/*
						l[0][0]*m[0][0] --> 1*9
						l[0][1]*m[0][1] --> 2*8
						l[0][2]*m[0][2] --> 3*7
						
						l[1][0]*m[1][0] --> 4*6
						l[1][1]*m[1][1] --> 5*5
						l[1][2]*m[1][2] --> 6*4
				 
						l[2][0]*m[2][0] --> 7*3
						l[2][1]*m[2][1] --> 5*5
						l[2][2]*m[2][2] --> 6*4
					*/
				
				System.out.print(n[i][j]+ " ");
				
			}
			
				System.out.println();
		}
		
		

	}

}

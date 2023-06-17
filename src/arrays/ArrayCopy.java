package arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		
		//(Object src, int srcPos, Object dest, int destPos, int length)
		
		char [] copyFrom = {'b','e','s','a','n','t','t','e','c','h','n','o','l','o','g','y'};
		
		char [] copyTo = new char [10];
		
		System.arraycopy (copyFrom, 6, copyTo, 0, 10);
		
		//System.out.println(String.valueOf(copyTo)); 
		System.out.println(String.valueOf(copyFrom));
		
		//System.out.println(copyTo);
		//System.out.println(copyFrom);
		
		
		

	}

}

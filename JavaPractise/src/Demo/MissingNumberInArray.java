package Demo;

public class MissingNumberInArray {

	public static int missingNumber(int[]array,int count)
	{
		int actualSum=0;
		int expectedSum = count*(count+1)/2;
		for(int i:array)
			
		{
			 actualSum = actualSum+i;
		}
		
				
		return expectedSum-actualSum;
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int missing=missingNumber(new int[] {1,2,3,4,5,7},7);
		
		System.out.println("Missing Number is:");

	}

}

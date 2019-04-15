package Demo;

public class ArrayContainsAnElement {

	int[] strArray = new int[6];
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]={1,2,3,4,5,6,};
		for(int i:array)
		{
			if(i==8)
			{
				System.out.println("Element is present ");
			}
			else
			{
				System.out.println("Element not present ");
			}
		}

	}

}

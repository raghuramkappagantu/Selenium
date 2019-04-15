package Demo;

public class ReverseNumber {

	
	public static int numReversal(int num)
	{
		int digit,revNum = 0;
		
		while(num>0)
		{
			digit=num%10;
			revNum=revNum*10+digit;
			num=num/10;
						
		}
		return revNum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Reveresed Num is: " + numReversal(12345));
		

	}

}

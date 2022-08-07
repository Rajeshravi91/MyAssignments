package week1.day1;

public class CheckIfTheNumberIsPositiveOrNegative {
	
int num = 35;
	
	public static void main(String[] args) {
		
		CheckIfTheNumberIsPositiveOrNegative obj = new CheckIfTheNumberIsPositiveOrNegative();
		
		if (obj.num>0)
		{
			System.out.println( obj.num + " is Positive");
		}
		else if (obj.num<0)
		{
			System.out.println( obj.num + " is Negative");
		}
		else
			System.out.println ( obj.num + " is neither positive nor negative");
	}
	

}

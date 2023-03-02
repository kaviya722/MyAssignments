package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 34343;
		int temp,sum = 0,remain;
		temp = num ;
		//for (int i = 0; i < 5 ; i++) 
		
		while(num>0)
		{
			remain = num % 10;
			sum =(sum * 10) + remain ;
			num =num/10;
			
		}
		if(temp==sum)    
			   System.out.println( temp + " is palindrome number ");    
			  else    
			   System.out.println(temp + " is not palindrome");    
		
	}

}

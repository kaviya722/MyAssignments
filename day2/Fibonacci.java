package week1.day2;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range = 8;
		int sum,firstno =0,secondno=1;
		//System.out.println(firstno);
		
		for (int i = 0; i < range; i++) {
			
			System.out.println(firstno);
			sum=firstno + secondno;
			firstno = secondno;
			secondno = sum;
			//System.out.println(sum);
		
		}
		
	}
	

}

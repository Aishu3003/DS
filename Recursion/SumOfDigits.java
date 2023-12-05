package Recursion;

public class SumOfDigits {
    
	public int sumofDigit(int number) {
		int remainder;
		
		remainder=number%10;
		return remainder+sumofDigit(number/10);
	
		
	}
	public static void main(String[] args) {
		SumOfDigits s=new SumOfDigits();
		System.out.println("Sum of Digits:"+s.sumofDigit(234));
	}
}

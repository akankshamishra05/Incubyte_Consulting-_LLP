package calculator;

import java.util.Scanner;

class StringCalculator{
	public  static int add (String input1, String input2) {
				
		if( input1 != null || input2 != null ) {
			int sum = 0;
			int num1 = Integer.valueOf(input1);
			int num2 = Integer.valueOf(input2);
			sum = num1 + num2;
			System.out.println(sum);
			return sum;
	
		}else
			System.out.println("0");
			return 0;
	}

}

class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringCalculator scalc = new StringCalculator();
		
		System.out.println("Enter first numeric number : ");
		String str1 = sc.nextLine();
		
		System.out.println("Enter second numeric number : ");
		String str2 = sc.nextLine();
		
		scalc.add(str1, str2);
		
	}
}

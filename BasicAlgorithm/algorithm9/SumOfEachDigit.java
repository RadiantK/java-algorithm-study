package algorithm9;

import java.util.Scanner;

public class SumOfEachDigit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		sc.close();
		
		int sum = 0;
		while(num != 0) {
			sum += num % 10;
			num = num/10;
		}
		System.out.println(sum);
	}

}

package backjoon11720;

import java.util.Scanner;

public class Back11720 {

	// ���ڿ��� ���ڷ� ��ȯ
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		String str = sc.next();
		int sum = 0;
		
		for(int i = 0; i < a; i++) {
			sum += str.charAt(i)-'0';
		}
		System.out.println(sum);
		sc.close();
	}

}
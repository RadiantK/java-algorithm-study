package backjoon4344;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Back4344 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr;
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine()," ");
			
			int x = Integer.parseInt(st.nextToken());
			arr = new int[x];
			
			double sum = 0;
			
			for(int k = 0; k < x; k ++) {
				int score = Integer.parseInt(st.nextToken());
				arr[k] = score;
				sum += score;
			}
			
			double avg = (sum / x) ;
			double count =0 ;
			for(int k=0; k < x; k++) {
				if(arr[k] > avg) {
					count++;
				}
			}
			System.out.printf("%.3f",(count/x)*100);
			System.out.println("%");
		}
		br.close();
	}
}

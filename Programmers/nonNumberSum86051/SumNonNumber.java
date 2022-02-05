package nonNumberSum86051;

class Solution {
    public int solution(int[] numbers) {
        // ���� ���ڸ� �˾Ƴ� �迭
        boolean[] check = new boolean[10];
		for (int num : numbers) {
			// �ִ� ���ڵ��� true
			check[num] = true;
		}
		
		int sum = 0;
		
		for(int i = 0; i < 10; i++) {
			// ���� ���ڵ��� ���� ������
			if(!check[i]) {
				sum += i;
			}
		}
        
        return sum;
    }
}

public class SumNonNumber {

	public static void main(String[] args) {

		Solution s = new Solution();
		
		int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};
		
		System.out.print(s.solution(numbers));
	}

}
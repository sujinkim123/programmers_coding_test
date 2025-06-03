package 코딩기초트레이닝;

public class Q120815 {
	
	public static int solution(int n) {
		
		int a = 6;
		int b = n;
		while(b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		
		int answer = (6 * n) / a / 6;
		return answer;
	}
	
	public static void main(String[] args) {
		int n = 4;
		System.out.println(solution(n));
	}

}

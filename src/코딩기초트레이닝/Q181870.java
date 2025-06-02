package 코딩기초트레이닝;

import java.util.*;

public class Q181870 {
	
	public static String[] solution(String[] strArr) {
		List<String> list = new ArrayList<>();
		for(String s : strArr) {
			if (!s.contains("ad")) {
				list.add(s);
			}
		}
		return list.toArray(new String[0]);
	}
	
	public static void main(String[] args) {
		String[] strArr1 = {"and", "notad", "abcd"};
		String[] strArr2 = {"there", "are", "no", "a", "ds"};
		System.out.println(Arrays.toString(solution(strArr1)));
		System.out.println(Arrays.toString(solution(strArr2)));
	}
	
}

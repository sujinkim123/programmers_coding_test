package 코딩기초트레이닝;

import java.util.*;

public class Q181886 {
	
	public static String[] solution(String[] names) {
		List<String> arrList = new ArrayList<>();
		for(int i = 0; i < names.length; i+=5) {
			arrList.add(names[i]);
		}
		return arrList.toArray(new String[0]);
	}
	
	public static void main(String[] args) {
		String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
		System.out.println(Arrays.toString(solution(names)));
	}
	
}

package TestGroup_PracticeProblems4B;

import java.util.ArrayList;
import java.util.Collections;

//21, 10, 01, 10, 01, 11
//max=21
public class A16_Exam {

	public static void main(String[] args) {
		String x = "2101011";
		int max = 0;

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < x.length() - 1; i++) {
			String val = x.substring(i, i + 2);
			list.add(Integer.parseInt(val));
		}
		System.out.println(list);
		System.out.println("Max value is: " + Collections.max(list));
		max = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (max > list.get(j)) {
					// max=list.get(i);
				} else {
					max = list.get(j);
				}
			}
		}
		System.out.println("MAX: " + max);
	}

}

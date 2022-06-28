package TestGroup_PracticeProblems4D;

import java.util.Arrays;

public class A36_Aangram {

	public static void main(String[] args) {
		String x = "He is Aradhya";
		String y = "Is he Aradhya";
		x = x.replace(" ", "");
		x = x.toLowerCase();
		y = y.replace(" ", "");
		y = y.toLowerCase();

		char[] xArray = x.toCharArray();
		char[] yArray = y.toCharArray();

		Arrays.sort(xArray);
		Arrays.sort(yArray);

		if (Arrays.equals(xArray, yArray)) {
			System.out.println("Aangram");
		}
	}

}

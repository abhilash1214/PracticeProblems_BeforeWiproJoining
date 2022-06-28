package TestGroup_PracticeProblems4B;

public class A20_Exam {
//10 25 1235
	public static void main(String[] args) {
		String x = "Im 10 years of 25 age 123F5";
		String[] xSplit = x.split(" ");

		for (String xSplit1 : xSplit) {
			String num = "";
			for (int i = 0; i < xSplit1.length(); i++) {
				if (xSplit1.charAt(i) >= '0' && xSplit1.charAt(i) <= '9') {
					num = num + String.valueOf(xSplit1.charAt(i));
				}
			}
			System.out.print(num+" ");
		}
	}

}

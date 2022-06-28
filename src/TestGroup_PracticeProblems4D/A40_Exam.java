package TestGroup_PracticeProblems4D;

public class A40_Exam {

	public static void main(String[] args) {
		String x = "Abilash";
		String y = "PL";

		x = x + y;
		y = x.substring(0, x.length() - y.length());
		System.out.println("Y Value: " + y);
		x = x.substring(y.length());
		System.out.println("X Value: " + x);
	}

}

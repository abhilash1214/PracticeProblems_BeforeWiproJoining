package TestGroup_PracticeProblems4D;

public class A41_Exam {

	public static void main(String[] args) {
		int[] a = { -5, 1, -40, 20, 6, 8, 7 };
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] + a[j] == 15) {
					System.out.println(a[i] + "...." + a[j]);
				}
			}
		}
	}
}

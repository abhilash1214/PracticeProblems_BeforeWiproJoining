package TestGroup_PracticeProblems4B;

//Not sure on the question
public class A18_Exam {

	public static void main(String[] args) {
		// String Sa = "abccbd";
		// int[] C = { 0, 1, 2, 3, 4, 5 };

		// String Sa = "aabbcc";
		// int[] C = { 1, 2, 1, 2, 4, 2 };

		String Sa = "aaaa";
		int[] C = { 3, 4, 5, 6 };

		int sum = 0;
		for (int i = 0; i < Sa.length() - 1; i++) {
			if (Sa.charAt(i) == Sa.charAt(i + 1)) {
				sum = sum + C[i] + C[i + 1];
			}
		}
		System.out.println(sum);
	}
}

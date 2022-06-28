package TestGroup_PracticeProblems4D;

//Separate characters, special char, no.s
public class A43_Exam {

	public static void main(String[] args) {

		String a = "@@ads334";
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) >= '1' && a.charAt(i) <= '9') {
				System.out.print("No: " + a.charAt(i));
			} else if (a.charAt(i) >= 'a' && a.charAt(i) <= 'z') {
				System.out.print("Charactes: " + a.charAt(i));
			}else {
				System.out.print("Special: " + a.charAt(i));
			}

		}
	}

}

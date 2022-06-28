package TestGroup_PracticeProblems4A;

public class A1_PrimeOrNot {

	public static void main(String[] args) {
		int no = 11;
		boolean b = true;
		for (int i = 2; i < no; i++) {
			if (no % i == 0) {
				b = false;
				break;
			}
		}
		if (b == true) {
			System.out.println("It is PRIME: " + no);
		} else {
			System.out.println("It is NOT PRIME: " + no);
		}

	}

}

package TestGroup_PracticeProblems4A;

public class A1b_PrimeOrNot {

	public static void main(String[] args) {
		A1b_PrimeOrNot a = new A1b_PrimeOrNot(13);
	}

	public A1b_PrimeOrNot(int no) {
		for (int i = 1; i < no; i++) {
			boolean b = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					b = false;
					break;
				}
			}
			if (b == true) {
				System.out.println("PRIME No: " + i);
			}
		}
	}
}

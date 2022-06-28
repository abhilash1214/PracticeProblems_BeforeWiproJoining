package TestGroup_PracticeProblems4A;

public class A4_ReverseANumber {

	public static void main(String[] args) {
		revUsingBufferBuilder();
		revStringFunction();
		revNumber();
	}

	// Using StringBuffer and StringBuilder classes
	public static void revUsingBufferBuilder() {
		int no = 12345;
		String noString = String.valueOf(no);

		StringBuilder sb1 = new StringBuilder(noString);
		System.out.println(sb1.reverse());

		StringBuffer sb2 = new StringBuffer(noString);
		System.out.println(sb2.reverse());
	}

	// Convert into a String and Reverse
	public static void revStringFunction() {
		int no = 123456;
		String noString = String.valueOf(no);
		char[] a = noString.toCharArray();
		char[] rev = new char[a.length];

		for (int i = 0; i < rev.length; i++) {
			rev[a.length - 1 - i] = a[i];
		}
		System.out.println(rev);
		String output = "";
		output = String.valueOf(rev) + output;
		System.out.println(output);
	}

	// Reverse no using int return type
	public static void revNumber() {
		int no = 1234567, val = 0, rev = 0;
		while (no != 0) {
			val = no % 10;
			rev = val + rev * 10;

			no = no / 10;
		}
		System.out.println(rev);
	}

}

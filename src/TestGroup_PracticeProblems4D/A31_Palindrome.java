package TestGroup_PracticeProblems4D;

//reviver
public class A31_Palindrome {

	public static void main(String[] args) {
		String x = "too Hot To HOOT";

		x = x.toUpperCase();
		x = x.replaceAll(" ", "");

		// Using Array concept
		char[] a = new char[x.length()];
		for (int i = 0; i < x.length(); i++) {
			a[x.length() - 1 - i] = x.charAt(i);
		}
		String c = String.valueOf(a);

		if (c.equals(x)) {
			System.out.println("IS Palindrome");
		}

		
		//This can also be done using Using StringBuffer or StringBuilder concepts
		
	}

}

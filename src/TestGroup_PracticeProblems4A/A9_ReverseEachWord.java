package TestGroup_PracticeProblems4A;

public class A9_ReverseEachWord extends A8_CheckIfAllStringsAreUnique {

	A9_ReverseEachWord(String x) {
		super(x);
		System.out.println("IN CONSTRUCTOR");
	}

	public static void main(String[] args) {
		String y="Reversing Your Word";
		String[] ySplit=y.split(" ");
		for (int i = 0; i < ySplit.length; i++) {
			StringBuffer reverseEach= new StringBuffer(ySplit[i]);
			System.out.print(reverseEach.reverse());
			System.out.print(" ");
		}
	}

}

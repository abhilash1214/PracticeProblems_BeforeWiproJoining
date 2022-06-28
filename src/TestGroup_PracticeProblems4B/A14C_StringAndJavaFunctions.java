package TestGroup_PracticeProblems4B;

public class A14C_StringAndJavaFunctions {

	public static void main(String[] args) {
		//checkEligibility(31);
		checkEligibility(11);
		checkEligibility(31);
	}

	// 1. 'Throw' exception Example
	public static void checkEligibility(int age) {
		if (age > 22) {
			throw new ArithmeticException("Student is Eligible for Exam Registration");
		} else {
			System.out.println("Not Eligible");
		}
	}

}

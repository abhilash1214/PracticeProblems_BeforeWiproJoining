package TestGroup_PracticeProblems4A;

//153=1*1*1+5*5*5+3*3*3
public class A2_ArmstrongNumber {

	private void ArmstrongValidation(int no) {
		String noToString = String.valueOf(no);
		int sum = 0;
		for (int i = 0; i < noToString.length(); i++) {
			int eachVal = Character.getNumericValue(noToString.charAt(i));
			int mult = 1;
			for (int j = 0; j < noToString.length(); j++) {
				mult = eachVal * mult;
			}
			sum = sum + mult;
		}
		System.out.println(sum);

		if (sum == no) {
			System.out.println("IT IS ArmstrongNumber");
		} else {
			System.out.println("NOT ArmstrongNumber");
		}
	}

	public static void main(String[] args) {
		A2_ArmstrongNumber a = new A2_ArmstrongNumber();
		a.ArmstrongValidation(153);
	}

}

package TestGroup_PracticeProblems4D;

//SpyNumber 1124
//1*1*2*4=8  or 1+1+2+4=8
public class A30_Exam {

	public static void main(String[] args) {
		int no = 1124;

		String noString = String.valueOf(no);
		int mult = 1;
		int sum = 0;

		for (int i = 0; i < noString.length(); i++) {
			int eachNo = Character.getNumericValue(noString.charAt(i));
			mult = eachNo * mult;
		}

		for (int i = 0; i < noString.length(); i++) {
			int eachNo = Character.getNumericValue(noString.charAt(i));
			sum = eachNo + sum;
		}
		System.out.println(mult);
		System.out.println(sum);

		if (mult == sum) {
			System.out.println("Spy");
		}
	}
}

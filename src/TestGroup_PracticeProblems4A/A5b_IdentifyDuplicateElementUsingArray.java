package TestGroup_PracticeProblems4A;

//Identify duplicate elements in a string by using array concept
public class A5b_IdentifyDuplicateElementUsingArray {

	public static void main(String[] args) {
		String ele = "abzcdaezc";
		char[] eleArray = ele.toCharArray();

		for (int i = 0; i < eleArray.length; i++) {
			for (int j = i + 1; j < eleArray.length; j++) {
				if (eleArray[i] == eleArray[j]) {
					System.out.println("DUPLICATE: " + eleArray[i]);
				}
			}
		}
	}
}

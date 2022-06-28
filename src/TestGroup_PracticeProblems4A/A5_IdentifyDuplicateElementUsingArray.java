package TestGroup_PracticeProblems4A;

//Identify duplicate elements in a string by using array concept
public class A5_IdentifyDuplicateElementUsingArray {

	public static void main(String[] args) {
		String ele = "abzcdaezc";
		String[] eleArray = new String[ele.length()];

		for (int i = 0; i < eleArray.length; i++) {
			eleArray[i] = String.valueOf(ele.charAt(i));
		}

		for (int i = 0; i < eleArray.length; i++) {
			for (int j = i+1; j < eleArray.length; j++) {
				if (eleArray[i].equals(eleArray[j])) {
					System.out.println("DUPLICATE: " + eleArray[i]);
					break;
				}
			}
		}
	}
}

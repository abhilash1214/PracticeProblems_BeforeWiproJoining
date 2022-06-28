package TestGroup_PracticeProblems4D;

//Vowels, position
public class A22_VowelsPosition {

	public static void main(String[] args) {
		String name = "Abilash";
		name = name.toUpperCase();
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) == 'A' || name.charAt(i) == 'E' || name.charAt(i) == 'I' || name.charAt(i) == 'O'
					|| name.charAt(i) == 'U') {
				System.out.println("Vowel " + name.charAt(i) + " is at position: " + i);
			}
		}
	}

}

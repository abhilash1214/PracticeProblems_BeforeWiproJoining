package TestGroup_PracticeProblems4D;

//Aradhya Brilliance Centre
public class A32B_LowerToUpperCaseConversion {

	public static void main(String[] args) {
		String x = "aradhya brilliance centre";
		x = String.valueOf(x.charAt(0)).toUpperCase() + x.substring(1);

		char[] a = x.toCharArray();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == ' ') {
				a[i + 1] = Character.toUpperCase(Character.valueOf(a[i + 1]));
			}
		}
		System.out.println(a);
	}
}

package TestGroup_PracticeProblems4D;

public class A29_CopyAStringValue {

	public static void main(String[] args) {
		String x = "ABC Tech";
		char[] y = x.toCharArray();
		String output = "";

		for (int i = 0; i < y.length; i++) {
			y[i] = x.charAt(i);
			output = output + String.valueOf(y[i]);
		}
		System.out.println(output);

		// 2. Using StringBuilder
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.append(x));

		// 3. Using String Object
		String output3 = new String(x);
		System.out.println(output3);
	}

}

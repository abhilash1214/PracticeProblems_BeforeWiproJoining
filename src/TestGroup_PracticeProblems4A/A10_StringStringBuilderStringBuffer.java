package TestGroup_PracticeProblems4A;

public class A10_StringStringBuilderStringBuffer {

	public static void main(String[] args) {
		String x = "Sachin";
		x = x + " Tendulkar";
		System.out.println(x);

		String y = "Rahul";
		StringBuffer sb = new StringBuffer(y);
		// System.out.println(sb.reverse());
		// System.out.println(sb.insert(1,"zzz"));
		System.out.println(sb.delete(1, 3));
	}
}
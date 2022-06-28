package TestGroup_PracticeProblems4B;

public class A14B_StringFunctions extends A14_StringFunctions {
	public static void main(String[] args) {
//Sachin Tendulkar
		A14B_StringFunctions a = new A14B_StringFunctions();
		a.substring1("Sachin Tendulkar");
		a.substring2("Sachin Tendulkar", "*");
		a.equalsReferenceDifferences();
	}

	// 1. Substring Example
	public void substring1(String x) {
		String y = x.substring(1);
		String z = x.substring(0, 6);
		System.out.println(y);
		System.out.println(z);
		System.out.println("***************************************************************");
	}

	// 2. Substring + Concat Example
	@Override
	void substring2(String x, String y) {
		String actualOutput = "";
		for (int i = x.length(); i > 0; i--) {
			String output = x.substring(i - 1, i).concat(y);
			actualOutput = output + actualOutput;
		}
		System.out.println(actualOutput);
		System.out.println("***************************************************************");
	}

	// 3. String 'Equals' and 'Reference'
	//.Equals compares the values 
	//== compares the references
	@Override
	protected void equalsReferenceDifferences() {
		String s1 = "HELLO";
		String s2 = "HELLO";
		String s3 = new String("HELLO");
		System.out.println(s1 == s2);// true
		System.out.println(s1 == s3);// false
		System.out.println(s1.equals(s2));// true
		System.out.println(s1.equals(s3));// true
		System.out.println("***************************************************************");
		
		Thread t1= new Thread();
		Thread t2= new Thread();
		Thread t3= t1;
		System.out.println(t1==t2);//false
		System.out.println(t1==t3);//true
		System.out.println(t1.equals(t2));//true
		System.out.println("***************************************************************");
		
		String s11= new String("GEEKS");
		String s22= new String("GEEKS");
		System.out.println(s11==s22);//false
		System.out.println(s11.equals(s22));//true
	}
}

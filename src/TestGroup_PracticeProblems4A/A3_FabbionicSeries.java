package TestGroup_PracticeProblems4A;

//0,1,1,2,3,5,8...... a=0, b=1, c=a+b
public class A3_FabbionicSeries {

	public static void main(String[] args) {
	}

	static {
		int a = 0, b = 1, c = 0;
		System.out.print(a + ", " + b);
		for (int i = 0; i < 20; i++) {

			c = a + b;
			a = b;
			b = c;
			System.out.print(", " + b);
		}
	}
}

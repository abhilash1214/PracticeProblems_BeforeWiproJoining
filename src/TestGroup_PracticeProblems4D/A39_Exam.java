package TestGroup_PracticeProblems4D;

public class A39_Exam {

	//w, wx, wxy, wxyz, x, xy, xyz, y, yz, z, 
	public static void main(String[] args) {
		String x = "wxyz";
		x=x.concat("\0");
		
		for (int i = 0; i < x.length(); i++) {
			for (int j = i+1; j < x.length(); j++) {
				System.out.print(x.substring(i,j)+", ");
			}
		}
	}
}

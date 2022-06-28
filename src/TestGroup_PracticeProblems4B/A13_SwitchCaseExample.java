package TestGroup_PracticeProblems4B;

public class A13_SwitchCaseExample {

	public static void main(String[] args) {
		//switchCaseExample("Monday");
		//switchCaseExample("Tuesday");
		switchCaseExample("defauult");
	}

	public static void switchCaseExample(String day) {
		switch (day) {
		case "Monday":
			System.out.println("1");
		case "Tuesday":
			System.out.println("2");
		case "Wednesday":
			System.out.println("3");
		case "Thursday":
			System.out.println("4");
		case "Friday":
			System.out.println("5");
		case "Saturday":
			System.out.println("6");
			break;
		case "Sunday":
			System.out.println("7");

		default:
			System.out.println("Default Value");
		}
	}

}

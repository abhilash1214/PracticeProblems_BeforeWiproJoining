package TestGroup_PracticeProblems4D;

import java.util.HashMap;
import java.util.TreeSet;

//String, StringBuffer, StringBuilder
public class A24_StateStreet {

	public static void main(String[] args) {
		StringBuffer sb1 = new StringBuffer("StateStreet");
		StringBuffer sb2 = new StringBuffer("StateStreet");

		System.out.println(sb1.equals(sb2));// false ???
		System.out.println(sb1 == sb2);// false

		String s1 = "State Street";
		String s2 = new String("State Street");
		System.out.println(s1.equals(s2));// true

		// Print special characters
		String name = "StateStreet123!@#";
		name=name.toLowerCase();
		for (int i = 0; i < name.length(); i++) {
			if (!(name.charAt(i) >= '0' && name.charAt(i) <= '9') && !(name.charAt(i) >= 'a' && name.charAt(i) <= 'z')) {
				System.out.print(name.charAt(i));
			}
			System.out.println("************************************");
		}
		
		StringBuffer sb3 = new StringBuffer("StateStreet");
		StringBuffer sb4 = new StringBuffer("StateStreet");
		
		TreeSet<String> set= new TreeSet<String>();
		set.add(sb3.toString());
		set.add(sb4.toString());
		
		System.out.println(set);
		
		String str1 = new String("Sunil");
		String str2 = new String("Sunil");
		
		HashMap hm= new HashMap();
		hm.put(str1, "hello");
		hm.put(str2, "bye");
		//hm.put(str2, 1);
		
		System.out.println(hm);
	}

}

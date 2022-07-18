package test;

import org.junit.*;

public class ExerciseSevenHandleStringTest {
	
	@Before
	public void setUp() {
		
	}
	
	@Test
	public void handleString() {
		String s = "CODE";
		String repeat = "";
		String rev = "";
		String sFinal = "";
		
		System.out.println("First String: "+ s);
		
		//Here, We duplicate each letter
		for(int i=0;i<s.length();i++) {
			repeat = repeat + s.charAt(i) + s.charAt(i);
		}
		
		System.out.println("String with letters repeated: "+ repeat);
		
		//Here, We reverse the word
		StringBuilder stringBuilder = new StringBuilder(repeat);
		rev = stringBuilder.reverse().toString();
		
		System.out.println("String reverse: "+ rev);		
		
		//Here, Delete the last letter
		sFinal = rev.substring(0,rev.length()-1);
		
		System.out.println("Final String: "+ sFinal);
	}
	
	@After
	public void breakDown() {
	}
}

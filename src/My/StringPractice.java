package My;

import java.util.regex.Pattern;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="My Name is Sumit";
		
		
		System.out.println(Pattern.compile("^N").matcher("Name").find());
		
		for(String a:s.split(" ")) {
			if(Pattern.compile("^N").matcher("Name").find()==false){
				System.out.println(a);
			}
		}
	}

}

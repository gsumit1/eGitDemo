package My;

public class sharlock {

	public static void main(String[] arg) {
		
		
		String st="KKKK";
		
		try {
		for(int i=0; i<st.length();i++) {
			for(int j=1;j<st.length();j++) {
				
				
				
				String sb=st.substring(i+1, j);
				
				System.out.println(sb);
				
				
				
				
				
			}
		}
		
		}catch(Exception e) {}
		
		
	}
}

package My;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] a={58457907};
		
		List<Integer> al = Arrays.asList(a);

		Collections.sort(al);

		int k = 4;

		List<Integer> sl = al.subList(0, k);
		
		System.out.println(sl);
		
		int diff=sl.get(k-1)-sl.get(0);
		
		System.out.println(diff);

	}

}

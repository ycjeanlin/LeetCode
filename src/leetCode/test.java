package leetCode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class test {

	public static void main(String[] args) {
		String s = "abbaad";

		LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		for (char c : s.toCharArray()) {
			if (hm.get(c) != null) {
				Integer occ = hm.get(c);
				hm.put(c, ++occ);
				if (++occ > 1) {
					//O(1) operation
					lhs.remove(c);
				}
			} else {
				//O(1) operation
				hm.put(c, 1);
				lhs.add(c);
			}
		}
	        //O(1) operation		
		Iterator<Character> itr = lhs.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			break;
		}

	}

}

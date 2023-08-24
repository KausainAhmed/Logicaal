package programs100;

import java.util.HashMap;
import java.util.Map;

class RemDup {
	public static void main(String[] args) {
		String s = "elephantgavababavab";
		Map<String, Integer> m = new HashMap<>();
		String[] str = s.split("");
		for (String st : str) {

			if (m.containsKey(st)) {
				m.put(st, m.get(st) + 1);
			} else {
				m.put(st, 1);
			}

		}
		for (Map.Entry<String, Integer> pp : m.entrySet()) {
			System.out.println(" Key " + pp.getKey());
			System.out.println(" Value " + pp.getValue());
		}
	}
}

class RemDupStr {
	public static void main(String[] args) {
		String s = "hheelloohh";
		char[] ca = s.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (char o : ca) {
			if (map.containsKey(o)) {
				map.put(o, map.get(o) + 1);
			} else {
				map.put(o, 1);
			}
		}
		for (Map.Entry<Character, Integer> mm : map.entrySet()) {
			System.out.println("Key " + mm.getKey() + "  Value " + mm.getValue());

		}
	}
}

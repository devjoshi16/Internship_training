package training;

import java.util.HashMap;

public class _5_Duplichar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="abcabc";
		HashMap<Character, Integer> hashMap=new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			hashMap.put(str.charAt(i), 0);
			
		}
		for (int i = 0; i < str.length(); i++) {
			hashMap.put(str.charAt(i),hashMap.get(str.charAt(i)) + 1);
			
		}
//		for (Character name: hashMap.keySet()) {
//		    Character key = name;
//		    String value = hashMap.get(name).toString();
//		    System.out.println(key + " " + value);
//		}
		hashMap.forEach((key, value) -> System.out.println(key + " " + value));

	}

}

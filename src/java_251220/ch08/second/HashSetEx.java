package java_251220.ch08.second;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		
		Set<String> computerLangs = new HashSet<>();
		
		// 출력문: 향상된 for문
		for(String computerLang: computerLangs) {
			System.out.println("computerLang: " + computerLang);
		}
		System.out.println("=====================");
		
		computerLangs.add("HTML");
		computerLangs.add("Bootstrap");
		computerLangs.add("CSS");
		computerLangs.add("CSS");
		computerLangs.add("CSS");
		computerLangs.add("Javascript");
		computerLangs.add("Java");
		computerLangs.add("Java");
		
		for(String computerLang: computerLangs) {
			System.out.println("computerLang: " + computerLang);
		}
	}

}

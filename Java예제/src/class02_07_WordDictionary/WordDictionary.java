package class02_07_WordDictionary;

import java.util.HashMap;

public class WordDictionary {
	HashMap<String, String> words = new HashMap<>();
	
	public void addWord(String eng, String kor) {
		words.put(eng, kor);
	}
	
	public String find(String eng) {
		for(String key: words.keySet()) {
			if(eng.toUpperCase().equals(key.toUpperCase())) {
				return words.get(key);
			}
		}
		return null; //���� key�� ���� ��� null�� ��������.
	}
	
}

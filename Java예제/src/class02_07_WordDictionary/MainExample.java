package class02_07_WordDictionary;

import java.util.ArrayList;
import java.util.HashMap;

class Pokemon{
	String name;
	
	public Pokemon(String name) {
		this.name = name;
	}
	public String toString() {
		return name;
	}
}

public class MainExample {

	public static void main(String[] args) {
		ArrayList <Pokemon> arrayList = new ArrayList<>();
		arrayList.add(new Pokemon("�̻��ؾ�"));
		arrayList.add(new Pokemon("�̻��ز�"));
		arrayList.add(new Pokemon("�̻���Ǯ"));
		
	/*	System.out.println(arrayList.get(0));
		System.out.println(arrayList.get(1));
		System.out.println(arrayList.get(2));
*/		
		//HashMap
		//Key -> Value
		
		HashMap<String, Pokemon> pokedex = new HashMap<>();
		pokedex.put("��",  new Pokemon("��ī��"));
		pokedex.put("��2",  new Pokemon("����"));
		pokedex.put("��",  new Pokemon("������"));
		pokedex.put("��",  new Pokemon("�̻��ؾ�"));
		pokedex.put("��2",  new Pokemon("�̻���Ǯ"));
		
		pokedex.remove("��2");
		
		Pokemon poke001 = pokedex.get("��");
//		System.out.println(pokedex.get("��2"));
		
		for(String key: pokedex.keySet()) {
			System.out.println(pokedex.get(key));
		}
		
		System.out.println(poke001);
		
		
	}

}

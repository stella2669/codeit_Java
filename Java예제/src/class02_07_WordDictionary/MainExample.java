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
		arrayList.add(new Pokemon("이상해씨"));
		arrayList.add(new Pokemon("이상해꽃"));
		arrayList.add(new Pokemon("이상해풀"));
		
	/*	System.out.println(arrayList.get(0));
		System.out.println(arrayList.get(1));
		System.out.println(arrayList.get(2));
*/		
		//HashMap
		//Key -> Value
		
		HashMap<String, Pokemon> pokedex = new HashMap<>();
		pokedex.put("피",  new Pokemon("피카츄"));
		pokedex.put("피2",  new Pokemon("피츄"));
		pokedex.put("라",  new Pokemon("라이츄"));
		pokedex.put("이",  new Pokemon("이상해씨"));
		pokedex.put("이2",  new Pokemon("이상해풀"));
		
		pokedex.remove("피2");
		
		Pokemon poke001 = pokedex.get("이");
//		System.out.println(pokedex.get("피2"));
		
		for(String key: pokedex.keySet()) {
			System.out.println(pokedex.get(key));
		}
		
		System.out.println(poke001);
		
		
	}

}

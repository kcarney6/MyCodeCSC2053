import java.util.HashMap;
import java.util.Set;

public class hashTable {
	public static void main(String[] args) {
		int size = 5;
		String [] favFoods = new String[size];
		
		int kevin = Math.abs("kevin".hashCode());
		kevin = kevin % size;
		System.out.println(kevin);
		favFoods[kevin]= "burger";
		
		
		int steve = Math.abs("steve".hashCode());
		steve = steve % size;
		System.out.println(steve);
		favFoods[steve]= "pizza";
		
		int john = Math.abs("john".hashCode());
		john = john % size;
		System.out.println(john);
		favFoods[john]= "cookies";
		
		
		HashMap<String, String> map = new HashMap<>();
		map.put("NY", "Albany");
		
		Set<String> keys = map.keySet();
		for(String key: keys) {
			System.out.println("key is "+key+" value is "+map.get(key));
			//finnish coding this
		}
	}

}

package ping;

import java.util.HashMap;
import java.util.Map.Entry;

public class sampleApi {

	public int addNumbers(int a, int b) {
		int sum = a + b;
		// return value
		return sum;

	}

	public void hashMap() {

		HashMap<Integer, String> languages = new HashMap<>();
		languages.put(1, "Java");
		languages.put(2, "Python");
		languages.put(3, "JavaScript");
		System.out.println("HashMap: " + languages);

		System.out.print("Keys: ");
		for (Integer key : languages.keySet()) {
			System.out.print(key);
			System.out.print(", ");
		}

		System.out.print("\nValues: ");
		for (String value : languages.values()) {
			System.out.print(value);
			System.out.print(", ");
		}

		System.out.print("\nEntries: ");
		for (Entry<Integer, String> entry : languages.entrySet()) {
			System.out.print(entry);
			System.out.print(", ");
		}
	}

}

package hashmapGeneric;

/**
 * Creating an application having a generic HashMap with EmpCode as key and EmpName as value.
 */
import java.util.HashMap;
import java.util.Map;

public class HashEmployee { //Creating class

	public static void main(String[] args) {  //Main class
		/*
		 * HashMap class implements the map interface by using a hash table.
		 * A HashMap contains values based on the key and contains only unique elements.
		 * It inherits AbstractMap class and implements Map interface.
		 */
		
		//Creating hash map  with EmpCode as key and EmpName as value.
		HashMap<Integer,String> emplyoeeHash = new HashMap<Integer,String>();
		
		//Adding values in the hash table
		emplyoeeHash.put(245,"Karan");
		emplyoeeHash.put(248,"Mohit");
		emplyoeeHash.put(271,"Amit");
		emplyoeeHash.put(272,"Nitish");
		emplyoeeHash.put(250,"Varun");
		
		/*
		 * entrySet() returns a Set view of the mappings contained in this map.
		 * Map.Entry allows you to iterate over Map.entrySet() instead of having to iterate over Map.keySet() , 
		   then getting the value for each key.
		 */
		for (Map.Entry hashMap : emplyoeeHash.entrySet()) {  
			
			System.out.println("EmpName: "+hashMap.getValue()); //m.getvalue() returns the value corresponding to this entry.
		}
	}
}

// package HashTables;


// import java.util.*;
// import java.util.concurrent.ConcurrentHashMap;

// class Basics{
//     public static void main(String args[]){
//         //HashMap< K, V>
//         HashMap<String, Integer> map = new HashMap<>();
//         map.put("apple", 10);              // Insert or update
//         int val = map.get("apple");        // Retrieve
//         boolean hasKey = map.containsKey("apple");  // Check if key exists
//         map.remove("apple");              // Remove a key
//         int size = map.size();            // Get size
//         map.clear();                      // Clear all entries
        

//         // HashSet<E>
//         HashSet<String> set = new HashSet<>();

//         set.add("apple");                 // Add element
//         boolean exists = set.contains("apple");  // Check existence
//         set.remove("apple");             // Remove element
//         int size = set.size();           // Get size
//         set.clear();                     // Clear all                           
//         //LinkedhashMap<K,V>
//         LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

//         map.put("a", 1);                  // Insert or update
//         map.get("a");                     // Get value
//         map.remove("a");                  // Remove key
//         map.containsKey("a");            // Check key
//         map.keySet();                     // Get keys in insertion order

//         //LinkedHashSet<E>
//         LinkedHashSet<String> set = new LinkedHashSet<>();

//         set.add("x");                     // Add element
//         set.contains("x");                // Check if exists
//         set.remove("x");                  // Remove
//         set.size();                       // Size


//         //TreeMap<K, V> (Sorted keys)
//         TreeMap<String, Integer> map = new TreeMap<>();

//         map.put("banana", 2);            // Insert
//         map.get("banana");               // Get value
//         map.firstKey();                  // Get smallest key
//         map.lastKey();                   // Get largest key
//         map.subMap("a", "c");            // Range view (a ≤ key < c)

//         //ConcurrentHashTable<K,V>
//         ConcurrentHashMap<String, Integer> cmap = new ConcurrentHashMap<>();

//         cmap.put("a", 5);                // Insert
//         cmap.get("a");                   // Get
//         cmap.remove("a");                // Remove
//         cmap.containsKey("a");           // Check key
//     }
// }
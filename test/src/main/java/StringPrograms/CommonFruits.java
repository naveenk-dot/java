package StringPrograms;

import java.util.*;

public class CommonFruits {
    public static void main(String[] args) {
        // Sample lists of fruits
        List<String> list1 = Arrays.asList("apple", "banana", "orange", "apple", "mango");
        List<String> list2 = Arrays.asList("banana", "apple", "grape", "apple", "banana");

        HashMap<String,Integer> map1=new HashMap<>();
        HashMap<String,Integer> map2=new HashMap<>();
        
        for (String Fruit:list1)
        {
        	map1.put(Fruit,map1.getOrDefault(Fruit,0)+1);
        }
        
        for (String Fruit:list2)
        {
        	map2.put(Fruit,map2.getOrDefault(Fruit,0)+1);
        }
        
        
        int totalcount=0;
        for(String key :map1.keySet())
        {
        	if(map2.containsKey(key))
        		{
        			totalcount=map1.get(key)+map2.get(key);
        			
        			System.out.println(key.toString()+" "+totalcount);
	
        		}
        	
        
        }
        
    }
}

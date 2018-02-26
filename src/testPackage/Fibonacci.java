package testPackage;

import java.beans.Encoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Fibonacci {

	
	public static void main(String z[]) {
		
		Map<Character, Map<Integer, Double>> MapInsideOfAMap = getmapOfMap();
		  
	    for (Entry<Character, Map<Integer, Double>> outer : MapInsideOfAMap.entrySet()) {
	        System.out.println("Char: " + outer.getKey() + "\n");
	        
	        Map<Integer, Double> mapInner = MapInsideOfAMap.get(outer.getKey());
	        for (Map.Entry<Integer, Double> inner : mapInner.entrySet()) {
	        	 System.out.println(inner.getKey() +":"+ mapInner.get(inner.getKey()));
	        }
	    }
	}

	private static Map getmapOfMap() {
		char[] chArr = {'a','b','c','d','e','f','g','h','i','j','k'};
		HashMap<Character, Map<Integer, Double>> mapInsideOfAMap = new HashMap<Character, Map<Integer, Double>>();
		
		for(char ch:chArr) {
			mapInsideOfAMap.put(ch, getInnterMap());
			
		}
		return mapInsideOfAMap;
	}
	
	private static Map getInnterMap() {
		 Map<Integer, Double> map = new HashMap<>();
		 
		 for(int i=1000;i<1010;i++) {
			 map.put(i, new Double(String.valueOf(i)));
		 }
		 return map;
	}
	
}

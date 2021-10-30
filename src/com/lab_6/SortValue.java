package com.lab_6;


import java.util.List;


import java.util.ArrayList;
//import java.util.Collection;
import java.util.HashMap;
//import java.util.Map.Entry;

public class SortValue {
	
	public List getValues(){
		HashMap<Integer,String> hm=new HashMap<>();
		hm.put(21, "rohan");
		hm.put(27, "mohan");
		hm.put(30, "sohan");
		hm.put(24, "pawan");
		hm.put(20, "hawan");
		
		/*System.out.println(hm);
		for (Entry<Integer,String> entry : hm.entrySet())  {
			System.out.println(entry.getKey() + ": " + entry.getValue());	
		}
		return hm;*/
		 
		
		List<Integer> list = new ArrayList<Integer>(hm.keySet());
		for (Integer s : list) {
		    System.out.println(s);
		}
		return list;	
	}
	public static void main(String[] args) {
		SortValue sv = new SortValue();
		sv.getValues(); //calling getValues()
	}

}


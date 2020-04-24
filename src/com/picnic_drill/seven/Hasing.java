package com.picnic_drill.seven;

import java.util.*;


public class Hasing {
	public static void main(String arg[])
    {
        Map<Integer,String> map=new LinkedHashMap<Integer,String>();
        map.put(1,"TestVal1");
        map.put(2,"TestVal2");
        map.put(3,"TestVal1");
        map.put(4,"TestVal2");
        map.put(5,"TestVal2");
        map.put(6,"TestVal3");

       
        Set<String> valueSet=new TreeSet<String>(map.values());
        System.out.println("Set of unique values");
        System.out.println(valueSet);
        Iterator<String> iterator=valueSet.iterator();
        Map<Integer,String> uniqueMap=new HashMap<Integer,String>();
        while (iterator.hasNext()) {
            String value = iterator.next();
            for(Map.Entry<Integer,String> e:map.entrySet())
            {
                if(value.equals(e.getValue()) && !uniqueMap.containsValue(value))
                {
                    uniqueMap.put(e.getKey(), value);
                }

            }

        }
        System.out.println("After removing duplicate values from map");
        System.out.println(uniqueMap);

    }
	
}



/***************************OUTPUT********************************/
/*
 * 
Set of unique values
[TestVal1, TestVal2, TestVal3]
After removing duplicate values from map
{1=TestVal1, 2=TestVal2, 6=TestVal3


*/
/*****************************************************************/ 






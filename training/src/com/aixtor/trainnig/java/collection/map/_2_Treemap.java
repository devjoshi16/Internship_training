package com.aixtor.trainnig.java.collection.map;

import java.util.*;

public class _2_Treemap {
    public static void main(String[] args) {
        Map<Integer, String> map = new TreeMap<Integer,String>();
//        Comparator<Map.Entry<Integer,String>> keyComparator = Map.Entry.comparingByKey();


            map.put(4, "dev");
            map.put(5, "ronak");
            map.put(2, "keval");
            map.put(1, "dhruv");
            map.put(6, "myank");



            //print map
            System.out.println("printing all element");
            for (Map.Entry m : map.entrySet()) {
                System.out.println(m.getKey() + " " + m.getValue());
            }
            //add new element
            System.out.println("add new element");

            map.put(7, "new");
            for (Map.Entry m : map.entrySet()) {
                System.out.println(m.getKey() + " " + m.getValue());
            }
            System.out.println("remove element");

            //remove element
            map.remove(4);
            for (Map.Entry m : map.entrySet()) {
                System.out.println(m.getKey() + " " + m.getValue());
            }
            System.out.println("replace element");

//        replace element
            map.replace(2, "Edited");
            for (Map.Entry m : map.entrySet()) {
                System.out.println(m.getKey() + " " + m.getValue());
            }

            System.out.println("do map contain key =2?"+map.containsKey(2));
            System.out.println("do map contain value=new?"+map.containsValue("new"));



        }
}

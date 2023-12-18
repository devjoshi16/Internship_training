package com.aixtor.trainnig.java.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class _1_HashSet {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(2);
        hashSet.add(4);
        hashSet.add(6);
        hashSet.add(5);
        hashSet.add(4);
//        System.out.println(hashSet);
        Iterator it=hashSet.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
//        add element

        hashSet.add(56);

        while (it.hasNext())
        {
            System.out.println(it.next());
        }
        //        remove element
        hashSet.remove(6);

        while (it.hasNext())
        {
            System.out.println(it.next());
        }
//        remmove all
        hashSet.removeAll(hashSet);


        System.out.println("all element removed");
    }
}

package com.aixtor.trainnig.java.collection.set;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class _2_TreeSet {
    public static void main(String[] args) {
        Set<Integer> treeSet=new TreeSet<>();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(4);

//        print element
        Iterator it=treeSet.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
//        add element

        treeSet.add(56);

        while (it.hasNext())
        {
            System.out.println(it.next());
        }
        //        remove element
        treeSet.remove(6);

        while (it.hasNext())
        {
            System.out.println(it.next());
        }
//        remmove all
        treeSet.removeAll(treeSet);


        System.out.println("all element removed");

    }
}

package com.aixtor.trainnig.java.collection;

import java.util.HashSet;
import java.util.stream.Stream;
class customclass{
    String name;
    int id;

    public customclass(int i,String n){
        name = n;
        id =i;
    }
   
    @Override
    public int hashCode() 
    { 
        final int prime = 31; 
        int ans = 1; 
        ans = prime * ans + id; 
        ans = prime * ans + ((name == null) ? 0 : name.hashCode()); 
        return ans; 
    }

    @Override 
    public boolean equals(Object o) {
    	customclass obj = (customclass)o;
        if(this.id == obj.id)
            return (this.name == obj.name);

        return true;
    }

    @Override
    public String toString(){
        return name + " " +id;
    }
}
public class _8_HashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<customclass> hashSet=new HashSet<customclass>();
//		hashSet.add(new customclass(12, "name1"));
//		hashSet.add(new customclass(13, "name2"));
//		hashSet.add(new customclass(13, "name2"));
//		hashSet.add(new customclass(15, "name4"));
//		
		customclass s1=new customclass(12,	"name1");
		customclass s2=new customclass(12,	"name1");
		customclass s3=new customclass(13,	"name2");
		customclass s4=new customclass(14,	"name3");
		customclass s5=new customclass(15,	"name4");
		hashSet.add(s1);
		hashSet.add(s2);
		hashSet.add(s3);
		hashSet.add(s4);
		hashSet.add(s5);
		
		System.out.println(hashSet);
		
		

	}
}
//
//class customclass {
//	int id;
//	String name;
//
//	public customclass(int id, String name) {
//		
//		this.id = id;
//		this.name = name;
//	}
//
//	@Override
//	public String toString() {
//		return "customclass [id=" + id + ", name=" + name + "]";
//	}
////
////	public int compareTo(customclass o) {
////			return this.id<o.id?-1:1;
////		 
////	}
//	@Override
//	public int hashCode() {
//		final int prime=31;
//		int ans=this.id*prime;
//		ans=ans+name.hashCode();
//		return ans;
//		
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if(this.id==obj.id)
//		{
//			if(this.name==obj.name)
//				return true;
//		}
//		return false;
//	}
//	
//
//
//
//}

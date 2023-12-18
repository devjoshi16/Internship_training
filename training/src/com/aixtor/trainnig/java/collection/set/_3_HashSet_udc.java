package com.aixtor.trainnig.java.collection.set;

import java.util.HashSet;

public class _3_HashSet_udc {
    static class student_custom {
        String name;
        int id;

        public student_custom(int i, String n) {
            name = n;
            id = i;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int ans = 1;
            ans = prime * ans + id;
            ans = prime * ans + ((name == null) ? 0 : name.hashCode());
            return ans;
        }

        @Override
        public boolean equals(Object o) {
            student_custom obj = (student_custom) o;
            if (this.id == obj.id) return (this.name == obj.name);

            return true;
        }

        @Override
        public String toString() {
            return name + " " + id;
        }
    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        HashSet<student_custom> hashSet = new HashSet<student_custom>();
//		hashSet.add(new student_custom(12, "name1"));
//		hashSet.add(new student_custom(13, "name2"));
//		hashSet.add(new student_custom(13, "name2"));
//		hashSet.add(new student_custom(15, "name4"));
//
        student_custom s1 = new student_custom(12, "name1");
        student_custom s2 = new student_custom(12, "name1");
        student_custom s3 = new student_custom(13, "name2");
        student_custom s4 = new student_custom(14, "name3");
        student_custom s5 = new student_custom(15, "name4");
        hashSet.add(s1);
        hashSet.add(s2);
        hashSet.add(s3);
        hashSet.add(s4);
        hashSet.add(s5);

        System.out.println(hashSet);


    }
}

//class student_custom {
//	int id;
//	String name;
//
//	public student_custom(int id, String name) {
//
//		this.id = id;
//		this.name = name;
//	}
//
//	@Override
//	public String toString() {
//		return "student_custom [id=" + id + ", name=" + name + "]";
//	}
////
////	public int compareTo(student_custom o) {
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
//}

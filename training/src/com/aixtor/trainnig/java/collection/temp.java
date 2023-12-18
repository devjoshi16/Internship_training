import java.util.HashSet;


class Sstudent{
    String name;
    int id;

    Sstudent(String n,int i){
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
    public boolean equals(Object obj) {
        if(this.id == obj.id)
            return (this.name == obj.name);

        return true;
    }

    @Override
    public String toString(){
        return name + " " +id;
    }
}
public class temp {
    public static void main(String[] args) {
        HashSet<Sstudent> ts = new HashSet<Sstudent>();

        Sstudent s1 = new Sstudent("dhruv",1);
        Sstudent s2 = new Sstudent("dhruv",1);
        Sstudent s3 = new Sstudent("dhana",2);
        Sstudent s4 = new Sstudent("dhana",2);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        System.out.println(ts);
 
    }   
}
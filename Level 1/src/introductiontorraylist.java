import java.util.*;
public class introductiontorraylist {
    public static void main(String[] args)
    {
        ArrayList<Integer> list;
        list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);

//        list.set(0,1);//change existing value
//        list.set(1,2);//change existing value
//
//        list.add(0,500);//add a new value
//        list.add(list.size(),5000);//add a new value
//
//        list.remove(0);//remove a vvalue from its index

        //to get a value
      //  int val=list.get(0);
       // System.out.println(val);
        for( int i=0;i<list.size();i++){
            int val1=list.get(i);
            System.out.println(val1);
        }

        //anothr way of using for loop in array list
        for(int val:list){
            System.out.println(val);
        }




      //  System.out.println(list);
    }
}


package Gather;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetStudy {
    /*
    *
    *   Set :无序,不可重复的集合
    *   List:有序,可重复的集合
    *   Map :具有映射关系的集合
    *
    *
    * 优点：
    *       HashSet按Hash算法来存储集合中的元素  易存取查找性能好
    *
    * 特点：
    *      不能保证元素的排列顺序   （set集合哪个位置由这个值的hashcode决定）
    *       不可重复                （不能重复  是因为hashcode值不能重复）
    *       HashSet不是线程安全的
    *       集合元素可以使null
    *
    *
    *
    * */


    public static void main(String[] args) {
        Set  set=new HashSet();
        set.add(1); //添加元素

        set.add("a");

        System.out.println(set);

        set.remove(1);  //移除元素

        System.out.println(set);

        System.out.println(set.contains(1));
        set.clear();
        System.out.println(set);


        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");
        set.add("e");
        //使用迭代器遍历集合
        Iterator it=set.iterator();

        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        for (Object obj:set)
        {
            System.out.println(obj);
        }

        //泛型 只能存储尖括号里面的类型
      Set<String>  set1=new HashSet<String>();
        
    }


}

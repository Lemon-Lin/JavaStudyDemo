package Gather;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetStudy {

    public static void main(String[] args) {
        /*
        *
        * TreeSet  :   可以自然排序    可以定制排序
        *
        *
        * */


//        TreeSetStudy tre=new TreeSetStudy();
//        tre.treeSetMet();
          treeSetMet();

    }

    public static  void  treeSetMet()
    {
       /*
//       自然排序
        Set<Integer> set1=new TreeSet<Integer>();
        set1.add(1);
        set1.add(6);
        set1.add(3);
        set1.add(8);
        set1.add(2);

        //迭代器遍历
        Iterator<Integer> it=set1.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }
        //foreach遍历
        for (Object per:set) {
        }

        */



        Person p1=new Person(12,"李磊");
        Person p2=new Person(35,"小梦");
        Person p3=new Person(21,"小丽");
        Person p4=new Person(42,"小明");
        Person p5=new Person(65,"小花");

        Set<Person> set=new TreeSet<Person>(new Person());



        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);

        //循环出来
        Iterator it=set.iterator();

        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println("//////////////////////////////////////////");

        for (Person per:set) {
            System.out.println("姓名:"+per.name+"  年龄:"+per.age);
        }
    }

}

class  Person implements Comparator<Person>
{
    int age;
    String name;
    public Person() { }

    public Person(int age,String name)
    {
        this.age=age;
        this.name=name;
    }

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.age>o2.age)
        {
            return 1;
        }else if (o1.age<o2.age)
        {
            return -1;
        }else
        {
            return 0;
        }

    }
}

package Exc_3;

import java.util.Iterator;
import java.util.LinkedList;

public class Exc_03
{

    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(7);
        list.add(7);
        list.add(9);
        list.add(15);
        list.add(7);
        list.add(10);
        System.out.println(list);
        System.out.println(removeInRange(list,7,4,9));
    }

    public static LinkedList<Integer> removeInRange(LinkedList<Integer> list1, int value, int startIndex, int endIndex)
    {
        LinkedList<Integer> listen = new LinkedList<>();
        Iterator<Integer> iterator = list1.subList(startIndex,endIndex).iterator();
        listen.addAll(list1.subList(0,startIndex));
        while(iterator.hasNext())
        {
            int number = iterator.next();
            if(number!=value)
            {
                listen.add(number);
            }
        }
        listen.addAll(list1.subList(endIndex,list1.size()));
        return listen;
    }

}

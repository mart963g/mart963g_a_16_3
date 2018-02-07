import java.util.ArrayList;
import java.util.List;

public class Exc_02
{
    public static void main(String[] args)
    {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(1);
        list2.add(2);
        list1.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(6);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(alternate(list1,list2));
    }

    public static List<Integer> alternate(List<Integer> list1, List<Integer> list2)
    {
        List<Integer> list = new ArrayList<>();
        boolean second = false;
        int shortest = list1.size();
        if(shortest>list2.size())
        {
            shortest = list2.size();
            second = true;
        }
        for(int i = 0;i<shortest;i++)
        {
            list.add(list1.get(i));
            list.add(list2.get(i));
        }
        if(second)
        {
            list.addAll(list1.subList((int)(list.size()/2),list1.size()));
        }
        else
        {
            list.addAll(list2.subList((list.size()/2),list2.size()));
        }
        return list;
    }
}

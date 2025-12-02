import java.util.*;

public class SetExample
{
    public static void main(String []args)
    {
        Set<String> hSet = new HashSet<>();
        //Set<String> tSet = new TreeSet<>();

        hSet.add("Mary");
        hSet.add("Henry");
        hSet.add("John");
        hSet.add("Sarah");
        hSet.add("Julia");

        System.out.println(hSet);

        //no duplication item
        hSet.add("John");
        System.out.println(hSet);

        //remove from a set
        //hSet.remove("Ho");
        //hSet.clear();

        //check if a set contains an item
        System.out.println(hSet.contains("Mary"));

        for(String name: hSet){
            System.out.println(name);
        }

        hSet.forEach(System.out::println);

        Iterator<String> iterator = hSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        //remove duplicated item using tree set
        ArrayList<String> lastnames = new ArrayList<>();
        lastnames.add("Young");
        lastnames.add("Smith");
        lastnames.add("Bell");
        lastnames.add("Thomas");
        lastnames.add("Jones");
        lastnames.add("Williams");
        Set<String> nameSet = new TreeSet<>(lastnames);
        System.out.println(nameSet);
    }
}

public class ComparableExample {

    public static void main(String[] args){

        Person p1 = new Person("David", 21);
        Person p2 = new Person("Mary", 20);
        if(p1.compareTo(p2) > 0)
        {
            System.out.println(p1 + " is older than " + p2);
        }
        else if (p1.compareTo(p2) < 0)
            System.out.println(p1 + " is younger than " + p2);
        else
            System.out.println("Same age");
    }

}

class Person implements Comparable<Person>{

    String name;
    int age;

    public Person(String n, int a){
        name = n;
        age = a;
    }

    public int compareTo(Person other){
        return this.age - other.age;
    }

    @Override
    public String toString(){
        return this.name;
    }
}

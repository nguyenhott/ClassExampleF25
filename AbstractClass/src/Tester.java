public class Tester {

    public static void main(String[] args){

        Food meat = new Meat();
        meat.computeProtein(100);
        meat.computeFat(100);
        meat.displayCalories();

        Food veg = new Vegetable();

    }
}

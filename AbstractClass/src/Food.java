public abstract class Food {

    double protein;
    double fat;

    abstract double computeProtein(double weight);
    abstract double computeFat(double fat);

    public void displayCalories(){
        double calories = protein * 10 + fat * 15;
        System.out.println("Total calories: " + calories);
    }
}

public class Dancer {

    /*public void shake(int i){
        System.out.println("Shake with " + i);
    }

    public void shake(double d){
        System.out.println("Shake with " + d);
    }

    public void shake(String s){
        System.out.println("Shake with " + s);
    }*/

    public <E> void shake(E e){
        System.out.println("Shake with " + e);
    }
}

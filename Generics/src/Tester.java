public class Tester {

    public static void main(String[] args){

        /*Dancer dancer = new Dancer();
        dancer.shake(1);
        dancer.shake("Left arm");
        dancer.shake(1.4);
        */

        GenericStack<Integer> iStack = new GenericStack<>();
        iStack.push(1);
        iStack.push(5);
        iStack.push(7);

        System.out.println(iStack);

        System.out.println("pop");
        iStack.pop();
        System.out.println(iStack);

        GenericStack<String> sStack = new GenericStack<>();
        sStack.push("David");
        sStack.push("Maria");
        System.out.println(sStack);
    }
}

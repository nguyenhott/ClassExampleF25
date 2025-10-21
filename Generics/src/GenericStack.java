public class GenericStack <E> {

    E[] stack;
    public final int Capacity = 100;
    int top;

    public GenericStack(){
        stack = (E[]) new Object[Capacity];
        top = -1;
    }

    public void push(E item){
        if(top < Capacity){
            stack[top + 1] = item;
            top += 1;
        }
    }

    public void pop(){
        if(top >=0)
            top -= 1;
    }

    @Override
    public String toString(){
        String s = "";
        for(int i = 0; i <= top; i++){
            s += stack[i] + "\n";
        }
        return s;
    }
}

public class StringStack {

    String[] stack;
    public final int Capacity = 100;
    int top;

    public StringStack(){
        stack = new String[Capacity];
        top = -1;
    }

    public void push(String item){
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

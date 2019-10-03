import java.util.ArrayList;

public class Practical2{
    public static void main(String args[]) throws Exception {
        StaticStack stack1 = new StaticStack(10);
        DynamicStack stack2 = new DynamicStack();
        for(int i=0;i<10;i++) {
            System.out.println("Pushed "+i+" in stack 1");
            stack1.push(Integer.valueOf(i));
            System.out.println("Pushed "+i+" in stack 2");
            stack2.push(Integer.valueOf(i));
        }

        for(int i=0;i<9;i++) {
            System.out.println("Popped "+stack1.pop()+" from stack 1");
            System.out.println("Popped "+stack2.pop()+" from stack 2");
        }
    }
}

abstract class Stack<e>{
    public abstract void push(e element) throws Exception;
    public abstract e pop() throws Exception;
}

class StaticStack extends Stack<Integer> {
    private Integer stack[];
    private int top;
    private int size;
    public StaticStack(int size) {
        this.stack = new Integer[size];
        this.top = -1;
        this.size = size;
    }

    public void push(Integer e) throws Exception{
        if(this.top == (this.size - 1) ) {
            throw new Exception("Stack is FULL");
        }
        this.stack[++top] = e;
    }

    public Integer pop() throws Exception {
        if(this.top == -1) {
            throw new Exception("Stack is empty");
        }
        return stack[top--];
    }
}

class DynamicStack extends Stack<Integer>{
    private ArrayList<Integer> stack;

    public DynamicStack() {
        this.stack = new ArrayList<>();
    }

    public void push(Integer e) throws Exception{
        this.stack.add(e);
    }

    public Integer pop() throws Exception{
        if(this.stack.isEmpty()) {
            throw new Exception("Stack is Empty");
        }
        Integer ret = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return ret;
    }
}
import java.util.ArrayList;

public class Stack {
    private ArrayList<Integer> stack;
    public Stack() {
        stack = new ArrayList<>();
    }
    //last in first out
    public  void push(int addingItem){
        //normal adding
        stack.add(addingItem);
    }
    public void pop(){
        //remove at back
        stack.remove(stack.size()-1);
    }

    public int size(){
        return stack.size();
    }
    public int top(){
        return stack.get(stack.size()-1);
    }
    public boolean isEmpty(){
        if (stack.size()==0) {
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isFull(){
        return stack.size()==20;
    }
}


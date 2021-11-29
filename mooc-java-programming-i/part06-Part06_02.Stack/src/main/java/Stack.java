import java.util.ArrayList;

public class Stack {
    private ArrayList<String> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    // - returns a boolean-type value (true or false) that tells whether or not the stack is empty.
    public boolean isEmpty() {
        if (this.stack.size() == 0) {
            return true;
        }
        return false;
    }

    // - Adds the value given as a parameter to the top of the stack.
    public void add(String value) {
        stack.add(value);
    }

    //  - returns the values ​​contained in the stack as a list.
    public ArrayList<String> values() {
        return this.stack;
        }
    
    public String take() {
        String last = this.values().get(this.stack.size() -1);
        this.stack.remove(this.stack.size()-1);
        return last;
    }
}

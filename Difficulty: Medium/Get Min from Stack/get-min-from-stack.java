class SpecialStack {
    Stack<Integer> mainStack;
    Stack<Integer> minStack;
    public SpecialStack() {
        // Define Stack
        mainStack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        // Add an element to the top of Stack
        // mainStack.push(x);
        // if(mainStack.isEmpty()){
        //     minStack.push(x);
        // }
        // else{
        //     minStack.push(Math.min(x, minStack.peek()));
        // }
        mainStack.push(x);

    if (minStack.isEmpty()) {
        minStack.push(x);
    } else {
        minStack.push(Math.min(x, minStack.peek()));
    }
    }

    public void pop() {
        // Remove the top element from the Stack
        if(!mainStack.isEmpty()){
            mainStack.pop();
            minStack.pop();
        }
    }

    public int peek() {
        // Returns top element of the Stack
        if(mainStack.isEmpty()){
            return -1;
        }
        return mainStack.peek();
    }

    boolean isEmpty() {
        // Check if the stack is empty
        return mainStack.isEmpty();
    }

    public int getMin() {
        // Finds minimum element of Stack
        if(minStack.isEmpty()){
            return -1;
        }
        return minStack.peek();
    }
}
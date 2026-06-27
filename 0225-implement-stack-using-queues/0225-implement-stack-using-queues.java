class MyStack {
    Queue<Integer> ans;
    Queue<Integer> temp;
    public MyStack() {
       ans=new LinkedList<>(); 
       temp=new LinkedList<>(); 
    }
    
    public void push(int x) {
        while(!ans.isEmpty())
        {
            temp.add(ans.remove());
        }

        ans.add(x);
        
        while(!temp.isEmpty())
        {
            ans.add(temp.remove());
        }
    }
    
    public int pop() {
        
        return ans.remove();
    }
    
    public int top() {
        return ans.peek();
    }
    
    public boolean empty() {
        return ans.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
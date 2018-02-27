package niuke;

import java.util.Stack;

public class class_5 {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	public void push(int node) {
		if (stack1.empty() && stack2.empty())
			stack2.add(node);
		else
			stack1.add(node);
	}

	public int pop() {
		if (stack2.size() != 0)
			return stack2.pop();
		else {
			// for(int i=0;i<stack1.size();i++){ 错误的写法：stack的size在不断变化
			int top = stack1.size();
			for (int i = 0; i < top; i++)
				stack2.add(stack1.pop());
		}
		return stack2.pop();
	}
}

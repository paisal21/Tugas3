package ASD3;

import java.util.Vector;
public class StackGeneric <T>{

		    private Vector<T> stack;

		    private int top = -1; 



		    public classstackgeneric() {

		        stack = new Vector<T>();

		    }
		    public void push(T value) {

		        stack.add(value);

		        top++;

		    }
		    public T pop() {

		        if (top == -1) {

		            return null; 
		        }

		        T temp = stack.get(top);

		        stack.remove(top);

		        top--;

		        return temp;

		    }
		    public boolean isEmpty(){

		        return top == -1;

		    }
		    public int size() {

		        return top+1;

		    }
		    public void cetak (){
		    	System.out.println(stack.toString());
		    }
}

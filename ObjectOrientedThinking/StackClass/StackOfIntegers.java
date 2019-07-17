package StackClass;

public class StackOfIntegers {
	private int[] elements;
	private int numberOfElement;
	private int capacity;
	
	public StackOfIntegers() {
		this(20);
	}
	
	public StackOfIntegers(int capacity) {
		this.capacity = capacity;
		elements = new int[capacity];	
		numberOfElement = 0;
	}
	
	public boolean isEmpty() {
		return (numberOfElement == 0);
	}
	
	public boolean isFull() {
		return (numberOfElement == capacity);
	}
	
	public int peek() {
		return elements[numberOfElement - 1]; 
		
	}
	
	public void push(int value) {
		 elements[numberOfElement] = value;
		 numberOfElement++;
	}
	
	public int pop() {
		numberOfElement--;
		return elements[numberOfElement];
	}
	
	public int getNumberOfElement() {
		return numberOfElement;
	}
	
}

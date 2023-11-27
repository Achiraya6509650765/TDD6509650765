package core;

public class Stack implements IStack {

    private static final int MAX_SIZE = 100; // Change this value based on your requirements
    private Object[] elements;
    private int size;

    public Stack() {
        this.elements = new Object[MAX_SIZE];
        this.size = 0;
    }

    public Stack(int maxSize) {
        if (maxSize <= 0) {
            throw new IllegalArgumentException("Max size must be a positive number");
        }
        this.elements = new Object[maxSize];
        this.size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void push(Object element) throws PushToFullStackException {
        if (isFull()) {
            throw new PushToFullStackException("Stack is full. Cannot push more elements.");
        }
        if (size > 0 && element.getClass() != elements[size - 1].getClass()) {
            throw new PushToFullStackException("All elements in the stack must be of the same type.");
        }
        elements[size++] = element;
    }

    @Override
    public boolean isFull() {
        return size == elements.length;
    }

    @Override
    public Object getTop() {
        if (isEmpty()) {
            return null; // or throw an exception if you prefer
        }
        return elements[size - 1];
    }

    @Override
    public Object pop() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is empty. Cannot pop.");
        }
        return elements[--size];
    }
}

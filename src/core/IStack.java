package core;

public interface IStack {

	int getSize();
	boolean isEmpty();
	void push(Object element) throws Exception;
	boolean isFull();
	Object getTop();
	Object pop() throws Exception;
	
}

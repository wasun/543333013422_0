package BinaryHeap;

public class BinaryHeap {
	
	private Object[] elementData = new Object[1];
	private int size = 0;
	

	public BinaryHeap() { }
	
    public void enqueue(Object e) {
        ensureCapacity(size + 1);
        elementData[size] = e;
        fixUp(size);
        size++;
     }


	private void fixUp(int size2) {
		
		
	}

	private void ensureCapacity(int i) {
		
	}


			
			
			

}


package arraylist;

public class TestArrayList {

	
	public static void main(String[] args) {
		ArrayListQueue aq = new ArrayListQueue();
		aq.enQueue("AA");
		aq.enQueue("BB");
		aq.enQueue("CC");
		aq.enQueue("DD");
		aq.enQueue("EE");

		System.out.println(aq);
		aq.deQueue();

		System.out.println(aq);
		System.out.println(aq.peek());


		System.out.println("#################################");
		ArrayList arr = new ArrayList();
		arr.add("A");
		System.out.println(arr);
		arr.add("B");
		System.out.println(arr);
		arr.add("C");
		System.out.println(arr);
		arr.add(2, "D");
		System.out.println(arr);
		System.out.println("#################################");
	}

}
package Lab2ArrayList;

public class TestArrayList {
	public static void main(String[] args) {
		ArrayListQueue aq = new ArrayListQueue();
		aq.enQueue("AAA");
		aq.enQueue("BBB");
		aq.enQueue("CCC");
		aq.enQueue("DDD");
		aq.enQueue("EEE");

		System.out.println(aq);
		aq.deQueue();

		System.out.println(aq);
		System.out.println(aq.peek());


		System.out.println("###############################");
		ArrayList arr = new ArrayList();
		arr.add("A");
		System.out.println(arr);
		arr.add("B");
		System.out.println(arr);
		arr.add("C");
		System.out.println(arr);
		arr.add(2, "D");
		System.out.println(arr);
		arr.add("E");
		System.out.println(arr);
		System.out.println("###############################");
	}

}
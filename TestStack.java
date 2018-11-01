class TestStack {
	public static void main(String args[]) {
		Stack mystack1 = new Stack();
		Stack mystack2 = new Stack();
		
		// заталкивание числа в стек
		for(int i=0; i<10; i++) mystack1.push(i);
		for(int i=10; i<21; i++) mystack2.push(i);

		// Выталкивает эти числа из стека
		System.out.println("Стек в mysteck1: ");
		for(int i=0; i<11; i++)
			System.out.println(mystack1.pop());

		System.out.println("Стек в mysteck2: ");
		for(int i=0; i<10; i++)
			System.out.println(mystack2.pop());
	}
}
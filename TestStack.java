class TestStack {
	public static void main(String args[]) {
		Stack mystack1 = new Stack();
		Stack mystack2 = new Stack();
		
		// ������������ ����� � ����
		for(int i=0; i<10; i++) mystack1.push(i);
		for(int i=10; i<21; i++) mystack2.push(i);

		// ����������� ��� ����� �� �����
		System.out.println("���� � mysteck1: ");
		for(int i=0; i<11; i++)
			System.out.println(mystack1.pop());

		System.out.println("���� � mysteck2: ");
		for(int i=0; i<10; i++)
			System.out.println(mystack2.pop());
	}
}
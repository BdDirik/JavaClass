// Демонстрация использования значения типа boolean.
class BoolTest {
	public static void main(String args[]) {
		boolean b;

		b = false;
		System.out.println("b равна " + b);
		b = true;
		System.out.println("b равна " + b);
		
		//значением типа boolean может управлять if
		if(b) System.out.println("Это выполняется");
		b = false;
		if(b) System.out.println("Это не выполняется");

		//результат сравнения значения типа boolean
		System.out.println("10>9 равно " + (10>9));
	}
}
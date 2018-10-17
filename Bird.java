public class Bird {
	
	public void fly(int z) {
		System.out.println("I can fly" + z);
	}
	public int flyBack(int b) {
		return b*2;
	}
	public static void main(String args[]) {
		Bird i = new Bird();
		i.fly(10);
		System.out.println(i.flyBack(20));
	}

}
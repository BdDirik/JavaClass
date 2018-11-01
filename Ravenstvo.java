public class Ravenstvo {
	public boolean result(int a) {
		return a%2 != 0;
	}
	public boolean sgrtB(double b) {
		return Math.sqrt(b) > b/4;
	}
	public static void main(String args[]) {
		int i = (int) 5;
		Ravenstvo rav = new Ravenstvo();
		System.out.println(rav.result(i));
		System.out.println(rav.sgrtB(40));
	}
}	
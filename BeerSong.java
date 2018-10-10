public class BeerSong {
	public static void main(String args[]) {
		int beerNum = 10;
		String word = "бутылок (бутылки)";


		System.out.println(beerNum + " " + word + " пива на стене");

		while (beerNum > 0) {
			System.out.println(beerNum + " " + word + " пива.");
			System.out.println("Возьми одну.");
			System.out.println("Пусти по кругу.");
			beerNum--;

			if (beerNum == 1) {
				word = "бутылка";
			}
		
			if(beerNum > 0) {
				System.out.println(beerNum + " " + word + " пива на стене");
				}
			else  {
			System.out.println("Нет бутылок на стене");
			}

		}
	}
}
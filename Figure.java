public class Figure {
	double random10() {
		return Math.random() * 10;
	}			
	double circleArea(double r) {
		return Math.PI * Math.pow(r,2);
	}

	public static void main(String args[]) {
		Figure figure = new Figure();
		double radius = figure.random10();
		double area = figure.circleArea(radius);
		System.out.println("Случайное число от 0 до 10: " + radius);
		System.out.println("площадь круга: " + area);
	}
} 
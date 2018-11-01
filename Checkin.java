public class Checkin {
	public static void main(String args[]) {
		Checkin wat = new Checkin();
//		System.out.println(wat.check(false,false));
//		System.out.println(wat.checkTree(false,false,false));		
//		wat.checkRange(52,0,4);
//		wat.checkNumber(0);
		wat.evenRange(0,10);
	}
	public boolean check(boolean a, boolean b){
		return a && !b;
	}
	public boolean checkTree(boolean a, boolean b, boolean c){
		return a && b && c || !a && !b && !c;
	}
	public void checkRange(int a, int b, int c){
		if(a>b && a<c || a<b && a>c){
			System.out.println("a находится между b и c");
		}
		else System.out.println("a не входит в диапазон");
	}
	public void checkNumber(int a){
		if (a>0) System.out.println("+");
		else if(a<0) System.out.println("-");
		else System.out.println("0");
	}
	public void evenRange(int a, int b){
		for(int i=a; i<=b; i++){
			if (i%2 == 0) System.out.println(i);
		}
	}
}
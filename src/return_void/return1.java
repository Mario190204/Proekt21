package return_void;

public class return1 {

	public static void main(String[] args) {
		int x = 5;
		int y = myFunc(x);
		System.out.println(y);
	}
	public static int myFunc(int x) {
		return 3*x;
	}


	}



package sec04.exam01;

public class MainStringArray {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("값의 수가 부족합니다.");
			System.exit(0);
		}

		String strNum1 = args[0];
		String strNum2 = args[1];

		System.out.println("값1: " + strNum1 + "  값2: " + strNum2);
	}
}

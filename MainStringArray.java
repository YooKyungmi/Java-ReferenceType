package sec04.exam01;

public class MainStringArray {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("���� ���� �����մϴ�.");
			System.exit(0);
		}

		String strNum1 = args[0];
		String strNum2 = args[1];

		System.out.println("��1: " + strNum1 + "  ��2: " + strNum2);
	}
}

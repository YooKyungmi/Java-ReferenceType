package sec04.exam01;

public class ArrayExample {

	public static void main(String[] args) {
		int[] score;
		score = new int[] { 90, 95, 100 };
		int sum1 = 0;
		for (int i = 0; i < 3; i++)
			sum1 += score[i];
		System.out.println("����: " + sum1);

		int sum2 = add(new int[] { 90, 95, 100 });
		System.out.println("����: " + sum2);
		System.out.println();
	}

	public static int add(int[] score) {
		int sum = 0;
		for (int i = 0; i < 3; i++)
			sum += score[i];
		return sum;
	}
}

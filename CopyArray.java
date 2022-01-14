package sec04.exam01;

public class CopyArray {

	public static void main(String[] args) {
		String[] oldArr= {"Yoo","Kyeong","Mi"};
		String[] newArr= new String[5];
		
		System.arraycopy(oldArr, 0, newArr, 0, oldArr.length);
		
		for (String i:newArr)
			System.out.print(i+" ");

	}

}

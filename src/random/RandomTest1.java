package random;

public class RandomTest1 {
	public static void main(String[] args) {
		long a = System.currentTimeMillis();	//많은 숫자도
		System.out.println(a);
		int b = (int)(a%10);	//10 나머지 값으로 반환하여 0-10사의 값이 랜덤으로 추출
		System.out.println(b);
	}
}

package helloworld_20240429;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 100;
		int b = 200;
		
		System.out.println(a+b);
		System.out.println(a/b); // 이것을 싱행하면 0.5가 아닌 0이 출력됨. 왜냐하면 정수로 변환되어 5가 탈락했기 때문  
		//사칙연산을 정수로 하면 무조건 정수로 출력
		
		double c =3.5;
		double d = 7.0;
		System.out.println(c+d); //실수 대 실수 연산은 답이 실수로 나옴
		System.out.println(d/c); //계산하면 2.0 즉 실수형태로 나옴. 답이 2라도 소숫점의 형태로 반환.
		
		int e = 10;
		double f = 2.5;
		
		System.out.println(e+f); //실수가 하나라도 섞이면 실수로 반환. 정수대 실수 연산은 실수로 답이 나옴.
		System.out.println(e/f);
		
		int r1;
		
		
		
		String str1 = (String)"3" + 10; // 문자열 + 정수를 연산하면 양쪽 다 문자열로 변환한 후 결합시킴
		System.out.println(str1);
		
		String numStr1 = "10";
		
		//int numInt1 = (int)numStr1; //파이썬에서는 가능하나 자바에서는 불가. (문자열을 정수로 변환하는 것)
		//자바에서는 문자열을 바로 정수로 바꿀 수 없다. 그럼 어떻게 바꾸는가 하면,
		
		
		Integer.parseInt(numStr1); //자바에서 문자열을 정수로 변환하는 방법
		
		
		String numStr2 = "3.14";
		double numDouble1 = Double.parseDouble(numStr2); //문자열을 실수로 변환
		//위의 변환방법들을 사용해야 할 경우는 매우 많아 꼭 기억해야 한다고.  java.lang 패키지에 속하는 클래스인데. 이것이 타입별로 있다고. byte로 바꾸려면 byte 등 모두 있다고.
		
		String numStr3 = "true";
		boolean numLogic = Boolean.parseBoolean(numStr3); //문자열을 논리값으로 변환
		System.out.println(str2);
		
		// int num1 = 100;
		//String str2 = (String) 100; // 자바에서는 숫자(정수, 실수)를 바로 문자열로 변환 불가. 반대도 안됨.
		
		int num1 = 100;
		String str2 = String.valueOf(num1); // 정수 100이 문자열 100으로 변환되어 저장됨. 이것도 많이 써먹음.
		
		System.out.println(str2);
		
	}

}

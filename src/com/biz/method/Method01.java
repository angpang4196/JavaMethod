package com.biz.method;

public class Method01 {
	
	/*
	 * int a = 0; // 명령문, statement
	 * 
	 * if() {     // 명령구문
	 *   .....
	 *   .....
	 *   .....
	 * }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// method : Java에 없는 새로운 명령문을 생성하는 것
		
		int intNum = 0;
		intNum = 3+4;
		intNum = 10 * 100;
		intNum += 20 + 30; // intNum = intNum + (20 + 30);
		
		// 하는 일이 아무것도 없는 명령문 실행
		numMethod();
		// System.out.println("반갑습니다"); 을 실행
		viewMessage();
		
		int intN = numMethod();  // return 이 있는 method는 = 오른쪽에서 사용가능 
		intN = plusM();

	}
	
	public static int plusM() {        // void keyword가 아닌 type 형 method에서는 return 문이 반드시 있어야 한다.
		return 3+4;                    // 이 method는 호출하는 곳에서 = 오른쪽에 사용될 수있다.
	}
	
	public static void viewMessage() {       // void로 된 method는 = 뒤에 올 수 없다.
		System.out.println("반갑습니다.");
		System.out.println("오늘은 목요일");
		return ;
		// void keyword가 포함된 method에서 return 명령문을 사용하면 그 아래쪽 모든 명령문을 무시하라 하는 것이다.
	}
	
	public static int numMethod() {
		return 0;
	}

}

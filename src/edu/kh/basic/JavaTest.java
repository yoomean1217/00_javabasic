package edu.kh.basic;

// (한 줄)주석: 컴파일러가 해석하지 않는 부분, 주로 코드 설명 작성

/* 범위주석
 * 
 */

// 컴파일러(Compiler) : 코드를 2진수(0,1)로 변환하는 번역기

// Jave 코드 실행 순서 :
// 코드 작성 -> ctrl + f11 실행  ( 컴파일러가 2진수로 번역 -> JVM이 실행 )
public class JavaTest {

	
	 // class : 자바 코드가 작성되는 영역
	
	public static void main(String[] args) {
		//main method(메소드) : 자바 애플리케이션(프로그램)을 실행하기 위해 반드시 필요한 메서드
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		// 숫자 연산
		
		System.out.println("1+2");
		System.out.println(1+2);
		
		// "" 안에 작성된 코드는 단순 문자열 인식
		// "" 안에 작성되지 않는 코드는 숫자, 변수로 인식
		
		System.out.println(50 -23);
        
		//""(문자열) + 숫자 함께 작성
		
		System.out.println("14 * 19= " +266);
		
		
	}

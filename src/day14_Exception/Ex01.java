package day14_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 * 예외 상황
		 * - 프로그램 의도(개발자 의도)와 다르게 동작하는 것들
		 * 예외 종류
		 * - 강제예외: throw
		 * - 예외전가: throws
		 * - 예외처리: try, catch
		 */
		
		Scanner input = new Scanner(System.in); 
			int x, y, result;
			System.out.println("수 입력: ");
			try {
				x = input.nextInt();
				y = input.nextInt();
				result = x/y;  //문제가 발생하면 catch 실행. 문제가 발생하지 않으면 try 실행.
				System.out.println("x / y = " + result);
			}catch(ArithmeticException e) {
//				e.printStackTrace(); //어떤 문제가 발생했는지 로그를 알려주는 것.
				System.out.println("0으로는 나눌수 없습니다.");
			}catch(InputMismatchException e) {
				System.out.println("문자를 입력할 수 없습니다");
			}
			
			System.out.println("다음 문장들 실행~");
			System.out.println("다음 문장들 실행~");
			System.out.println("다음 문장들 실행~");
			System.out.println("다음 문장들 실행~");
//			result = x/y;
//			System.out.println("x / y = " + result);
		
	}
	
	
}


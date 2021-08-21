package day14_Exception;

import java.io.IOException;

class A {
	public void test() {
		ProcessBuilder b = new ProcessBuilder("calc111");
		try {
			b.start();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public void display() {
		test();
	}
}

public class Ex04 {
	public static void main(String[] args) {
		/*
		try {
			b.start();
		}catch (IOException e) {
//			e.printStackTrace();
			System.out.println("해당 명령어는 존재하지 않습니다.");
		}*/
		A a = new A();
		a.display();
		System.out.println("다음 문장들 실행");
		
	}

}

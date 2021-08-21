package day14_Exception;

class BBB {
	public int aaa;
	}
class AAA extends BBB{
	public void test() {}
	public void catch1(int a) {
		System.out.println("정수: " + a);
	}
	public void catch1(String a) {
		System.out.println("문자열: " + a);
		
	}
	public void catch1(Object a) {
		System.out.println("오브젝트: " + a);
		
	}
	
}
public class Ex02 {
	public static void main(String[] args) {
		AAA a = new AAA();
//		Object a = new AAA();
		Object ss = "test"; //자식은 부모클래스에 저장이 가능함.

		a.catch1(11);
		a.catch1("aaa");
		
		
	}

}

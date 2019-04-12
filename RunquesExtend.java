import java.util.Scanner;

public class RunquesExtend {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("1. 오각형 넓이 구하기");
		System.out.println("메뉴를 선택해 주세요");
		
		int selectMenu=s.nextInt();
		
		quesExtend1 test = null;
		if (selectMenu == 1) {
			test = new quesExtend2();
		} else ;
		
		test.inputValue();
		test.printResult();
	}
}
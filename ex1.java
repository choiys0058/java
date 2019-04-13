import java.util.Random;
import java.util.Scanner;

//두개의 숫자를 입력받아 나눗셈동작연산을 수행하고
//객체클래스와 메인클래스 만들기
public class ex1 {//객체클래스, 부모클래스
	double number1=0;//첫번째 숫자 변수선언
	double number2=0;//두번째숫자 변수선언
	
	Scanner s=new Scanner(System.in);//키보드입력
	public void random() {
		System.out.println("첫번째 숫자를 입력하세요");
		this.number1=s.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		this.number2=s.nextInt();
			
			double outputNumber=0;
			
			for(int i=1; i<100; i++){
				
				outputNumber=(double)(this.number1/this.number2);
				System.out.println("결과값은:" + this.number1 + "나누기" 
						+ this.number2 + "=" + outputNumber + "입니다");	
		}
	}
	public void inputNumber() {
		
	}
		
	public void printResult() {
			
	}
}

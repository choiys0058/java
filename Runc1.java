import java.util.Scanner;

public class Runc1 {//클래스 C1 메인

	public static void main(String[] args) {
		C1[] sArray=new C1[10]; // 10개의 데이터 생성
		Scanner s=new Scanner(System.in); // 키보드입력
		
		for(int i=0; i<sArray.length; i++) { 
			sArray[i]=new C1(); // 
			System.out.println(""+(i+1)+"번째 학생");
			System.out.println("이름");
			sArray[i].name=s.nextLine();
			
			System.out.println("국어점수");
			sArray[i].korScore=s.nextInt();
			
			System.out.println("영어점수");
			sArray[i].engScore=s.nextInt();
			
			System.out.println("수학점수");
			sArray[i].mathScore=s.nextInt();
		}
		
		
	}
}
import java.util.Scanner;

public class Runc2 {

	public static void main(String[] args) {
		C2[] sArray=new C2[10]; // 10개의 데이터 생성
		Scanner s=new Scanner(System.in); // 키보드입력
		
		for(int i=0; i<sArray.length; i++) { 
			sArray[i]=new C2();  
			System.out.println(""+(i+1)+"번째 학생");
			System.out.println("이름: ");
			sArray[i].name=s.nextLine();
			System.out.println("국어점수: ");
			String korString=s.nextLine();
			sArray[i].korScore=Integer.parseInt(korString);
			System.out.println("영어점수");
			String engString=s.nextLine();
			sArray[i].engScore=Integer.parseInt(engString);
			System.out.println("수학점수");
			String mathString=s.nextLine();
			sArray[i].mathScore=Integer.parseInt(mathString);
		}
		
		
	}
}

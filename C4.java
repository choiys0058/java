import java.util.Scanner;

// 5명데이터입력받아 이름 국어 영어 수학 -> 총점, 평균, 전체데이터 
public class C4 {
	String name; //이름
	int korScore; //국어점수
	int engScore; //영어점수
	int mathScore; //수학점수
	
	public void inputScore() {
		Scanner s = new Scanner(System.in);
		System.out.println("이름을 입력해주세요.");
		this.name = s.nextLine();
		
		System.out.println("국어점수를 입력해주세요.");
		String tmp = s.nextLine();
		this.korScore = Integer.parseInt(tmp);

		System.out.println("영어점수를 입력해주세요.");
		tmp = s.nextLine();
		this.engScore = Integer.parseInt(tmp);

		System.out.println("수학점수를 입력해주세요.");
		tmp = s.nextLine();
		this.mathScore = Integer.parseInt(tmp);
	}
}


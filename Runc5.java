// 중간고사 기말고사 성적
import java.util.Scanner;

public class Runc5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String tmp;
		System.out.println(name+"점수입력: ");
		System.out.println("중간고사");
		tmp=s.nextLine();
		this.middleScore=Integer.parseInt(tmp);
		System.out.println("기말고사");
		tmp=s.nextLine();
		this.finalScore=Integer.parseInt(tmp);
	

	}

}

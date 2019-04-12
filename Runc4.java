import java.util.Scanner;

public class Runc4 {

	public static void main(String[] args) {
		
C4[] sArr = new C4[5];
		
		for (int i = 0; i < sArr.length; i++) {
			sArr[i] = new C4();
			sArr[i].inputScore();
		}
		
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		
		for (int i = 0; i < sArr.length; i++) {
			korTotal = korTotal + sArr[i].korScore;
			engTotal = engTotal + sArr[i].engScore;
			mathTotal = mathTotal + sArr[i].mathScore;
		}
		
		System.out.println("±¹¾î ÃÑÁ¡Àº : " + korTotal);
		System.out.println("¿µ¾î ÃÑÁ¡Àº : " + engTotal);
		System.out.println("¼öÇÐ ÃÑÁ¡Àº : " + mathTotal);

		System.out.println("±¹¾î Æò±ÕÀº : " + ((double)korTotal / sArr.length));
		System.out.println("¿µ¾î Æò±ÕÀº : " + ((double)engTotal / sArr.length));
		System.out.println("¼öÇÐ Æò±ÕÀº : " + ((double)mathTotal / sArr.length));
			
	}
}
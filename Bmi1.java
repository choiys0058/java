import java.util.Scanner;

public class Bmi1 {
	
	public double kg1;
	public int cm1;
		
	public void inputData() {
		Scanner s=new Scanner(System.in);
		
		System.out.println("ü���� �Է��ϼ���: ");
		this.kg1=s.nextDouble();
		
		System.out.println("������ �Է��ϼ���: ");
		this.cm1=s.nextInt();
		
	}
	public void result() {
		double bmiResult=(double) this.kg1 / (this.cm1 * this.cm1);
		
		if(bmiResult>=30) {
			System.out.println("��");
		}else if(bmiResult>=24 && bmiResult<=29) {
			System.out.println("��ü��");
		}else if(bmiResult>=20 && bmiResult<=24) {
			System.out.println("����");
		}else if(bmiResult<20) {
			System.out.println("��ü��");
		}else if(bmiResult>=13 && bmiResult<=15) {
			System.out.println("����");
		}else if(bmiResult>=10 && bmiResult<=13) {
			System.out.println("���� ������");
		}else if(bmiResult<=10) {
			System.out.println("���ϴ� �Ҹ���");
			
			
		}
	}
}		
	
		
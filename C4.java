import java.util.Scanner;

// 5�������Է¹޾� �̸� ���� ���� ���� -> ����, ���, ��ü������ 
public class C4 {
	String name; //�̸�
	int korScore; //��������
	int engScore; //��������
	int mathScore; //��������
	
	public void inputScore() {
		Scanner s = new Scanner(System.in);
		System.out.println("�̸��� �Է����ּ���.");
		this.name = s.nextLine();
		
		System.out.println("���������� �Է����ּ���.");
		String tmp = s.nextLine();
		this.korScore = Integer.parseInt(tmp);

		System.out.println("���������� �Է����ּ���.");
		tmp = s.nextLine();
		this.engScore = Integer.parseInt(tmp);

		System.out.println("���������� �Է����ּ���.");
		tmp = s.nextLine();
		this.mathScore = Integer.parseInt(tmp);
	}
}


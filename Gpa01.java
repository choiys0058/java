import java.util.Scanner;

public class Gpa01 {
	public static void main(String[] args) {
		
		int ��������;
				
		System.out.println("���������� �Է����ּ���");
		Scanner s=new Scanner(System.in);
		��������=s.nextInt();
				
		if(��������==100 || ��������>=90 ) {
			System.out.println("A�����Դϴ�");
		}else if(��������==89 || ��������>=80 ) {
			System.out.println("B�����Դϴ�");
		}else if(��������==79 || ��������>=70  ) {
			System.out.println("C�����Դϴ�");
		}else if(��������==69 || ��������>=60  ) {
			System.out.println("D�����Դϴ�");
		}else if(��������==59 || ��������>=50  )
			System.out.println("F�����Դϴ�");
		}
	
	}



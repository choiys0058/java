import java.util.Scanner;

public class Runc2 {

	public static void main(String[] args) {
		C2[] sArray=new C2[10]; // 10���� ������ ����
		Scanner s=new Scanner(System.in); // Ű�����Է�
		
		for(int i=0; i<sArray.length; i++) { 
			sArray[i]=new C2();  
			System.out.println(""+(i+1)+"��° �л�");
			System.out.println("�̸�: ");
			sArray[i].name=s.nextLine();
			System.out.println("��������: ");
			String korString=s.nextLine();
			sArray[i].korScore=Integer.parseInt(korString);
			System.out.println("��������");
			String engString=s.nextLine();
			sArray[i].engScore=Integer.parseInt(engString);
			System.out.println("��������");
			String mathString=s.nextLine();
			sArray[i].mathScore=Integer.parseInt(mathString);
		}
		
		
	}
}

import java.util.Scanner;

public class Runc1 {//Ŭ���� C1 ����

	public static void main(String[] args) {
		C1[] sArray=new C1[10]; // 10���� ������ ����
		Scanner s=new Scanner(System.in); // Ű�����Է�
		
		for(int i=0; i<sArray.length; i++) { 
			sArray[i]=new C1(); // 
			System.out.println(""+(i+1)+"��° �л�");
			System.out.println("�̸�");
			sArray[i].name=s.nextLine();
			
			System.out.println("��������");
			sArray[i].korScore=s.nextInt();
			
			System.out.println("��������");
			sArray[i].engScore=s.nextInt();
			
			System.out.println("��������");
			sArray[i].mathScore=s.nextInt();
		}
		
		
	}
}
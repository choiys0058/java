
public class P1 {
	private int coin;
	public void deposit(int coin, String message) { //1. deposit �Ա��ϴ� ����� �������ش�, �޼����� �Է��ϱ� ���ؼ� �����Ѵ�  
		this.coin=this.coin+coin;
				
		if(message.equals(" ")) {
			System.out.println("���׶�"); 
		}else {
			System.out.println(message); 
			
		}
				
	}
	
}

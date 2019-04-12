import java.util.Scanner;

public class Runp1 {

	public static void main(String[] args) {
		P1 p1=new P1();
		Scanner s =new Scanner(System.in); 
		
		System.out.println("입금할 금액: ");
		int coin=s.nextInt();
		
		System.out.println("메세지: ");
		s.nextLine();
		
		String message=s.nextLine();
		p1.deposit(coin, message);
		
		if(message.equals("crash")) {
			
		}
				
	}

}

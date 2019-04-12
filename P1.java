
public class P1 {
	private int coin;
	public void deposit(int coin, String message) { //1. deposit 입금하는 방식을 지정해준다, 메세지를 입력하기 위해서 지정한다  
		this.coin=this.coin+coin;
				
		if(message.equals(" ")) {
			System.out.println("땡그랑"); 
		}else {
			System.out.println(message); 
			
		}
				
	}
	
}

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class C3 { // �Խ���
	String title;
	String description;
	String createData;
	
	Scanner s=new Scanner(System.in);
	System.out.println("����");
	? title=s.NextLine();
	System.out.println("����");
	? description=s.nextLine();
	
	long time=System.currentTimeMillis();
	SimpleDateFormat dayTime=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	this.createData=dayTime.format(new Date(time));
	
}

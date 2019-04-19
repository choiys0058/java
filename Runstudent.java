import java.util.Arrays;
import java.util.Random;

public class Runstudent {
	public static void main(String[] args) {
		Random r=new Random();
		Student[] student=new Student[10];
		for(int i=0; i<student.length; i++) {
			student[i]=new Student();
		}
		String[] names= {"이름1","이름2","이름3","이름4","이름5","이름6","이름7","이름8","이름9","이름10"};
		for(int i=0; i<student.length; i++) {
			student[i].name=names[i];
			student[i].kor=r.nextInt(101);
			student[i].eng=r.nextInt(101);
			student[i].math=r.nextInt(101);
		}
		for(int i=0; i<student.length; i++) {
			student[i].total=student[i].kor+student[i].eng+student[i].math;
		}
		Arrays.sort(student);
		for(int i=0; i<student.length; i++) {
			System.out.println(""+(i+1)+"등:"+student[i].print());
		}
	}
}


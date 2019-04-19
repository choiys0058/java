public class Student implements Comparable<Student>{
	String name;
	int kor;
	int eng;
	int math;
	int total;
	
	public String print() {
		return this.name+"����:"+this.total+"����:"+this.kor+"����:"+this.eng+"����:"+this.math;
	}
	@Override
	public String toString() {
		String tmp=String.format("%03d",this.total);
		return tmp;
	}
	@Override
	public int compareTo(Student o) {
		if(this.total<o.total) {
			return -1;
		}
		else if(this.total<o.total) {
			return 1;
		}
		return 0;
	}
}
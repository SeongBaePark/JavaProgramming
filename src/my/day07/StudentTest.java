package my.day07;

public class StudentTest {

	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.setName("박성배");
		stu1.setRollno("20141485");
		stu1.setAge(24);
		
		System.out.println("학생의 이름 : " + stu1.getName());
		System.out.println("학생의 학번 : " + stu1.getRollno());
		System.out.println("학생의 나이 : " + stu1.getAge());
		

	}

}

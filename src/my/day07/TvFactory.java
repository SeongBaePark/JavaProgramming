package my.day07;

public class TvFactory {
	
	public static void main(String[] args) {
		// Television tv1 = new Television(0, 0, true); // �⺻�����ڰ� �������� �ʾ����� ���� �����ڸ��� ȣ���Ѵ�.
		Television tv1 = new Television();
		Television tv2 = new Television(17, 50, true);
		Television tv3 = new Television(15, 40, true);
		
		tv1.print();
		tv2.print();
		tv3.print();
	}

}

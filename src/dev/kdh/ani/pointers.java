package dev.kdh.ani;

public class pointers {
	private int aa;
	private int bb;
	public pointers(){
		System.out.println("�ļ��� A�Դϴ�");
		//�����ڴ�  1.Ŭ������ �����ؾ߸� �Ѵ�  2.�������� ���� 3.������ �̹� �Ǿ�����
	}
	public pointers (int a, int b){
		this();
		aa=a;
		bb=b;
		System.out.println("������B�Դϴ�");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pointers obj=new pointers(10,20);
System.out.println(obj.aa);
System.out.println(obj.bb);
	}

}

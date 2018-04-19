package dev.kdh.ani;

public class pointers {
	private int aa;
	private int bb;
	public pointers(){
		System.out.println("셍성자 A입니다");
		//생성자는  1.클래스명가 동잃해야만 한다  2.리턴형이 없음 3.생략이 이미 되어있음
	}
	public pointers (int a, int b){
		this();
		aa=a;
		bb=b;
		System.out.println("생성자B입니다");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pointers obj=new pointers(10,20);
System.out.println(obj.aa);
System.out.println(obj.bb);
	}

}

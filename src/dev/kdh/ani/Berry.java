package dev.kdh.ani;

class Berry extends Fruit{
	protected String size;
	protected String name;

	public void set2(String a, String b){
		size=a; name=b;
	}
	public void Disp2(){
		System.out.println("�̸�:"+name);
		System.out.println("ũ��:"+size);
	}
}

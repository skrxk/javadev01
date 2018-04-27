package dev.kdh.ani;

public class Strawberry extends Berry{
	protected String color;
	protected int price;

	public void Set3(String a, int b){
		color=a; price=b;
	}
	public void Disp3(){
		System.out.println("»ö±ò:"+color);
		System.out.println("°¡°Ý:"+price);
	}

}

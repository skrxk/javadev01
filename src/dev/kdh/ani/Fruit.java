package dev.kdh.ani;

public class Fruit {
	protected String sort;
	protected String season;

	public void Set1(String a, String b) {
		sort=a; season=b;
		// TODO Auto-generated method stub

	}
	public void Disp1(){
		System.out.println("분류:"+sort);
		System.out.println("계절:"+season);
	}
}

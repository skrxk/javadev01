package dev.bacoder.kr.abst;

public class AbstrTest extends Abstr{

	@Override
	public String Disp() {
		// TODO Auto-generated method stub
		return "오버라이딩 메소드 입니다";
	}
	public static void main(String[]atgs){
		Abstr obj= new AbstrTest();
		System.out.println(obj.fun());
		System.out.println(obj.Disp());
	}

}

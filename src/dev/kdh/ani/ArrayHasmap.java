package dev.kdh.ani;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArrayHasmap {
//C.R.U.D
	//C:create,R:read,U:update,D:delete
// List<String>ls=new ArrayList<String>();
 //ls.add("Hi!"); -->리스트.add(아이템);
// ls.add(1,"have");-->리스트.add(인덱스,아이템);
// ls.get(1);
// ls.remove();
	public static void main(String[]args){
		//리스트 구조를 갖는 ArrayList 클래스의 생성객체생성
		List<String>ls=new ArrayList<String>();
		//리스트에 데이터 추가
		ls.add("HI!");
		ls.add("Have");
		ls.add("a Nice Day!");
		for(int i=0; i<ls.size(); i++){
			System.out.println(i+"."+ls.get(i).toString());
		}
		System.out.println();
		
		ls.add(3,"Evertbody~");
		for(int i=0; i<ls.size(); i++)
		System.out.println(i+"."+ls.get(i).toString());
		System.out.println();ls.remove(0);
		for(int i=0; i<ls.size();i++)
			System.out.println(i+"."+ls.get(i).toString());
		Iterator<String>Iter=ls.iterator();
		while(Iter.hasNext()){
			System.out.println(Iter.next());
		}
		
		ls.clear();
		if(ls.isEmpty()){
			System.out.println("list empty");
		}
}
 }

package dev.kdh.ani;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ArrayHasmap {
//C.R.U.D
	//C:create,R:read,U:update,D:delete
// List<String>ls=new ArrayList<String>();
 //ls.add("Hi!"); -->����Ʈ.add(������);
// ls.add(1,"have");-->����Ʈ.add(�ε���,������);
// ls.get(1);
// ls.remove();
	public static void main(String[]args){
		//����Ʈ ������ ���� ArrayList Ŭ������ ������ü����
		List<String>ls=new ArrayList<String>();
		//����Ʈ�� ������ �߰�
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

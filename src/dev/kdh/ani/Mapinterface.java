package dev.kdh.ani;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class Mapinterface {
	//Map=HastMap�� �θ�
	//���� map.get("String")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.�ʱ�ȭ Map<String,Sting>myMap=1new HashMap<>();
//2.���� �ִ´�. myMap.put(Ű,���);
		//3���� �����´�.myMap.get(Ű);.myMap,.get("name")
		//4�ʾȿ� Ư�� Ű�� �ִ��� Ȯ���ϱ�
		//myMap.containsKet("name")
		//1.�ʱ�ȭ �ϱ�
		Map<String,String>myMap=new HashMap<String,String>();
		Map<String,String>myMap1 =new HashMap<>();
		
		//2.�ʱ�ȭ�ϱ�
		myMap1.put("name","legned");
		myMap1.put("age", "25");
		myMap1.put("job","student");
		
		//3.Ű�� �̿��� ��� �˾Ƴ���
		System.out.println(myMap1.get("name"));
		System.out.println(myMap1.get("age"));
		System.out.println(myMap1.get("job"));
		
		//4.�ش� Ű�� ���� �Ǿ� �ִ���Ȯ��
		boolean isContainsKey=myMap.containsKey("name");
		if(isContainsKey){
			System.out.println("isContainskey:"+isContainsKey);
		}
		//5.�ش� ����� ���� �Ǿ� �ִ��� Ȯ��
		boolean isContainsValue=myMap.containsValue("student");
				if(isContainsValue){
					System.out.println("isContainsValue:"+isContainsValue);
				}
		//6.HashMap�� ������(����)�˾Ƴ���
		int mapSize = myMap.size();
		System.out.println("mapSize:"+mapSize);
		
		//7.while ��ȯ������  HashMap�� ��� ���� Ȯ���ϱ�
		showHashMAp(myMap);
		//8.remove�Լ��� ���� ���� �ϱ�
		boolean removeResult=myMap.remove("name", "legend");
		//boolean removeResult=myMap.remove("name")
		System.out.println("removeResult:"+removeResult);
		//������ �ߵǾ����� Ȯ������.
		showHashMAp(myMap);
		
		
		}
	public static void showHashMAp(Map<String,String>input){
	Iterator<String>Keys=input.keySet().iterator();
	while(Keys.hasNext()){
		String key=Keys.next();
		System.out.println("myMap.get(\""+key+"\")="+input.get(key));
	}
	}

}

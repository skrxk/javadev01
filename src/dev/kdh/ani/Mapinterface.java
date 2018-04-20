package dev.kdh.ani;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class Mapinterface {
	//Map=HastMap의 부모
	//사용법 map.get("String")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.초기화 Map<String,Sting>myMap=1new HashMap<>();
//2.값을 넣는다. myMap.put(키,밸류);
		//3값을 가져온다.myMap.get(키);.myMap,.get("name")
		//4맵안에 특정 키가 있는지 확인하기
		//myMap.containsKet("name")
		//1.초기화 하기
		Map<String,String>myMap=new HashMap<String,String>();
		Map<String,String>myMap1 =new HashMap<>();
		
		//2.초기화하기
		myMap1.put("name","legned");
		myMap1.put("age", "25");
		myMap1.put("job","student");
		
		//3.키를 이용해 밸류 알아내기
		System.out.println(myMap1.get("name"));
		System.out.println(myMap1.get("age"));
		System.out.println(myMap1.get("job"));
		
		//4.해당 키가 포함 되어 있는지확인
		boolean isContainsKey=myMap.containsKey("name");
		if(isContainsKey){
			System.out.println("isContainskey:"+isContainsKey);
		}
		//5.해당 밸류가 포함 되어 있는지 확인
		boolean isContainsValue=myMap.containsValue("student");
				if(isContainsValue){
					System.out.println("isContainsValue:"+isContainsValue);
				}
		//6.HashMap의 사이즈(길이)알아내기
		int mapSize = myMap.size();
		System.out.println("mapSize:"+mapSize);
		
		//7.while 순환문으로  HashMap의 모든 값을 확인하기
		showHashMAp(myMap);
		//8.remove함수로 값을 삭제 하기
		boolean removeResult=myMap.remove("name", "legend");
		//boolean removeResult=myMap.remove("name")
		System.out.println("removeResult:"+removeResult);
		//삭제가 잘되었는지 확인하자.
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

package dev.kdh.ani;

public class ArrayTset {
	public static void main(String[]argd){
		//TODO Auto-generated method stub
		int arr[20,30,50,60,80];
		int i;
		System.out.println("배열 원소의 값출력");
		for(i=0; i<arr.length; i++){
			System.out.println(
					"arr["
							+i+
							"]="
							+arr[i]
					);
		}
	}
}

package dev.kdh.ani;

import javax.swing.JOptionPane;

public class Jumsu {

	public static void main(String[] args) 
	{

		int[]test = new int[5];
		System.out.println(test.length+"명의 점수를 입력하십시오");
		for(int i=0; i<test.length; i++){
			test[i]=Integer.parseInt(JOptionPane.showInputDialog("점수를 입력하세요"));
		}
		for(int s=0; s<test.length-1; s++){
			for(int t=s+1; t<test.length; t++){
				if(test[t]>test[s]){
					int tmp= test[t];
					test[t]=test[s];
					test[s]=tmp;
				}
			}
		}
		for(int j=0; j<test.length; j++){
			System.out.println((j+1)+"번째있는사람의 점수는"+
					test[j]+"입니다");
		}
		System.out.println("가장 높은 점수는"+test[0]+"입니다");
	}
}


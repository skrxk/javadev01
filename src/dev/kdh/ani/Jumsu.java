package dev.kdh.ani;

import javax.swing.JOptionPane;

public class Jumsu {

	public static void main(String[] args) 
	{

		int[]test = new int[5];
		System.out.println(test.length+"���� ������ �Է��Ͻʽÿ�");
		for(int i=0; i<test.length; i++){
			test[i]=Integer.parseInt(JOptionPane.showInputDialog("������ �Է��ϼ���"));
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
			System.out.println((j+1)+"��°�ִ»���� ������"+
					test[j]+"�Դϴ�");
		}
		System.out.println("���� ���� ������"+test[0]+"�Դϴ�");
	}
}


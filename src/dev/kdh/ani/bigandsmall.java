package dev.kdh.ani;

import javax.swing.JOptionPane;

public class bigandsmall {
	public int getMax(int a, int b){
		int result=0;
		if(a>b){
			result=a;
		}
		else{result=b;
		}
			return result;
		
	}
	public int getmin(int a, int b){
		int result=0;
		if(a<b){
			result=a;
		}
		else{result=b;
		
	}
		return result;
	}
	
	public static void main(String[] args) {
		//  
		
		
		int max=0;
		int min=0;
		int num1;
		int num2;
		num1=Integer.parseInt(JOptionPane.showInputDialog("��1"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("��1"));
		bigandsmall Obj=new bigandsmall();
		max=Obj.getMax(num1, num2);
		min=Obj.getmin(num2, num1);
		System.out.println("�� ū����"+max+"�Դϴ�");
		System.out.println("�� ��������"+min+"�Դϴ�");
	}

}

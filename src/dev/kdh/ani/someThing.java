package dev.kdh.ani;

import javax.swing.JOptionPane;

public class someThing {

	public static void main(String[] args) {
		int num1=1;
		int sum=0;
		while(num1!=0){
			num1=Integer.parseInt(JOptionPane.showInputDialog("값1"));
			sum=sum+num1;
		}
		System.out.println("합계는="+sum);
	}

}

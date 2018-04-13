package dev.kdh.ani;

import javax.swing.JOptionPane;

public class aha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
	a=Integer.parseInt(JOptionPane.showInputDialog("점수입력: "));
	for(int i=a; i>=0; i--){
		System.out.println(i);
	}
	}

}

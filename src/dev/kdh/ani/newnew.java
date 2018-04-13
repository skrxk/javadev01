package dev.kdh.ani;

import javax.swing.JOptionPane;

public class newnew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0;
int i;
int sum=0;
a=Integer.parseInt(JOptionPane.showInputDialog("점수입력: "));
for(i=a; i>=0; i--){
	if(i%2==0){
	sum=sum+i;
	System.out.println(i+"+");
	}
	}
System.out.println("="+sum);
	}

}
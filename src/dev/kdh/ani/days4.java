package dev.kdh.ani;

import javax.swing.JOptionPane;

public class days4 {
public static void sum(int a, int b){
	System.out.println("����"+(a+b)+"�Դϴ�.");
	}
public static void main(String[]args){
	//TODA Auto-generated method stub
	int num1,num2;
	num1=Integer.parseInt(JOptionPane.showInputDialog("��1"));
    num2=Integer.parseInt(JOptionPane.showInputDialog("��2"));
  
    sum(num1,num2);
    //minus(num1,num2);
    //multi(num1,num2);
    
    days4 Obj=new days4();
    //Obj.sum(num1, num2);
}
}
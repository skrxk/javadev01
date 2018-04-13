package dev.kdh.ani;

import javax.swing.JOptionPane;

public class days4 {
public static void sum(int a, int b){
	System.out.println("합은"+(a+b)+"입니다.");
	}
public static void main(String[]args){
	//TODA Auto-generated method stub
	int num1,num2;
	num1=Integer.parseInt(JOptionPane.showInputDialog("값1"));
    num2=Integer.parseInt(JOptionPane.showInputDialog("값2"));
  
    sum(num1,num2);
    //minus(num1,num2);
    //multi(num1,num2);
    
    days4 Obj=new days4();
    //Obj.sum(num1, num2);
}
}
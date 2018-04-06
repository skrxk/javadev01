package dev.kdh.ani;

import javax.swing.JOptionPane;

public class IfElseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dat;
		String inputData = JOptionPane.showInputDialog("값입력:");
		dat=Integer.parseInt(inputData);
		if(dat%10 ==0){
			System.out.println(dat+"(은)는 10의 배수입니다");
		}else{
			System.out.println(dat+"(은)는 10의 배수가 아닙니다");

		}
	}

}

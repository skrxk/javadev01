package dev.kdh.ani;

import javax.swing.JOptionPane;

public class SwitchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int in_Num;
        in_Num=Integer.parseInt(JOptionPane.showInputDialog("��ȣ�Է�:"));
        
        switch(in_Num){
        case 1 :
         System.out.println("������ȸ�� �����ϼ̽��ϴ�.");break;
        case 2 :
        	System.out.println("��������� �����ϼ̽��ϴ�."); break;
        case 3 :
        	System.out.println("�����Ա��� ��û�ϼ̽��ϴ�."); break;
        case 4 :
        	System.out.println("������ü�� ��û�ϼ̽��ϴ�."); break;
        	default:
        		System.out.println("��ȣ�� �߸� �����̽��ϴ�");
        } /*switch���� �ݾ��� */
	}
}
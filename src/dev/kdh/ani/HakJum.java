package dev.kdh.ani;

import javax.swing.JOptionPane;

public class HakJum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int Jumsu ;
        char HakJum ;
        Jumsu=Integer.parseInt(JOptionPane.showInputDialog("�����Է�: "));
        		
        if(Jumsu >=90){
           HakJum = 'A';
           
        }else if(Jumsu >=80){
    	    HakJum ='B';
    }else if(Jumsu >=70){
    	    HakJum = 'C';
    }else if(Jumsu >=60){
    	    HakJum = 'D';
    }else{
    	HakJum = 'F';
    }
       
        
    System.out.println("����� ������ "+ HakJum +"�Դϴ�." );
	}
	}

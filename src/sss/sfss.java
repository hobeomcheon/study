package sss;

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;

	public class sfss {
	 public static void main(String[] args)throws IOException {
	  // TODO Auto-generated method stub
	  System.out.print("�ٲܹ��� �Է� : ");
	  BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); //���ڸ� ���۷�
	  
	  char[] ch = in.readLine().toCharArray();//�迭�� ����
	  
	 
	  System.out.print("�ٲ﹮�ڿ� : ");
	 
	  
	    for(int i = ch.length-1;  i >= 0; i--) {
	    
	    System.out.print(ch[i]);
	   }
	 }
	}


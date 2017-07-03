package sss;

	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;

	public class sfss {
	 public static void main(String[] args)throws IOException {
	  // TODO Auto-generated method stub
	  System.out.print("바꿀문자 입력 : ");
	  BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); //문자를 버퍼로
	  
	  char[] ch = in.readLine().toCharArray();//배열로 저장
	  
	 
	  System.out.print("바뀐문자열 : ");
	 
	  
	    for(int i = ch.length-1;  i >= 0; i--) {
	    
	    System.out.print(ch[i]);
	   }
	 }
	}


package phone;
import java.io.*;
public class LineNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader f = null; 
		try { 
			f= new FileReader("c:\\windows\\system.ini"); 
			int c ; 
			int count =1; //라인 넘버 선언 
			System.out.print(count++ + "  ");//라인 넘버를 증가
			while ((c= f.read()) != -1) { //아무 문자열도 없을 경우까지 반복
				System.out.print((char)c);//문자열을 출력
				if ( c== '\n') // 마지막 문자열 일 경우 라인넘버만 출력
					System.out.print(count++ + " ");
			}
		f.close(); 
		}
		catch (IOException e) { 
			System.out.println("입출력오류 ");
		}
	}

}

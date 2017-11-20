package phone;
import java.io.*;
public class UpperCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { 
			File f = new File("c:\\windows\\system.ini");//문자입력 스트림 
			FileReader fin = new FileReader(f); 
			int c; 
			while ((c= fin.read()) != -1) { //파일에서 하나의바이트 읽기 
				char a = (char)c;            
				if (Character.isLowerCase(a))//a 소문자 
					a = Character.toUpperCase(a);//c는 char
				System.out.print((char)a);
			}
			fin.close();
		}
catch (IOException e ) { 
	System.out.println("파일읽기 오류 ");
}
	}

}

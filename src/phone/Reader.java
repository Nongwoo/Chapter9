package phone;
import java.io.*; 
public class Reader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader fin = null; 
		try { 
			fin = new FileReader ("c:\\temp\\phone.txt"); 
			int c; 
			while ((c= fin.read()) != -1) { 
				System.out.print((char)c);
			}
			fin.close();
		}
		catch (FileNotFoundException e1) { 
			System.out.println("파일을 찾을 수 없습니다 " );
			}
		catch (IOException e) { 
			System.out.println("파일 읽기 오류");
		}
	}
}
		
	



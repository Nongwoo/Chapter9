package phone;
import java.io.*;
public class UpperCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { 
			File f = new File("c:\\windows\\system.ini");//�����Է� ��Ʈ�� 
			FileReader fin = new FileReader(f); 
			int c; 
			while ((c= fin.read()) != -1) { //���Ͽ��� �ϳ��ǹ���Ʈ �б� 
				char a = (char)c;            
				if (Character.isLowerCase(a))//a �ҹ��� 
					a = Character.toUpperCase(a);//c�� char
				System.out.print((char)a);
			}
			fin.close();
		}
catch (IOException e ) { 
	System.out.println("�����б� ���� ");
}
	}

}

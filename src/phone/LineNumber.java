package phone;
import java.io.*;
public class LineNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader f = null; 
		try { 
			f= new FileReader("c:\\windows\\system.ini"); 
			int c ; 
			int count =1; //���� �ѹ� ���� 
			System.out.print(count++ + "  ");//���� �ѹ��� ����
			while ((c= f.read()) != -1) { //�ƹ� ���ڿ��� ���� ������ �ݺ�
				System.out.print((char)c);//���ڿ��� ���
				if ( c== '\n') // ������ ���ڿ� �� ��� ���γѹ��� ���
					System.out.print(count++ + " ");
			}
		f.close(); 
		}
		catch (IOException e) { 
			System.out.println("����¿��� ");
		}
	}

}

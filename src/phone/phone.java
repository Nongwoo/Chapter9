package phone; 
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class phone {

	public static void main(String[] args) {
		FileWriter fw = null;
		File f = new File("c:\\temp\\phone.txt");
		try {                //���õ�ũ c �� temp ���Ͽ� �����Ѵ�. 
			fw = new FileWriter(f);
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("��ȭ��ȣ �Է� ���α׷��Դϴ�.");
			while(true) {  //�׸��� ĥ������ �ݺ��Ѵ�. 
				System.out.print("�̸� ��ȭ��ȣ >> ");
				String line = scanner.nextLine(); // ������ �д´�.
				if(line.equals("�׸�"))
						break;
				fw.write(line+"\r\n"); // �� �� ��� �����ϱ� ���� "\r\n"�� ���δ�.
			}
			System.out.println(f.getPath()+"�� �����Ͽ����ϴ�.");
			
			scanner.close();
			fw.close();
		} 
		catch (IOException e) { // ������ ������ �� ���� ���
			e.printStackTrace();
		}
	}

}

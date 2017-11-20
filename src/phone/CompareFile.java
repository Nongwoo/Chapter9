package phone;
import java.io.*;
import java.util.Scanner;

public class CompareFile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileInputStream srcStream = null; //src��Ʈ������ ��ǲ���� ����
		FileInputStream destStream = null;//dest��Ʈ������ ��ǲ����  ���� 
		
		System.out.println("��ü ��θ��� �ƴ� ���� �̸��� �Է��ϴ� ���, ������ ������Ʈ ������ �־�� �մϴ�.");
		         // phone�� ���Ͽ� ����1, ����1-���纻 �ؽ�Ʈ ������ �����Ͽ��� �Ѵ�. 
		System.out.print("ù��° ���� �̸��� �Է��ϼ���>>");
		String src = scanner.nextLine();
		System.out.print("�ι�° ���� �̸��� �Է��ϼ���>>");
		String dst = scanner.nextLine();
		System.out.println(src + "�� " + dst + "�� ���մϴ�.");
		try {
			srcStream = new FileInputStream(src);
			destStream = new FileInputStream(dst); 
			if (compareFile(srcStream, destStream))
				System.out.println("������ �����ϴ�.");
			else
				System.out.println("������ �ٸ��ϴ�.");
			
            if (srcStream != null) srcStream.close();
            if (destStream != null) destStream.close();
		} catch (IOException e) {
			System.out.println("����� ������ �߻��߽��ϴ�.");
		}
		scanner.close();}

	private static boolean compareFile(FileInputStream src, FileInputStream dest) throws IOException {
		byte[] srcBuf = new byte[1024]; 
		byte[] destbuf = new byte[1024];
		
		int srcCount=0, destCount;
		while (true) {
			srcCount = src.read(srcBuf, 0, srcBuf.length); // src��Ʈ���� ũ�⸸ŭ �б�
			destCount = dest.read(destbuf, 0, destbuf.length); // dest��Ʈ���� ũ�⸸ŭ �б�
			if (srcCount != destCount) // �о���� ����Ʈ ���� �ٸ��� ������ �ٸ��� ������ false�� �����Ѵ�. 
				return false;
			
			if(srcCount == -1)
				break; // ���� ���� ������
			
			for (int i=0; i<srcCount; i++) {
				if (srcBuf[i] != destbuf[i])
					return false;}}return true;}}
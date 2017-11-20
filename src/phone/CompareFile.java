package phone;
import java.io.*;
import java.util.Scanner;

public class CompareFile {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FileInputStream srcStream = null; //src스트림으로 인풋파일 생성
		FileInputStream destStream = null;//dest스트림으로 인풋파일  생성 
		
		System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
		         // phone의 파일에 엘비스1, 엘비스1-복사본 텍스트 파일을 생성하여야 한다. 
		System.out.print("첫번째 파일 이름을 입력하세요>>");
		String src = scanner.nextLine();
		System.out.print("두번째 파일 이름을 입력하세요>>");
		String dst = scanner.nextLine();
		System.out.println(src + "와 " + dst + "를 비교합니다.");
		try {
			srcStream = new FileInputStream(src);
			destStream = new FileInputStream(dst); 
			if (compareFile(srcStream, destStream))
				System.out.println("파일이 같습니다.");
			else
				System.out.println("파일이 다릅니다.");
			
            if (srcStream != null) srcStream.close();
            if (destStream != null) destStream.close();
		} catch (IOException e) {
			System.out.println("입출력 오류가 발생했습니다.");
		}
		scanner.close();}

	private static boolean compareFile(FileInputStream src, FileInputStream dest) throws IOException {
		byte[] srcBuf = new byte[1024]; 
		byte[] destbuf = new byte[1024];
		
		int srcCount=0, destCount;
		while (true) {
			srcCount = src.read(srcBuf, 0, srcBuf.length); // src스트림의 크기만큼 읽기
			destCount = dest.read(destbuf, 0, destbuf.length); // dest스트림의 크기만큼 읽기
			if (srcCount != destCount) // 읽어들인 바이트 수가 다르면 파일이 다르기 떄문에 false를 리턴한다. 
				return false;
			
			if(srcCount == -1)
				break; // 파일 끝에 도달함
			
			for (int i=0; i<srcCount; i++) {
				if (srcBuf[i] != destbuf[i])
					return false;}}return true;}}
package phone; 
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class phone {

	public static void main(String[] args) {
		FileWriter fw = null;
		File f = new File("c:\\temp\\phone.txt");
		try {                //로컬디스크 c 의 temp 파일에 저장한다. 
			fw = new FileWriter(f);
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("전화번호 입력 프로그램입니다.");
			while(true) {  //그만을 칠때까지 반복한다. 
				System.out.print("이름 전화번호 >> ");
				String line = scanner.nextLine(); // 한줄을 읽는다.
				if(line.equals("그만"))
						break;
				fw.write(line+"\r\n"); // 한 줄 띄어 저장하기 위해 "\r\n"을 붙인다.
			}
			System.out.println(f.getPath()+"에 저장하였습니다.");
			
			scanner.close();
			fw.close();
		} 
		catch (IOException e) { // 파일을 저장할 수 없는 경우
			e.printStackTrace();
		}
	}

}

package phone;
import java.awt.*;
import javax.swing.*;

public class TenButtonFrame extends JFrame {
	public TenButtonFrame() {
		super("Ten Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(1, 10));
		// 1,10 짜리의 배열을 가진 프레임 생성 
		JButton [] btn = new JButton [10];
		
		Color [] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY, Color.PINK, Color.LIGHT_GRAY };
		for(int i=0; i<btn.length; i++) {
			btn[i] = new JButton(Integer.toString(i));
			btn[i].setBackground(color[i]);
			c.add(btn[i]);// 모든 배열에 수가 들어가게 반복
		}
		setSize(500,200);//500,200의 사이즈 
		setVisible(true);
	}
	public static void main(String[] args) {
		new TenButtonFrame();
	}
}

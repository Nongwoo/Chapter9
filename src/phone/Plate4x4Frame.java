package phone;
import java.awt.*;
import javax.swing.*;

public class Plate4x4Frame extends JFrame {
	public Plate4x4Frame() {
		super("4x4 Color Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(4, 4));//4x4 프레임 생성 
		
		JLabel [] label = new JLabel [16];//16개의 라벨을 생성
		Color [] color = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
				Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY,
				Color.PINK, Color.LIGHT_GRAY, Color.WHITE, Color.DARK_GRAY,
				Color.BLACK, Color.ORANGE, Color.BLUE,Color.MAGENTA}; 
                   //각각의 라벨에 색을 입힘
		for(int i=0; i<label.length; i++) {
			label[i] = new JLabel(Integer.toString(i));
			label[i].setOpaque(true); // 라벨 배경색을 출력
			label[i].setBackground(color[i]);
			c.add(label[i]);
		}
		setSize(500,200);//사이즈 500,200
		setVisible(true);
	}
	public static void main(String[] args) {
		new Plate4x4Frame();
	}

}

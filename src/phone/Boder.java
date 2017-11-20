package phone;
import java.awt.*;


import javax.swing.*;
public class Boder extends JFrame {//jframe은 만들지않아도 extends가능 
public Boder() { 
	setTitle("BorderLayout Pratice"); 
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	Container c =getContentPane(); 
	c.setLayout(new BorderLayout(5,7));//5,7 배열의 래이아웃을 생성
	c.add(new JButton("center"),BorderLayout.CENTER); 
	c.add(new JButton("north"),BorderLayout.NORTH);
	c.add(new JButton("West"),BorderLayout.WEST);
	c.add(new JButton("East"),BorderLayout.EAST);
	c.add(new JButton("South"),BorderLayout.SOUTH);
	setSize(300,200); // 300,200 의 사이즈 입력 
	setVisible(true); 
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Boder(); 
	}

}

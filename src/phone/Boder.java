package phone;
import java.awt.*;


import javax.swing.*;
public class Boder extends JFrame {//jframe�� �������ʾƵ� extends���� 
public Boder() { 
	setTitle("BorderLayout Pratice"); 
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
	Container c =getContentPane(); 
	c.setLayout(new BorderLayout(5,7));//5,7 �迭�� ���̾ƿ��� ����
	c.add(new JButton("center"),BorderLayout.CENTER); 
	c.add(new JButton("north"),BorderLayout.NORTH);
	c.add(new JButton("West"),BorderLayout.WEST);
	c.add(new JButton("East"),BorderLayout.EAST);
	c.add(new JButton("South"),BorderLayout.SOUTH);
	setSize(300,200); // 300,200 �� ������ �Է� 
	setVisible(true); 
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Boder(); 
	}

}

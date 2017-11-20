package phone;
import java.awt.*;
import java.util.*;
import javax.swing.*;
public class RandomLabels extends JFrame {
	public RandomLabels() { 
		super ("Random Labels"); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		Container c = getContentPane();
		c.setLayout(null);
		
		JLabel label = new JLabel(""); 
		
		for (int i = 0; i<20; i++) { //1~20���� �� ���� 
			int x = (int)(Math.random()*200)+50;//50~250  
			int y = (int)(Math.random()*200)+50;
			label = new JLabel (Integer.toString(i));//�󺧻��� 
			label.setBackground(Color.blue);//blue ���� 
			label.setLocation(x,y);
			label.setSize(10,10);
			label.setOpaque(true);//��� ���� ����
			c.add(label); 
		}
		setSize(300,300); 
		setVisible(true); //������ ��� 
	}
	public static void main(String[] args) {
		new RandomLabels();
	}

}

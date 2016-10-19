import javax.swing.*;
import java.awt.GridLayout;

public class FirstClient {
	
	JFrame frame = new JFrame("HelloWorldSwing");
	JPanel panel = new JPanel();
	
	JButton btn1 = new JButton("First");
	JButton btn2 = new JButton("Second");
	JButton btn3 = new JButton("Third");
	JButton btn4 = new JButton("Fourth");
	
	public FirstClient() {
		panel.setLayout(new GridLayout(2,2,3,3));
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		frame.add(panel);
		
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		new FirstClient();
	}
}

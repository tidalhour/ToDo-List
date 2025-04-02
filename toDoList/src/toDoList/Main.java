package toDoList;
import java.awt.*;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setTitle("To-Do List");
		frame.setSize(600, 550);
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		
		JTextField inputText = new JTextField();
		inputText.setBounds(30, 25, 400, 40);
		inputText.setFont(new Font("Monospaced", Font.PLAIN, 16));
		inputText.setText("Insert to-do here...");
		
		JButton inputButton = new JButton();
		inputButton.setText("Insert");
		inputButton.setBounds(450, 25, 100, 40);
		
		JPanel inputArea = new JPanel();
		inputArea.setBounds(0, 420, 600, 100);
		inputArea.setBackground(new Color(255, 231, 184));
		inputArea.setLayout(null);
		
		inputArea.add(inputText);
		inputArea.add(inputButton);
		
		frame.add(inputArea);
		frame.setVisible(true);
	}

}

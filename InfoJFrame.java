package AllTogether;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InfoJFrame {

	 JFrame frame2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InfoJFrame window = new InfoJFrame();
					window.frame2.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InfoJFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame2 = new JFrame();
		frame2.setBounds(100, 100, 666, 419);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Information");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Consolas", Font.BOLD, 16));
		lblNewLabel.setBounds(239, 11, 193, 24);
		frame2.getContentPane().add(lblNewLabel);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 46, 627, 321);
		frame2.getContentPane().add(scrollPane);
		
		JTextArea txtrA = new JTextArea();
		txtrA.setEditable(false);
		txtrA.setText("Bubblesort: Bubble Sort is the simplest sorting algorithm that works by" + "\n" +  "repeatedly swapping the adjacent elements if they are in the wrong order." +"\n" + "This algorithm is not suitable for large data sets as its average and worst-case" + "\n" +  "time complexity is quite high.	" + "\n" + "\n"
		+ "Quicksort: Quick Sort is a sorting algorithm, which is commonly used in computer science." + "\n" +  "Quick Sort is a divide and conquer algorithm. It creates two empty arrays" + "\n" +  "to hold elements less than the pivot value and elements greater than the pivot" + "\n" +  "value, and then recursively sort the sub arrays. There are two basic operations" + "\n" +  "in the algorithm, swapping items in place and partitioning a section of the array.");
		txtrA.setFont(new Font("Consolas", Font.BOLD, 13));
		scrollPane.setViewportView(txtrA);
		
		
		
		Button button = new Button("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame2.dispose();

			}
		});
		button.setFont(new Font("Consolas", Font.PLAIN, 12));
		button.setBounds(10, 10, 84, 25);
		frame2.getContentPane().add(button);
	}

	
}

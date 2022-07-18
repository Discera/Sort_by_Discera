package AllTogether;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Toolkit;

public class SortJFrame extends JFrame {

  /**
   * 
   */
  private static final long serialVersionUID = 1 L;
  private JPanel contentPane;
  private static int choose;
  private JTextField txtArrayLength;
  private JTextField textField;
  private String arrayLength;
  private String arrayRange;
  private JTextArea textArea;
  private JLabel lblTime1;

  /**
   * Create the frame.
   */
  public SortJFrame() {
    setFont(new Font("Consolas", Font.BOLD, 12));
    setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\maxgl\\OneDrive\\Bilder\\Logo.png"));
    setBackground(Color.WHITE);
    setTitle("Sort by MaxG");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 661, 417);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    setContentPane(contentPane);
    contentPane.setLayout(null);

    JLabel label = new JLabel("");
    label.setBounds(16, 22, 0, 0);
    contentPane.add(label);

    JLabel lblNewLabel = new JLabel("Sort by MaxG");
    lblNewLabel.setBounds(286, 10, 108, 19);
    lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
    lblNewLabel.setFont(new Font("Consolas", Font.BOLD, 16));
    contentPane.add(lblNewLabel);

    JLabel label_1 = new JLabel("");
    label_1.setBounds(134, 22, 0, 0);
    contentPane.add(label_1);

    JScrollPane scrollPane = new JScrollPane();
    scrollPane.setBounds(499, 50, 119, 213);
    contentPane.add(scrollPane);

    textArea = new JTextArea();
    scrollPane.setViewportView(textArea);
    textArea.setEditable(false);
    textArea.setFont(new Font("Monospaced", Font.BOLD, 13));

    JLabel label_2 = new JLabel("");
    label_2.setBounds(151, 22, 0, 0);
    contentPane.add(label_2);

    JLabel lblNewLabel_1 = new JLabel("Array length");
    lblNewLabel_1.setBounds(123, 50, 153, 14);
    lblNewLabel_1.setFont(new Font("Consolas", Font.PLAIN, 11));
    lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
    contentPane.add(lblNewLabel_1);

    JLabel label_3 = new JLabel("");
    label_3.setBounds(233, 22, 0, 0);
    contentPane.add(label_3);

    JLabel label_4 = new JLabel("");
    label_4.setBounds(238, 22, 0, 0);
    contentPane.add(label_4);

    JLabel label_5 = new JLabel("");
    label_5.setBounds(243, 22, 0, 0);
    contentPane.add(label_5);

    txtArrayLength = new JTextField();
    txtArrayLength.setBounds(123, 75, 153, 20);
    contentPane.add(txtArrayLength);
    txtArrayLength.setColumns(10);

    JLabel label_6 = new JLabel("");
    label_6.setBounds(339, 22, 0, 0);
    contentPane.add(label_6);

    JLabel label_7 = new JLabel("");
    label_7.setBounds(344, 22, 0, 0);
    contentPane.add(label_7);

    JLabel label_8 = new JLabel("");
    label_8.setBounds(349, 22, 0, 0);
    contentPane.add(label_8);

    JLabel lblNewLabel_1_1 = new JLabel("Array range");
    lblNewLabel_1_1.setBounds(123, 125, 153, 14);
    lblNewLabel_1_1.setFont(new Font("Consolas", Font.PLAIN, 11));
    lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
    contentPane.add(lblNewLabel_1_1);

    JButton btnNewButton_1 = new JButton("Quicksort");
    btnNewButton_1.setBounds(335, 240, 139, 23);
    btnNewButton_1.setFont(new Font("Consolas", Font.BOLD, 11));
    btnNewButton_1.setBackground(Color.LIGHT_GRAY);
    btnNewButton_1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        choose = 3;
      }
    });

    JButton btnNewButton_2 = new JButton("Bubblesort (reverse)");
    btnNewButton_2.setBounds(141, 240, 184, 23);
    btnNewButton_2.setFont(new Font("Consolas", Font.BOLD, 11));
    btnNewButton_2.setBackground(Color.LIGHT_GRAY);
    btnNewButton_2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        choose = 2;
      }
    });

    JButton btnNewButton = new JButton("Bubblesort");
    btnNewButton.setBounds(10, 240, 118, 23);
    btnNewButton.setFont(new Font("Consolas", Font.BOLD, 11));
    btnNewButton.setBackground(Color.LIGHT_GRAY);
    btnNewButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        choose = 1;
      }
    });

    JLabel label_9 = new JLabel("");
    label_9.setBounds(425, 22, 0, 0);
    contentPane.add(label_9);

    JLabel label_10 = new JLabel("");
    label_10.setBounds(430, 22, 0, 0);
    contentPane.add(label_10);

    JLabel label_11 = new JLabel("");
    label_11.setBounds(435, 22, 0, 0);
    contentPane.add(label_11);

    textField = new JTextField();
    textField.setBounds(123, 150, 153, 20);
    textField.setColumns(10);
    contentPane.add(textField);

    JLabel label_12 = new JLabel("");
    label_12.setBounds(531, 22, 0, 0);
    contentPane.add(label_12);

    JLabel label_13 = new JLabel("");
    label_13.setBounds(536, 22, 0, 0);
    contentPane.add(label_13);
    contentPane.add(btnNewButton);
    contentPane.add(btnNewButton_2);
    contentPane.add(btnNewButton_1);

    JLabel label_14 = new JLabel("");
    label_14.setBounds(323, 50, 0, 0);
    contentPane.add(label_14);

    JLabel label_15 = new JLabel("");
    label_15.setBounds(328, 50, 0, 0);
    contentPane.add(label_15);

    JLabel label_16 = new JLabel("");
    label_16.setBounds(333, 50, 0, 0);
    contentPane.add(label_16);

    JLabel label_17 = new JLabel("");
    label_17.setBounds(338, 50, 0, 0);
    contentPane.add(label_17);

    JLabel lblNewLabel_2 = new JLabel("Time:");
    lblNewLabel_2.setBounds(499, 277, 37, 14);
    lblNewLabel_2.setFont(new Font("Consolas", Font.PLAIN, 11));
    contentPane.add(lblNewLabel_2);

    JLabel label_18 = new JLabel("");
    label_18.setBounds(378, 50, 0, 0);
    contentPane.add(label_18);

    //Start sorting

    JButton btnNewButton_3 = new JButton("Start sorting");
    btnNewButton_3.setBounds(262, 344, 145, 23);
    btnNewButton_3.setFont(new Font("Consolas", Font.BOLD, 11));
    btnNewButton_3.setBackground(new Color(143, 188, 143));
    btnNewButton_3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        arrayLength = txtArrayLength.getText();
        arrayRange = textField.getText();

        int[] arr = new int[Integer.parseInt(arrayLength)];
        for (int i = 0; i < arr.length; i++) {
          arr[i] = (int)(Math.random() * Integer.parseInt(arrayRange));

        }
        long start = System.currentTimeMillis();

        if (choose == 1) {
          Bubblesort.sort(arr);
          start = System.currentTimeMillis() - start;
        } else if (choose == 2) {

          BubblesortReverse.sort(arr);
          start = System.currentTimeMillis() - start;
        } else if (choose == 3) {
          Quicksort.quicksort(arr);
          start = System.currentTimeMillis() - start;
        } else if (choose == 0) {

        }
        lblTime1.setText(Long.toString(start) + " ms");
        String[] strArray = new String[arr.length];

        for (int i = 0; i < arr.length; i++) {
          strArray[i] = String.valueOf(arr[i]);
          textArea.append(strArray[i] + "\n");
        }
        start = 0;

      }
    });
    contentPane.add(btnNewButton_3);

    JLabel label_19 = new JLabel("");
    label_19.setBounds(499, 50, 0, 0);
    contentPane.add(label_19);

    JButton btnNewButton_4 = new JButton("Clear");
    btnNewButton_4.setBounds(531, 344, 87, 23);
    btnNewButton_4.setFont(new Font("Consolas", Font.ITALIC, 11));
    btnNewButton_4.setBackground(new Color(165, 42, 42));
    btnNewButton_4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        txtArrayLength.setText("");
        textField.setText("");
        choose = 0;
        textArea.setText("");
        lblTime1.setText("");
      }
    });
    contentPane.add(btnNewButton_4);

    lblTime1 = new JLabel("");
    lblTime1.setForeground(Color.RED);
    lblTime1.setBounds(531, 274, 87, 17);
    lblTime1.setFont(new Font("Consolas", Font.PLAIN, 11));
    contentPane.add(lblTime1);

  }
}

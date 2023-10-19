import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class panelClass extends JPanel {
    private String color1, color2, color3;

    // create a frame
    public JFrame frame = new JFrame();

    // creating blocks inside the frame
    public JPanel panel1 = new JPanel();
    public JPanel panel2 = new JPanel();
    public JPanel panel3 = new JPanel();

    // create a label - GUI space for images/texts
    public JLabel label1 = new JLabel();
    public JLabel label2 = new JLabel();
    public JLabel label3 = new JLabel();
    public Border border = BorderFactory.createLineBorder(Color.BLACK, 1, false);

    public panelClass() {
        // default constructor
    }

    public panelClass(String color1, String color2, String color3) {
        this.color1 = color1;
        this.color2 = color2;
        this.color3 = color3;
    }

    public void checkColors(JPanel panel, String color) {
        switch (color) {
            case "GREEN":
                panel.setBackground(Color.GREEN);
                break;
            case "RED":
                panel.setBackground(Color.RED);
                break;
            case "BLACK":
                panel.setBackground(Color.BLACK);
                break;
            case "BLUE":
                panel.setBackground(Color.BLUE);
                break;
            case "PINK":
                panel.setBackground(Color.PINK);
                break;
            case "ORANGE":
                panel.setBackground(Color.ORANGE);
                break;
            case "MAGENTA":
                panel.setBackground(Color.MAGENTA);
                break;
            case "CYAN":
                panel.setBackground(Color.CYAN);
                break;
            case "WHITE":
                panel.setBackground(Color.WHITE);
                break;
            case "GRAY":
                panel.setBackground(Color.GRAY);
                break;
            case "YELLOW":
                panel.setBackground(Color.YELLOW);
                break;
            case "INDIGO":
                panel.setBackground(new Color(75, 0, 130));
                break;
            case "VIOLET":
                panel.setBackground(new Color(127, 0, 255));
                break;
            case "PURPLE":
                panel.setBackground(new Color(128, 0, 128));
                break;
            default:
                break;
        }
    }

    public void generateColor() {

        checkColors(panel1, color1);
        panel1.setBounds(0, 0, 400, 300);
        panel1.setLayout(new BorderLayout());

        checkColors(panel2, color2);
        panel2.setBounds(400, 0, 400, 300);
        panel2.setLayout(new BorderLayout());

        checkColors(panel3, color3);
        panel3.setBounds(0, 300, 800, 300);
        panel3.setLayout(new BorderLayout());

        // setting the components inside the frame
        label1.setText("I am ".concat(color1).toUpperCase());
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setVerticalAlignment(JLabel.CENTER);
        label1.setForeground(new Color(255, 255, 255));
        label1.setFont(new Font("Arial", Font.BOLD, 21));
        label1.setBorder(border);

        label2.setText("I am ".concat(color2).toUpperCase());
        label2.setHorizontalAlignment(JLabel.CENTER);
        label2.setVerticalAlignment(JLabel.CENTER);
        label2.setForeground(new Color(255, 255, 255));
        label2.setFont(new Font("Arial", Font.BOLD, 21));
        label2.setBorder(border);

        label3.setText("I am ".concat(color3).toUpperCase());
        label3.setHorizontalAlignment(JLabel.CENTER);
        label3.setVerticalAlignment(JLabel.CENTER);
        label3.setForeground(new Color(255, 255, 255));
        label3.setFont(new Font("Arial", Font.BOLD, 21));
        label3.setBorder(border);

        // adding an image to the frame
        // ImageIcon bg = new ImageIcon("calcBg.jpg");
        // label.setIcon(bg);

        // adding all contents to the frame
        panel1.add(label1);
        panel2.add(label2);
        panel3.add(label3);
        frame.add(panel1);
        frame.add(panel2);
        frame.add(panel3);

        // setting the icon of the window
        ImageIcon icon = new ImageIcon("picker_icon.png");
        frame.setIconImage(icon.getImage());

        // setting the title of the frame
        frame.setTitle("Basic Color Picker v1.0.0");

        // setting the width and height of the frame
        frame.setSize(800, 600);

        // setting the background color of the frame
        frame.getContentPane().setBackground(Color.BLACK);

        // setting the resizable to false
        frame.setResizable(false);

        // setting the frame to absolute positioning
        frame.setLayout(null);

        // setting the location of the frame to be centered relative to the screen
        frame.setLocationRelativeTo(null);

        // making the frame visible
        frame.setVisible(true);

        // exiting the frame out of the application after clicking the exit
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    // @Override
    // public void paintComponent(Graphics g) {
    // super.paintComponent(g);
    // w = getWidth();
    // h = getHeight();
    // n = 6;
    // sx = w / n;
    // sy = h / n;
    // for(int i = 0; i < n; i++){
    // int j = n - i;
    // g.drawLine(i*sx, 0, 0, j*sy);
    // }
    // }
}

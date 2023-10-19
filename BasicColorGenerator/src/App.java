import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        JOptionPane.showMessageDialog(null, "Welcome to Basic Color Generator", "Basic Color Generator v1.0.0", 0);

        String color1 = JOptionPane.showInputDialog(null, "Enter the first Color Name", "Green".toUpperCase());
        String color2 = JOptionPane.showInputDialog(null, "Enter the second Color Name", "Red".toUpperCase());
        String color3 = JOptionPane.showInputDialog(null, "Enter the third Color Name", "Blue".toUpperCase());

        panelClass panel = new panelClass(color1.toUpperCase(), color2.toUpperCase(), color3.toUpperCase());
        panel.generateColor();
    }
}

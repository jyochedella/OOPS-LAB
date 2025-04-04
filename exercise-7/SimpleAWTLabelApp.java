import java.awt.*;
import java.awt.event.*;

public class SimpleAWTLabelApp {
    SimpleAWTLabelApp() {
        Frame frame = new Frame("AWT Label Example");
        Label label = new Label("Hello, AWT!");
        Button button = new Button("Change Text");
        
        label.setBounds(50, 50, 150, 30);
        button.setBounds(50, 100, 100, 30);
        
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Text Updated!");
            }
        });
        
        frame.add(label);
        frame.add(button);
        
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });
    }
    
    public static void main(String[] args) {
        new SimpleAWTLabelApp();
    }
}


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Error_ extends JFrame {
    private JLabel label;
    private JButton button1;
    private JPanel panel1;

    public Error_(String x){
        setContentPane(panel1);
        setTitle("c");
        setVisible(true);
        setSize(300,300);
        label.setText(x);


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}

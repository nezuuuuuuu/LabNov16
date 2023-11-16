import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Checker  extends  JFrame{
    private JTextField textField1;
    private JButton checkYearButton;
    private JPanel Jpanel;
    public Checker(){


        checkYearButton.addActionListener(e -> {
            int num=Integer.parseInt(textField1.getText());
            if(num%4==0){
                JOptionPane.showMessageDialog(this,"Leap Year");
            }
        });
    }

    public static void main(String[] args) {

        Checker app = new Checker();
        app.setContentPane(app.Jpanel);
        app.setSize(500, 500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}

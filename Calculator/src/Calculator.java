import javax.swing.*;

public class Calculator extends JFrame{
    private JTextField textField1;
    private JComboBox comboBox1;
    private JTextField textField2;

    private JButton computeResultButton;
    private JPanel Jpanel;
    private JTextField textField3;

    public Calculator(){


        computeResultButton.addActionListener(e -> {
            int num=Integer.parseInt(textField1.getText());
            int num2=Integer.parseInt(textField2.getText());

            if(comboBox1.getSelectedIndex()==1){
                int sum=num+num2;
                textField3.setText(Integer.toString(sum));
            }
            if(comboBox1.getSelectedIndex()==2){
                int dif=num+num2;
                textField3.setText(Integer.toString(dif));
            }
            if(comboBox1.getSelectedIndex()==3){
                int prod=num+num2;
                textField3.setText(Integer.toString(prod));
            }
            if(comboBox1.getSelectedIndex()==4){
                int quo=num+num2;
                textField3.setText(Integer.toString(quo));
            }
        });
    }

    public static void main(String[] args) {

        Calculator app = new Calculator();
        app.setContentPane(app.Jpanel);
        app.setSize(800, 300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}

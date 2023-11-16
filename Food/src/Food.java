import javax.swing.*;



public class Food extends JFrame{
    private JCheckBox pizzaCheckBox;
    private JCheckBox burgerCheckBox;
    private JCheckBox friesCheckBox;
    private JCheckBox softDrinksCheckBox;
    private JCheckBox teaCheckBox;
    private JCheckBox sundaeCheckBox;
    private JRadioButton noneRadioButton;
    private JRadioButton a5RadioButton;
    private JRadioButton a10RadioButton;
    private JRadioButton a15RadioButton;
    private JButton orderButton;
    private JPanel Jpanel;


    public Food(){



        orderButton.addActionListener(e -> {
            float result=0;
            int sum=0;
            if(pizzaCheckBox.isSelected()){
                sum=sum+100;

            }
            if(burgerCheckBox.isSelected()){
                sum=sum+80;
            }

            if(friesCheckBox.isSelected()){
                sum=sum+65;
            }

            if(softDrinksCheckBox.isSelected()){
                sum=sum+55;
            }
            if(teaCheckBox.isSelected()){
                sum=sum+50;
            }

            if(sundaeCheckBox.isSelected()){
                sum=sum+40;
            }



            if(a5RadioButton.isSelected()){
                result= (float)(sum- (sum*.05));
            }
            if(a10RadioButton.isSelected()){
                result= (float) (sum-(sum*.1));
            }
            if(a15RadioButton.isSelected()){
                result= (float)(sum-(sum*.15));
            }
            if(noneRadioButton.isSelected()){
                result=sum;
            }
            JOptionPane.showMessageDialog(this,"The Total price is "+ result);





        });
    }

    public static void main(String[] args) {

        Food app = new Food();
        app.setContentPane(app.Jpanel);
        app.setSize(800, 300);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}

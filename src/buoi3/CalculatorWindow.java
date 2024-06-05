package buoi3;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorWindow extends JFrame {

    private JLabel jLabelInputRemote1;
    private JTextField jTextFieldInputRemote1;
    private JPanel jPanelRemote;

    CalculatorWindow(){
        

        jLabelInputRemote1 = new JLabel("input1");
        //add(jLabelInputRemote1);
        jTextFieldInputRemote1 = new JTextField(10);
        //add(jTextFieldInputRemote1);
        jPanelRemote = new JPanel();
        jPanelRemote.add(jLabelInputRemote1);
        jPanelRemote.add(jTextFieldInputRemote1);

        add(jPanelRemote);

        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

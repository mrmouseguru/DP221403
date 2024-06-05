package buoi3;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorWindow extends JFrame {

    private JLabel jLabelInputRemote1, jLabelInputRemote2,
    jLabelOutputRemote;
    private JTextField jTextFieldInputRemote1, jTextFieldInputRemote2;
    private JPanel jPanelRemote;
    private JButton addButtonRemote, subButtonRemote;

    CalculatorWindow(){
        
        buildPanel();
        add(jPanelRemote);

        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void buildPanel() {

        jLabelInputRemote1 = new JLabel("input1");
        //add(jLabelInputRemote1);
        jTextFieldInputRemote1 = new JTextField(10);
        //add(jTextFieldInputRemote1);
        jPanelRemote = new JPanel();
        //jPanelRemote.setBackground(Color.GREEN);
        jPanelRemote.add(jLabelInputRemote1);
        jPanelRemote.add(jTextFieldInputRemote1);

        jLabelInputRemote2 = new JLabel("input2");
        jTextFieldInputRemote2 = new JTextField(10);
        jPanelRemote.add(jLabelInputRemote2);
        jPanelRemote.add(jTextFieldInputRemote2);

        addButtonRemote = new JButton("ADD");
        subButtonRemote = new JButton("SUB");

        jPanelRemote.add(addButtonRemote);
        jPanelRemote.add(subButtonRemote);
        
    }
}

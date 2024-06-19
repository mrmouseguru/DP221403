package buoi4.mvc;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

import buoi4.mvc.observer.Subcriber;

public class CalculatorView extends JFrame implements Subcriber
         {

    private JLabel jLabelInputRemote1, jLabelInputRemote2,
            jLabelOutputRemote;
    private JTextField jTextFieldInputRemote1, jTextFieldInputRemote2;
    private JPanel jPanelRemote;
    private JButton addButtonRemote, subButtonRemote;
    private CalculatorController calculatorControlRemote;
    private CalculatorModel calculatorModelRemote;
    private JMenuBar menuBarRemote = null;
   
    CalculatorView() {
        calculatorControlRemote = new CalculatorController();
        calculatorModelRemote = new CalculatorModel();
        calculatorModelRemote.subcribe(this);//dang ky Subcriber voi Publisher
        buildPanel();
        buildMenu();
        //đặt menu bar vào trong cửa sổ
        setJMenuBar(menuBarRemote);
        add(jPanelRemote);
        setTitle("Frame Viewer");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void buildPanel() {

        jLabelInputRemote1 = new JLabel("input1");
        // add(jLabelInputRemote1);
        jTextFieldInputRemote1 = new JTextField(10);
        // add(jTextFieldInputRemote1);
        jPanelRemote = new JPanel();
        // jPanelRemote.setBackground(Color.GREEN);
        jPanelRemote.add(jLabelInputRemote1);
        jPanelRemote.add(jTextFieldInputRemote1);

        jLabelInputRemote2 = new JLabel("input2");
        jTextFieldInputRemote2 = new JTextField(10);
        jPanelRemote.add(jLabelInputRemote2);
        jPanelRemote.add(jTextFieldInputRemote2);

        jLabelOutputRemote = new JLabel("Output");
        jPanelRemote.add(jLabelOutputRemote);

        addButtonRemote = new JButton("ADD");
        addButtonRemote.addActionListener(calculatorControlRemote);// calculatorWindowRemote === this
        subButtonRemote = new JButton("SUB");
        subButtonRemote.addActionListener(calculatorControlRemote);

        jPanelRemote.add(addButtonRemote);
        jPanelRemote.add(subButtonRemote);

    }

    public void buildMenu() {
        menuBarRemote = new JMenuBar();
        //menuBarRemote.setBackground(Color.BLUE);
        JMenu calMenuRemote = new JMenu("Calculator");
        //đặt menu vào thanh Menu
        menuBarRemote.add(calMenuRemote);

        //Menu Item
        JMenuItem addItemRemote = new JMenuItem("ADD");

        //đặt menu item vào trong menu
        calMenuRemote.add(addItemRemote);

    }
    class CalculatorController implements ActionListener {

        //field
       // private CalculatorModel calculatorModelRemote = null;
        //private CalculatorBoundary calculatorBoundaryRemote = null;
    
        CalculatorController(){
            calculatorModelRemote = new CalculatorModel();
            //this.calculatorBoundaryRemote = calculatorBoundaryRemote;
        }
    
        @Override
        public void actionPerformed(ActionEvent e) {
            double num1 = Double.parseDouble(
            jTextFieldInputRemote1.getText());
            // lấy data từ text field 2
            double num2 = Double.parseDouble(
            jTextFieldInputRemote2.getText());
            // cộng
            String command = e.getActionCommand();
            if (command.equals("ADD")) {
                calculatorModelRemote.add(num1, num2);//message to Model
                //jLabelOutputRemote.setText("" + calculatorModelRemote.getResult());
    
            }else if (command.equals("SUB")){
             
            }
    
        }
    }

    @Override
    public void update() {
        double result = calculatorModelRemote.getResult();
        jLabelOutputRemote.setText("" + result);
    }
    
}

   

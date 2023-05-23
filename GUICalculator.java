import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUICalculator extends JFrame implements ActionListener {

    JTextField ans;
    public GUICalculator(){
        setBounds(100, 100, 600, 400);
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();

        ans = new JTextField(60);
        topPanel.add(ans);

        JPanel cPanel = new JPanel();
        cPanel.setLayout(new GridLayout(4,4));

        JButton b9 = new JButton("9");
        cPanel.add(b9);
        b9.addActionListener(this);

        JButton b8 = new JButton("8");
        cPanel.add(b8);
        b8.addActionListener(this);

        JButton b7 = new JButton("7");
        cPanel.add(b7);
        b7.addActionListener(this);

        JButton bAdd = new JButton("+");
        cPanel.add(bAdd);
        bAdd.addActionListener(this);

        JButton b6 = new JButton("6");
        cPanel.add(b6);
        b6.addActionListener(this);

        JButton b5 = new JButton("5");
        cPanel.add(b5);
        b5.addActionListener(this);

        JButton b4 = new JButton("4");
        cPanel.add(b4);
        b4.addActionListener(this);

        JButton bSub = new JButton("-");
        cPanel.add(bSub);
        bSub.addActionListener(this);

        JButton b3 = new JButton("3");
        cPanel.add(b3);
        b3.addActionListener(this);

        JButton b2 = new JButton("2");
        cPanel.add(b2);
        b2.addActionListener(this);

        JButton b1 = new JButton("1");
        cPanel.add(b1);
        b1.addActionListener(this);

        JButton bMul = new JButton("*");
        cPanel.add(bMul);
        bMul.addActionListener(this);

        JButton bC = new JButton("C");
        cPanel.add(bC);
        bC.addActionListener(this);

        JButton b0 = new JButton("0");
        cPanel.add(b0);
        b0.addActionListener(this);

        JButton bEq = new JButton("=");
        cPanel.add(bEq);
        bEq.addActionListener(this);

        JButton bDiv = new JButton("/");
        cPanel.add(bDiv);
        bDiv.addActionListener(this);

        getContentPane().add(topPanel, BorderLayout.NORTH);
        getContentPane().add(cPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    public static void main(String[] args) {
        new GUICalculator();
    }

    public void actionPerformed(ActionEvent e) {
        String result="";
        String com = e.getActionCommand();
        String cur = "";
        int o1=-1, o2=-1;
        String op="";

        if (com.matches("[0-9]")){
            cur+=com;
            ans.setText(cur);
            if (o1 == -1){
                o1 = Integer.parseInt(com);
            }
            else {
                o2 = Integer.parseInt(com);
            }
        }

        else if (com.equals("+") || com.equals("-") || com.equals("*") || com.equals("/")){
            cur+=com;
            ans.setText(cur);
            op = com;
        } else if (com.equals("C")) {
            ans.setText("");
            o1=-1;
            o2=-1;
        } else if (com.equals("=")) {
            switch (op){
                case "+":
                    result = String.valueOf(o1+o2);
                    break;

                case "*":
                    result = String.valueOf(o1*o2);
                    break;
                case "/":
                    result = String.valueOf(o1/o2);
                    break;
                case "-":
                    result = String.valueOf(o1-o2);
                    break;
            }
            ans.setText(result);
        }
    }
}

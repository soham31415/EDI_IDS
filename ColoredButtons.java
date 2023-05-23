import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColoredButtons extends JFrame implements ActionListener{

    public ColoredButtons(){
        setBounds(100, 100, 800, 600);
        setLayout(null);

        JButton red = new JButton("All The Best");
        red.setBounds(10, 10, 120, 30);
        red.setForeground(Color.red);
        add(red);
        red.setActionCommand("red");
        red.addActionListener(this);
//
        JButton blue = new JButton("All The Best");
        blue.setBounds(140, 10, 120, 30);
        blue.setForeground(Color.blue);
        add(blue);
        blue.setActionCommand("blue");
        blue.addActionListener(this);


        JButton yellow = new JButton("All The Best");
        yellow.setBounds(270, 10, 120, 30);
        yellow.setForeground(Color.yellow);
        add(yellow);
        yellow.setActionCommand("yellow");
        yellow.addActionListener(this);

        JButton green = new JButton("All The Best");
        green.setBounds(400, 10, 120, 30);
        green.setForeground(Color.green);
        add(green);
        green.setActionCommand("green");
        green.addActionListener(this);



        getContentPane().setBackground(Color.GRAY);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ColoredButtons();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "red" || e.getActionCommand() == "blue" || e.getActionCommand() == "yellow" || e.getActionCommand() == "green"){
            new DisplayColor(e.getActionCommand());
        }
    }
}

class DisplayColor extends JFrame{
    public DisplayColor(String color){
        setBounds(100, 100, 600, 400);
        setLayout(null);

        JLabel text = new JLabel("All the Best");
        text.setBounds(200, 150, 250, 80);

        switch (color){
            case "red":
                text.setForeground(Color.red);
                break;
            case "blue":
                text.setForeground(Color.blue);
                break;
            case "yellow":
                text.setForeground(Color.yellow);
                break;
            case "green":
                text.setForeground(Color.green);
                break;
        }

        add(text);
        setVisible(true);
    }
}



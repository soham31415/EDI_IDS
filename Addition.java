//import javax.swing.*;
//import java.awt.*;
//
//public class Addition extends JFrame{
//
//    public Addition(){
//        setBounds(100, 100, 600, 400);
//        setLayout(null);
//
//
//        JLabel fno = new JLabel("First number");
//        fno.setBounds(100, 100, 100, 20);
//        add(fno);
//
//        JTextField tfno = new JTextField(20);
//        tfno.setBounds(210, 100, 200, 20);
//        add(tfno);
//
//        JLabel sno = new JLabel("Second number");
//        sno.setBounds(100, 130, 100, 20);
//        add(sno);
//
//        JTextField tsno = new JTextField(20);
//        tsno.setBounds(210, 130, 200, 10);
//        add(tsno);
//
//        JLabel ans = new JLabel("Result");
//        sno.setBounds(100, 180, 100, 30);
//        add(ans);
//
//        JTextField tans = new JTextField(20);
//        tsno.setBounds(210, 180, 200, 20);
//        add(tans);
//
//        setVisible(true);
//    }
//
//    public static void main(String[] args) {
//        new Addition();
//    }
//}
//
//


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Addition {

    public static void main(String[] args) {

        JFrame f1= new JFrame();
        f1.setTitle("Number Addition");

        JLabel firstno= new JLabel("First : ");
        firstno.setBounds(40,50,40,60);

        JLabel Secondno= new JLabel("Second: ");
        Secondno.setBounds(40,100,80,60);

        JLabel Result= new JLabel("Result: ");
        Result.setBounds(40,150,80,60);


        JTextField t1= new JTextField();
        t1.setBounds(100,60,200,30);

        JTextField t2= new JTextField();
        t2.setBounds(100,120,200,30);

        JTextField ResultField= new JTextField();
        ResultField.setBounds(100,170,200,30);


        JButton Add = new JButton("Add");
        Add.setBounds(100,230,80,30);

        Add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String firstno1= t1.getText();
                int numberFirst=Integer.valueOf(firstno1);


                String secondno1=t2.getText();
                int numberSecond=Integer.valueOf(secondno1);


                int Result=numberSecond+numberFirst;
                String ResultString=String.valueOf(Result);

                ResultField.setText(ResultString);

            }
        });

        JButton Clear = new JButton("Clear");
        Clear.setBounds(250,230,80,30);
        Clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText(" ");
                t2.setText(" ");
                ResultField.setText(" ");
            }
        });

        JButton Exit= new JButton("Exit");
        Exit.setBounds(350,350,80,30);
        Exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f1.dispose();
            }
        });



        f1.setLayout(null);

        f1.add(firstno);
        f1.add(Secondno);
        f1.add(t1);
        f1.add(t2);
        f1.add(Result);
        f1.add(ResultField);
        f1.add(Add);
        f1.add(Clear);
        f1.add(Exit);


        f1.setSize(500,500);

        f1.setVisible(true);

    }
}
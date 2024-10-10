// Ange Buhendwa - October 2024
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.text.DecimalFormat;

public class MainV3 {
    static int currentFocusTF = 1;
    static DecimalFormat dF = new DecimalFormat("#.###");

    public static void setCurrentFocusTF(int currentFocusTF) {
        MainV3.currentFocusTF = currentFocusTF;
    }

    public static int getCurrentFocusTF() {
        return currentFocusTF;
    }

    public static void main(String[] args) {

        JFrame myFrame = new JFrame("");
        myFrame.setLayout(new GridLayout(7,3));
        myFrame.setVisible(true);
        myFrame.setSize(500,500);
        myFrame.setDefaultCloseOperation(3);
        //size

        //Labels
        JLabel simLbl = new JLabel("SIMPLE ");
        JLabel calcLbl = new JLabel(" CALCULATOR ");
        JLabel systLbl = new JLabel(" SYSTEM");

        JLabel num1L = new JLabel("Number1: ");
        JLabel num2L = new JLabel("Number2: ");
        JLabel answerL = new JLabel("Answers:");

        //Text fileds

        JTextField num1TF = new JTextField();
        JTextField num2TF = new JTextField();
        JTextField ansTF  = new JTextField();


        // Buttons
        JButton one = new JButton("1");
        JButton two = new JButton("2");
        JButton three = new JButton("3");
        JButton four = new JButton("4");
        JButton five = new JButton("5");
        JButton six = new JButton("6");
        JButton seven = new JButton("7");
        JButton eight = new JButton("8");
        JButton multB = new JButton("X");
        JButton divB = new JButton("/");
        JButton subsB = new JButton("-");
        JButton modB = new JButton("%");


        /// Add components to frame
        // row 1
        myFrame.add(simLbl);
        myFrame.add(calcLbl);
        myFrame.add(systLbl);

        //row2
        myFrame.add(num1L);
        myFrame.add(num2L);
        myFrame.add(answerL);

        //row 3
        myFrame.add(num1TF);
        myFrame.add(num2TF);
        myFrame.add(ansTF);

        //row4
        myFrame.add(one);
        myFrame.add(two);
        myFrame.add(multB);

        //row 5
        myFrame.add(three);
        myFrame.add(four);
        myFrame.add(divB);

        //row 6
        myFrame.add(five);
        myFrame.add(six);
        myFrame.add(subsB);

        //row 7
        myFrame.add(seven);
        myFrame.add(eight);
        myFrame.add(modB);

        myFrame.pack();


        // Action listenners
        one.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (getCurrentFocusTF() == 1){
                    num1TF.setText("1");
                    setCurrentFocusTF(2);
                }else if (getCurrentFocusTF() == 2){
                    num2TF.setText("1");
                    setCurrentFocusTF(0);
                }
            }
        });

        two.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (getCurrentFocusTF() == 1){
                    num1TF.setText("2");
                    setCurrentFocusTF(2);
                }else if (getCurrentFocusTF() == 2){
                    num2TF.setText("2");
                    setCurrentFocusTF(0);
                }
            }
        });

        three.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (getCurrentFocusTF() == 1){
                    num1TF.setText("2");
                    setCurrentFocusTF(2);
                }else if (getCurrentFocusTF() == 2){
                    num2TF.setText("2");
                    setCurrentFocusTF(0);
                }
            }
        });

        four.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (getCurrentFocusTF() == 1){
                    num1TF.setText("4");
                    setCurrentFocusTF(2);
                }else if (getCurrentFocusTF() == 2){
                    num2TF.setText("4");
                    setCurrentFocusTF(0);
                }
            }
        });

        five.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (getCurrentFocusTF() == 1){
                    num1TF.setText("5");
                    setCurrentFocusTF(2);
                }else if (getCurrentFocusTF() == 2){
                    num2TF.setText("5");
                    setCurrentFocusTF(0);
                }
            }
        });

        six.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (getCurrentFocusTF() == 1){
                    num1TF.setText("6");
                    setCurrentFocusTF(2);
                }else if (getCurrentFocusTF() == 2){
                    num2TF.setText("6");
                    setCurrentFocusTF(0);
                }
            }
        });

        seven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (getCurrentFocusTF() == 1){
                    num1TF.setText("7");
                    setCurrentFocusTF(2);
                }else if (getCurrentFocusTF() == 2){
                    num2TF.setText("7");
                    setCurrentFocusTF(0);
                }
            }
        });

        eight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (getCurrentFocusTF() == 1){
                    num1TF.setText("8");
                    setCurrentFocusTF(2);
                }else if (getCurrentFocusTF() == 2){
                    num2TF.setText("8");
                    setCurrentFocusTF(0);
                }
            }
        });

        /// implementing tha calculator
        multB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(num1TF.getText());
                int n2 = Integer.parseInt((num2TF.getText()));
                int res = n1*n2;
                ansTF.setText(String.valueOf(res));
                setCurrentFocusTF(1);
            }
        });

        divB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double n1 = Integer.parseInt(num1TF.getText());
                double n2 = Integer.parseInt((num2TF.getText()));
                double res = n1/n2;
                ansTF.setText(dF.format(res));
                setCurrentFocusTF(1);
            }
        });

        subsB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(num1TF.getText());
                int n2 = Integer.parseInt((num2TF.getText()));
                int res = n1-n2;
                ansTF.setText(String.valueOf(res));
                setCurrentFocusTF(1);
            }
        });

        modB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int n1 = Integer.parseInt(num1TF.getText());
                int n2 = Integer.parseInt((num2TF.getText()));
                int res = n1%n2;
                ansTF.setText(String.valueOf(res));
                setCurrentFocusTF(1);
            }
        });

    }
}

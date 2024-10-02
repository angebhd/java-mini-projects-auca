import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        ///General variable
        DecimalFormat myDF = new DecimalFormat("#.##");
        //frame
        JFrame myFrame = new JFrame();
        myFrame.setSize(1020,720);
            // my Panel
        JPanel mainPanel = new JPanel(null);
        mainPanel.setSize(1000,700);
        mainPanel.setLocation(10,10);
        Border panelBorder = BorderFactory.createLineBorder(new Color(0,100,0), 5);
        mainPanel.setBackground(new Color(150,255,204));
        mainPanel.setBorder(panelBorder);
        myFrame.add(mainPanel);

//        GridBagConstraints mainPanelGBC = new GridBagConstraints();

//        mainPanelGBC.insets = new Insets(5,5,5,5);

        //main Label
        JLabel headLabel = new JLabel("LOAN MANAGEMENT SYSTEM");
        headLabel.setLocation(25,0);
        headLabel.setSize(950, 70);
        headLabel.setFont(headLabel.getFont().deriveFont(Font.BOLD, 64f));
        headLabel.setHorizontalAlignment(SwingConstants.CENTER);
        mainPanel.add(headLabel);

        //loan amount
        JLabel loanAmountLabel = new JLabel("LOAN AMOUNT: ");
        loanAmountLabel.setFont(loanAmountLabel.getFont().deriveFont( Font.BOLD, 30f));
        loanAmountLabel.setLocation(25, 100);
        loanAmountLabel.setSize(380,40);
        loanAmountLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        mainPanel.add(loanAmountLabel);

        JTextField loanAmountTF = new JTextField();
        loanAmountTF.setFont(loanAmountTF.getFont().deriveFont(24f));
        loanAmountTF.setLocation(440, 100);
        loanAmountTF.setSize(380, 40);
        mainPanel.add(loanAmountTF);

        //loan period
        JLabel loanPeriodLabel = new JLabel("LOAN PERIOD: ");
        loanPeriodLabel.setFont(loanAmountLabel.getFont());
        loanPeriodLabel.setHorizontalAlignment(SwingConstants.RIGHT); //it is possible to replace S..C.RIGHT by 4, it is the same
        loanPeriodLabel.setLocation(25, 190);
        loanPeriodLabel.setSize(380,40);
        mainPanel.add(loanPeriodLabel);

        JTextField loanPeriodTF = new JTextField();
        loanPeriodTF.setFont(loanAmountTF.getFont());
        loanPeriodTF.setLocation(440,190);
        loanPeriodTF.setSize(380,40);
        mainPanel.add(loanPeriodTF);

        //interest rate
        JLabel rateLabel = new JLabel("INTEREST RATE IN %: ");
        rateLabel.setFont(loanAmountLabel.getFont());
        rateLabel.setHorizontalAlignment(4); // 4== right
        rateLabel.setLocation(25, 270);
        rateLabel.setSize(380,40);
        mainPanel.add(rateLabel);

        JTextField rateTF = new JTextField();
        rateTF.setFont(loanAmountTF.getFont());
        rateTF.setLocation(440,270);
        rateTF.setSize(380,40);
        mainPanel.add(rateTF);

        //processing fees
        JLabel processingLabel = new JLabel("PROCESSING FEE: ");
        processingLabel.setFont(loanAmountLabel.getFont());
        processingLabel.setHorizontalAlignment(4);
        processingLabel.setLocation(25, 350);
        processingLabel.setSize(380,40);
        mainPanel.add(processingLabel);

        JTextField processingTF = new JTextField();
        processingTF.setFont(loanAmountTF.getFont());;
        processingTF.setLocation(440,350);
        processingTF.setSize(380,40);
        mainPanel.add(processingTF);

        // total amout to pay
        JButton totalToPayButton = new JButton("CALCULATE TOTAL AMOUNT TO BE PAID");
/*
        {
            @Override
            protected void paintComponent(Graphics g) {
            g.setColor(getBackground());
            g.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20); // Adjust radius here
            super.paintComponent(g);
        }
        };
        totalToPayButton.setBorder(BorderFactory.createEmptyBorder()); // Remove default border
        totalToPayButton.setFocusPainted(true);
        totalToPayButton.setContentAreaFilled(false);// Prevent default rendering
        */
        totalToPayButton.setFont(loanAmountLabel.getFont());
        totalToPayButton.setLocation(25, 440);
        totalToPayButton.setSize(650, 40);
        mainPanel.add(totalToPayButton);

        JTextField totalPayTF = new JTextField();
        totalPayTF.setFont(totalPayTF.getFont().deriveFont(20f));
        totalPayTF.setLocation(800, 440);
        totalPayTF.setSize(150, 50);
        totalPayTF.setEditable(false);
        mainPanel.add(totalPayTF);

        // total amout to pay per month
        JButton monthlyToPayButton = new JButton("CALCULATE AMOUNT TO BE PAID PER MONTH");
        /*   // make curved button
        {
            @Override
            protected void paintComponent(Graphics g) {
                g.setColor(getBackground());
                g.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20); // Adjust radius here
                super.paintComponent(g);
            }
        };
        monthlyToPayButton.setBorder(BorderFactory.createEmptyBorder()); // Remove default border
        monthlyToPayButton.setFocusPainted(true);
        monthlyToPayButton.setContentAreaFilled(false);// Prevent default rendering
*/
        monthlyToPayButton.setFont(loanAmountLabel.getFont());
        monthlyToPayButton.setLocation(25, 560);
        monthlyToPayButton.setSize(750, 40);
        mainPanel.add(monthlyToPayButton);

        JTextField monthlyToPayTF = new JTextField();
        monthlyToPayTF.setFont(totalPayTF.getFont());
        monthlyToPayTF.setLocation(825, 560);
        monthlyToPayTF.setSize(125,50);
        monthlyToPayTF.setEditable(false);
        mainPanel.add(monthlyToPayTF);



        myFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        myFrame.setLayout(null);
        myFrame.setVisible(true);


        /// calculation logics
        //Total to pay
        totalToPayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double loanAmount = Double.parseDouble(loanAmountTF.getText());
                double loanPeriod = Double.parseDouble(loanPeriodTF.getText());
                double intPercentageRate    = Double.parseDouble(rateTF.getText());
                double procFees   = Double.parseDouble(processingTF.getText());
                double intRate = intPercentageRate/100;
//                System.out.println(loanAmount+", "+loanPeriod+", "+intPercentageRate+", "+intRate);
                double interest = loanAmount * intRate;
                // with loan period
//                double interest = loanAmount * intRate * loanPeriod;

//                interest = interest/12; // in case the interest is yealy

                double totalToPay = loanAmount + interest + procFees;
                totalPayTF.setText(myDF.format(totalToPay));
            }
        });

        monthlyToPayButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double loanAmount = Double.parseDouble(loanAmountTF.getText());
                double loanPeriod = Double.parseDouble(loanPeriodTF.getText());
                double intPercentageRate    = Double.parseDouble(rateTF.getText());
                double procFees   = Double.parseDouble(processingTF.getText());
                double intRate = intPercentageRate/100;
//                System.out.println(loanAmount+", "+loanPeriod+", "+intPercentageRate+", "+intRate);
                double interest = loanAmount * intRate;
                // with loan period
//                double interest = loanAmount * intRate * loanPeriod;

//                interest = interest/12; // in case the interest is yealy
                double totalToPay = loanAmount + interest + procFees;
                double monthlyPay = totalToPay/loanPeriod;

                monthlyToPayTF.setText(myDF.format(monthlyPay));

            }
        });
        // BY default setting all value to 0
//        loanAmountTF.setTex   t("0");
//        loanPeriodTF.setText("0");
//        rateTF.setText("0");
//        processingTF.setText("0");

    }
}
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        /// format decimal to e line after virgule
        DecimalFormat df = new DecimalFormat("#.##");

        JFrame myFrame = new JFrame("Mini project 2");
        myFrame.setSize(840, 750);
        myFrame.setDefaultCloseOperation(3); // exit on close
        myFrame.setLayout(null);
        myFrame.setVisible(true);

        // 4 fist buttons
            //home
        JButton homeButton = new JButton("HOME");
        homeButton.setFont(homeButton.getFont().deriveFont(18f));
        homeButton.setLocation(10, 90);
        homeButton.setSize(110, 45);
        myFrame.add(homeButton);
            // students
        JButton studentButton = new JButton("STUDENTS");
        studentButton.setFont(homeButton.getFont());
        studentButton.setLocation(220, 90);
        studentButton.setSize(150,45);
        myFrame.add(studentButton);
            //Lecturers
        JButton lecturerButton = new JButton("LECTURERS");
        lecturerButton.setFont(homeButton.getFont());
        lecturerButton.setLocation(470,90);
        lecturerButton.setSize(150,45);
        myFrame.add(lecturerButton);
            //help
        JButton helpButton = new JButton("HELP");
        helpButton.setFont(homeButton.getFont());
        helpButton.setLocation(720,90);
        helpButton.setSize(110,45);
        myFrame.add(helpButton);

        //LABELS + TF
            //chemestry
        JLabel chemLabel = new JLabel("CHEMISTRY /40: ");
        chemLabel.setFont(chemLabel.getFont().deriveFont(18f));
        chemLabel.setHorizontalAlignment(4); //4 =right
        chemLabel.setLocation(10, 190);
        chemLabel.setSize(200, 40);
        myFrame.add(chemLabel);

        JTextField chemTF = new JTextField();
        chemTF.setFont(chemTF.getFont().deriveFont(16f));
        chemTF.setLocation(240, 190);
        chemTF.setSize(590,40);
        myFrame.add(chemTF);
            //biology
        JLabel bioLabel = new JLabel("BIOLOGY /40: ");
        bioLabel.setFont(chemLabel.getFont().deriveFont(18f));
        bioLabel.setHorizontalAlignment(4); //4 =right
        bioLabel.setLocation(10, 260);
        bioLabel.setSize(200, 40);
        myFrame.add(bioLabel);

        JTextField bioTF = new JTextField();
        bioTF.setFont(chemTF.getFont().deriveFont(16f));
        bioTF.setLocation(240, 260);
        bioTF.setSize(590,40);
        myFrame.add(bioTF);
            //physics
        JLabel phyLabel = new JLabel("PHYSICS /40: ");
        phyLabel.setFont(chemLabel.getFont().deriveFont(18f));
        phyLabel.setHorizontalAlignment(4); //4 =right
        phyLabel.setLocation(10, 340);
        phyLabel.setSize(200, 40);
        myFrame.add(phyLabel);

        JTextField phyTF = new JTextField();
        phyTF.setFont(chemTF.getFont().deriveFont(16f));
        phyTF.setLocation(240, 340);
        phyTF.setSize(590,40);
        myFrame.add(phyTF);
            //maths
        JLabel mathLabel = new JLabel("MATHS /40: ");
        mathLabel.setFont(chemLabel.getFont().deriveFont(18f));
        mathLabel.setHorizontalAlignment(4); //4 =right
        mathLabel.setLocation(10, 420);
        mathLabel.setSize(200, 40);
        myFrame.add(mathLabel);


        JTextField mathTF = new JTextField();
        mathTF.setFont(chemTF.getFont().deriveFont(16f));
        mathTF.setLocation(240, 420);
        mathTF.setSize(590,40);
        myFrame.add(mathTF);

        //BOTTOM BUTTONS
            //display....
        JButton labelButton = new JButton("DISPLAY ALL THE ANSWERS DOWN HERE");
        labelButton.setFont(homeButton.getFont());
        labelButton.setLocation(40, 520);
        labelButton.setSize(760, 40);
        myFrame.add(labelButton);
            //percentage
        JButton percButton = new JButton("PERCENTAGE");
        percButton.setFont(homeButton.getFont());
        percButton.setLocation(90, 600);
        percButton.setSize(150, 40);
        myFrame.add(percButton);
            //average
        JButton averButton = new JButton("AVERAGE");
        averButton.setFont(homeButton.getFont());
        averButton.setLocation(345, 600);
        averButton.setSize(150, 40);
        myFrame.add(averButton);
            //Grade
        JButton gradButton = new JButton("GRADE");
        gradButton.setFont(homeButton.getFont());
        gradButton.setLocation(600, 600);
        gradButton.setSize(150, 40);
        myFrame.add(gradButton);

        // BOTTOM TEXT FIELF
            //percentage
        JTextField percTF = new JTextField();
        percTF.setFont(percTF.getFont().deriveFont(16f));
        percTF.setLocation(110, 660);
        percTF.setSize(110,40);
        percTF.setEditable(false);
        myFrame.add(percTF);
        //average
        JTextField averTF = new JTextField();
        averTF.setFont(percTF.getFont().deriveFont(16f));
        averTF.setLocation(365, 660);
        averTF.setSize(110,40);
        averTF.setEditable(false);
        myFrame.add(averTF);
        //Grade
        JTextField gradTF = new JTextField();
        gradTF.setFont(percTF.getFont().deriveFont(16f));
        gradTF.setLocation(620, 660);
        gradTF.setSize(110,40);
        gradTF.setEditable(false);
        myFrame.add(gradTF);

        // ACTIONS
            // percentage
        percButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double chem = Double.parseDouble(chemTF.getText());
                double bio = Double.parseDouble(bioTF.getText());
                double phy = Double.parseDouble(phyTF.getText());
                double math = Double.parseDouble(mathTF.getText());

                double perc = (chem+bio+phy+math)* (100f/160);
                percTF.setText(df.format(perc));
            }
        });
//            Average
        averButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double chem = Double.parseDouble(chemTF.getText());
                double bio = Double.parseDouble(bioTF.getText());
                double phy = Double.parseDouble(phyTF.getText());
                double math = Double.parseDouble(mathTF.getText());

                double aver = (chem+bio+phy+math)/4;
                averTF.setText(df.format(aver));
            }
        });
        // grade

        gradButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double chem = Double.parseDouble(chemTF.getText());
                double bio = Double.parseDouble(bioTF.getText());
                double phy = Double.parseDouble(phyTF.getText());
                double math = Double.parseDouble(mathTF.getText());

                double perc = (chem+bio+phy+math) * (100f/160);
//                System.out.println(perc);
                char grad=' ';
                if (perc<50) {grad = 'F';}
                else if (perc<60) {grad= 'D'; }
                else if (perc<70) {grad= 'C'; }
                else if (perc<80) {grad= 'B'; }
                else if (perc<=100) {grad= 'A'; }
                gradTF.setText(String.valueOf(grad));
            }
        });

    }
}
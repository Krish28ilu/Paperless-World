/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package com.mycompany.newproject;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author krish
 */
public class CreateAccountPage extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger
            .getLogger(CreateAccountPage.class.getName());

    /** Creates new form CreateAccountPage */
    public CreateAccountPage() {

        setContentPane(new FinalBossPanel()); // Background gradient applied

        initComponents(); // NetBeans UI

        setLayout(null);
        bossCard.setLayout(null);

        bossCard.setBounds(100, 60, 700, 750);
        add(bossCard);

        // Move all components INSIDE bossCard
        for (Component c : getContentPane().getComponents()) {
            if (c != bossCard) {
                bossCard.add(c);
            }
        }

        buttonGroup1.add(g1);
        buttonGroup1.add(g2);
        buttonGroup1.add(g3);

        customizeUI();
        centerComponents();

    }

    private void customizeUI() {

        Color gold = new Color(212, 175, 55);
        Color goldBright = new Color(255, 215, 85);
        Color navyDark = new Color(10, 20, 40);

        Font titleFont = new Font("Segoe UI Black", Font.BOLD, 30);
        Font labelFont = new Font("Segoe UI Semibold", Font.BOLD, 15);
        Font fieldFont = new Font("Segoe UI", Font.PLAIN, 14);
        Font buttonFont = new Font("Segoe UI Black", Font.BOLD, 15);

        // Title
        JLabel title = new JLabel("CREATE ACCOUNT");
        title.setFont(titleFont);
        title.setForeground(gold);
        title.setBounds(200, 10, 400, 40);

        bossCard.add(title);

        JSeparator sep = new JSeparator();
        sep.setBounds(190, 50, 320, 3);
        sep.setBackground(goldBright);
        sep.setForeground(goldBright);
        bossCard.add(sep);

        // Style all JLabels
        for (JLabel lbl : new JLabel[] { fullName1, phone1, email1, gender, dob1, setpass, conpass }) {
            lbl.setFont(labelFont);
            lbl.setForeground(goldBright);
        }

        // Textfields
        JTextField[] fields = { name, phone, email };
        for (JTextField tf : fields) {
            tf.setFont(fieldFont);
            tf.setBackground(new Color(255, 255, 255, 230));
            tf.setBorder(new LineBorder(gold, 2, true));
        }

        // Password fields
        for (JPasswordField pf : new JPasswordField[] { password, ConfirmPassword }) {
            pf.setFont(fieldFont);
            pf.setBackground(new Color(255, 255, 255, 230));
            pf.setBorder(new LineBorder(gold, 2, true));
        }

        // Radio buttons gold/white
        for (JRadioButton rb : new JRadioButton[] { g1, g2, g3 }) {
            rb.setForeground(new Color(212, 175, 55)); // GOLD

            rb.setOpaque(false);
            rb.setFont(fieldFont);
        }

        // Button animation
        jButton1.setFont(buttonFont);
        jButton1.setBackground(navyDark);
        jButton1.setForeground(goldBright);
        jButton1.setBorder(new LineBorder(goldBright, 3, true));
        jButton1.setFocusPainted(false);

        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent e) {
                jButton1.setBackground(goldBright);
                jButton1.setForeground(navyDark);
            }

            public void mouseExited(java.awt.event.MouseEvent e) {
                jButton1.setBackground(navyDark);
                jButton1.setForeground(goldBright);
            }
        });
    }

    private void centerComponents() {

        int startX_label = 80; // left start for labels
        int startX_field = 250; // left start for input fields
        int width_label = 160; // label width - increased to fit "PHONE NUMBER"
        int width_field = 380; // field width
        int height = 33; // height for fields
        int labelHeight = 25; // height for labels
        int spaceY = 55; // vertical gap

        int y = 120; // starting Y for first row (ENTER FULL NAME)

        // LABELS AND FIELDS PERFECTLY ALIGNED
        fullName1.setBounds(startX_label, y, width_label, labelHeight);
        name.setBounds(startX_field, y - 5, width_field, height);

        y += spaceY;
        phone1.setBounds(startX_label, y, width_label, labelHeight);
        phone.setBounds(startX_field, y - 5, width_field, height);

        y += spaceY;
        email1.setBounds(startX_label, y, width_label, labelHeight);
        email.setBounds(startX_field, y - 5, width_field, height);

        y += spaceY;
        gender.setBounds(startX_label, y, width_label, labelHeight);
        g1.setLocation(startX_field, y);
        g2.setLocation(startX_field + 100, y);
        g3.setLocation(startX_field + 200, y);

        y += spaceY;
        dob1.setBounds(startX_label, y, width_label, labelHeight);
        dob.setBounds(startX_field, y - 5, width_field, height);

        y += spaceY;
        setpass.setBounds(startX_label, y, width_label, labelHeight);
        password.setBounds(startX_field, y - 5, width_field, height);

        y += spaceY;
        conpass.setBounds(startX_label, y, width_label, labelHeight);
        ConfirmPassword.setBounds(startX_field, y - 5, width_field, height);

        y += 70;
        jButton1.setBounds(275, y, 150, 40);

    }

    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        dob = new com.toedter.calendar.JDateChooser();
        gender = new javax.swing.JLabel();
        dob1 = new javax.swing.JLabel();
        g1 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        g2 = new javax.swing.JRadioButton();
        g3 = new javax.swing.JRadioButton();
        fullName1 = new javax.swing.JLabel();
        phone1 = new javax.swing.JLabel();
        email1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        setpass = new javax.swing.JLabel();
        conpass = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        ConfirmPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 900));
        setPreferredSize(new java.awt.Dimension(900, 900));

        gender.setText("GENDER");

        dob1.setText("D.O.B");

        g1.setText("MALE");

        jButton1.setText("SUBMIT");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        g2.setText("FEMALE");

        g3.setText("OTHERS");

        fullName1.setText("ENTER  NAME");

        phone1.setText("PHONE NUMBER");

        email1.setText("EMAIL ID");

        setpass.setText("SET PASSWORD");

        conpass.setText("FINAL PASSWORD");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(email1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(gender, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(fullName1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                103, Short.MAX_VALUE)
                                                        .addComponent(phone1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(dob1, javax.swing.GroupLayout.PREFERRED_SIZE, 63,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(52, 52, 52)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                                .createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(email,
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(name,
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(phone,
                                                                                javax.swing.GroupLayout.Alignment.LEADING))
                                                                .addGap(133, 133, 133))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(dob,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                297,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(g1,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        98,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(g2,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        98,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(g3,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                        98,
                                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addContainerGap(58, Short.MAX_VALUE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(setpass,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 141,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(password,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 266,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(conpass,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 141,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(ConfirmPassword,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 266,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(171, 171, 171)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 138,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(249, 249, 249)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(fullName1)
                                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(phone1)
                                        .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(email1)
                                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(gender)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(g1)
                                                .addComponent(g2)
                                                .addComponent(g3)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dob1)
                                        .addComponent(dob, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(setpass)
                                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(conpass))
                                .addGap(38, 38, 38)
                                .addComponent(jButton1)
                                .addContainerGap(76, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    JPanel bossCard = new JPanel() {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2 = (Graphics2D) g;

            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            g2.setColor(new Color(255, 255, 255, 220));
            g2.fillRoundRect(0, 0, getWidth(), getHeight(), 35, 35);

            g2.setColor(new Color(212, 175, 55, 120));
            g2.setStroke(new BasicStroke(6));
            g2.drawRoundRect(3, 3, getWidth() - 6, getHeight() - 6, 35, 35);
        }
    };

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        String fullNameValue;
        String phoneValue;
        String emailValue;
        String dobValue;
        String genderValue;

        if (name.getText().trim().matches("^[a-zA-Z ]+$")) {
            System.out.println(name.getText());
            fullNameValue = name.getText();
            name.setBorder(null);

        } else {
            name.setBorder(new LineBorder(Color.RED, 2));
            return;
        }

        if (phone.getText().trim().matches("^[9876]{1}[0-9]{9}")) {
            System.out.println(phone.getText());
            phone.setBorder(null);
            phoneValue = phone.getText();
        } else {
            phone.setBorder(new LineBorder(Color.RED, 2));
            return;
        }

        if (email.getText().trim().matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            System.out.println(email.getText());
            email.setBorder(null);
            emailValue = email.getText();
        } else {
            email.setBorder(new LineBorder(Color.RED, 2));
            return;
        }

        if (!dob.getCalendar().getTime().toString().equalsIgnoreCase("")) {
            System.out.println(dob.getCalendar().getTime().toString());
            dobValue = dob.getCalendar().getTime().toString();

        } else {
            JOptionPane.showMessageDialog(this, "ENTER YOUR DOB");
            return;
        }

        genderValue = null;
        if (g1.isSelected()) {
            genderValue = "Male";

        } else if (g2.isSelected()) {
            genderValue = "FEMALE";

        } else if (g3.isSelected()) {
            genderValue = "Others";

        } else {
            JOptionPane.showMessageDialog(this, "SELECT GENDER");
            return;
        }

        if (password.getText().trim().matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[^A-Za-z0-9]).{8,12}$")
                && password.getText().trim().equals(ConfirmPassword.getText())) {
            try {
                DataBase.saveUser(
                        name.getText(),
                        phone.getText(),
                        email.getText(),
                        dob.getDate().toString(),
                        genderValue,
                        password.getText());

                JOptionPane.showMessageDialog(this, "Account creation done");
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Something went wrong");
            }
            JOptionPane.showMessageDialog(this, "PASSWORD HAS BEEN SET");
            this.setVisible(false);
            new LoginPage().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "PASSWORD DOESN'T MATCH");
            return;

        }

    }// GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new CreateAccountPage().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField ConfirmPassword;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel conpass;
    private com.toedter.calendar.JDateChooser dob;
    private javax.swing.JLabel dob1;
    private javax.swing.JTextField email;
    private javax.swing.JLabel email1;
    private javax.swing.JLabel fullName1;
    private javax.swing.JRadioButton g1;
    private javax.swing.JRadioButton g2;
    private javax.swing.JRadioButton g3;
    private javax.swing.JLabel gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField name;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField phone;
    private javax.swing.JLabel phone1;
    private javax.swing.JLabel setpass;
    // End of variables declaration//GEN-END:variables

}

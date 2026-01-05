/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.newproject;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

/**
 *
 * @author krish
 */
public class LoginPage extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger
            .getLogger(LoginPage.class.getName());

    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
        setContentPane(new FinalBossPanel()); // Background gradient applied

        initComponents();

        setLayout(null);
        bossCard.setLayout(null);

        bossCard.setBounds(100, 150, 700, 550);
        add(bossCard);

        // Move all components INSIDE bossCard
        for (Component c : getContentPane().getComponents()) {
            if (c != bossCard) {
                bossCard.add(c);
            }
        }

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
        JLabel title = new JLabel("LOGIN");
        title.setFont(titleFont);
        title.setForeground(gold);
        title.setBounds(290, 20, 200, 40);
        bossCard.add(title);

        JSeparator sep = new JSeparator();
        sep.setBounds(270, 65, 160, 3);
        sep.setBackground(goldBright);
        sep.setForeground(goldBright);
        bossCard.add(sep);

        // Style all JLabels
        for (JLabel lbl : new JLabel[] { accnum, pass, newuser }) {
            lbl.setFont(labelFont);
            lbl.setForeground(goldBright);
        }

        // Welcome label - bigger and bold
        jLabel1.setFont(new Font("Segoe UI Black", Font.BOLD, 22));
        jLabel1.setForeground(goldBright);

        // Textfields
        name.setFont(fieldFont);
        name.setBackground(new Color(255, 255, 255, 230));
        name.setBorder(new LineBorder(gold, 2, true));

        // Password field
        password.setFont(fieldFont);
        password.setBackground(new Color(255, 255, 255, 230));
        password.setBorder(new LineBorder(gold, 2, true));

        // Login button styling
        login.setFont(buttonFont);
        login.setBackground(navyDark);
        login.setForeground(goldBright);
        login.setBorder(new LineBorder(goldBright, 3, true));
        login.setFocusPainted(false);

        login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent e) {
                login.setBackground(goldBright);
                login.setForeground(navyDark);
            }

            public void mouseExited(java.awt.event.MouseEvent e) {
                login.setBackground(navyDark);
                login.setForeground(goldBright);
            }
        });

        // Create Account button styling
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
        int startX_label = 80;
        int startX_field = 250;
        int width_field = 380;
        int height = 33;
        int spaceY = 55;

        int y = 100;

        // Welcome message centered
        jLabel1.setBounds(220, y, 300, 30);

        y += 70;

        // Name field
        accnum.setLocation(startX_label, y);
        name.setBounds(startX_field, y - 5, width_field, height);

        y += spaceY;

        // Password field
        pass.setLocation(startX_label, y);
        password.setBounds(startX_field, y - 5, width_field, height);

        y += 70;

        // Login button centered
        login.setBounds(275, y, 150, 40);

        y += 70;

        // New user section
        newuser.setBounds(startX_label, y, 120, 30);
        jButton1.setBounds(startX_field, y - 5, 250, 40);
    }

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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        login = new javax.swing.JButton();
        password = new javax.swing.JPasswordField();
        pass = new javax.swing.JLabel();
        accnum = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        newuser = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 900));
        setPreferredSize(new java.awt.Dimension(900, 900));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("CREATE NEW ACCOUNT");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        login.setText("LOGIN");
        login.addActionListener(this::loginActionPerformed);

        pass.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pass.setText("PASSWORD");

        accnum.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        accnum.setText("NAME");

        newuser.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        newuser.setText("NEW USER?");

        jLabel1.setText("WELCOME TO ARCHIVE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(135, 135, 135)
                                                .addGroup(layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(accnum,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 162,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(name,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 221,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(pass,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 162,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(password))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(newuser,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 90,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                        Short.MAX_VALUE)
                                                                .addComponent(jButton1,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 221,
                                                                        javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(257, 257, 257)
                                                .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 91,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(183, 183, 183)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 138,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(60, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addComponent(jLabel1)
                                .addGap(99, 99, 99)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(accnum, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(2, 2, 2)))
                                .addGap(32, 32, 32)
                                .addComponent(login)
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(newuser)
                                        .addComponent(jButton1))
                                .addContainerGap(185, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:]

        this.setVisible(false);
        new CreateAccountPage().setVisible(true);
    }// GEN-LAST:event_jButton1ActionPerformed

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_loginActionPerformed

        // TODO add your handling code here:

        if (name.getText() == null || name.getText().trim().equals("")) {
            name.setBorder(new LineBorder(Color.RED, 2));
            return;
        } else {
            name.setBorder(null);
        }

        if (password.getText() == null || password.getText().trim().equals("")) {
            password.setBorder(new LineBorder(Color.RED, 2));
            return;
        } else {
            password.setBorder(null);
        }

        if (name.getText().equals("admin") && password.getText().equals("admin")) {
            this.setVisible(false);
            new ArchiverPage().setVisible(true);
            return;
        }

        try {

            Boolean user = DataBase.getUser(name.getText(), password.getText());

            if (user) {

                this.setVisible(false);
                new UserPage().setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Incorrect Details ");
            }
        }

        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Something went wrong ");

        }

    }// GEN-LAST:event_loginActionPerformed

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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new LoginPage().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accnum;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton login;
    private javax.swing.JTextField name;
    private javax.swing.JLabel newuser;
    private javax.swing.JLabel pass;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}

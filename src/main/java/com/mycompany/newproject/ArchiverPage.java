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
import java.io.File;
import java.time.LocalDateTime;
import java.util.UUID;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;

/**
 *
 * @author krish
 */
public class ArchiverPage extends javax.swing.JFrame {

    File selectedFile;
    private static final java.util.logging.Logger logger = java.util.logging.Logger
            .getLogger(ArchiverPage.class.getName());

    /**
     * Creates new form ArchiverPage
     */
    public ArchiverPage() {
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
        JLabel title = new JLabel("ARCHIVER DASHBOARD");
        title.setFont(titleFont);
        title.setForeground(gold);
        title.setBounds(180, 20, 400, 40);
        bossCard.add(title);

        JSeparator sep = new JSeparator();
        sep.setBounds(160, 65, 380, 3);
        sep.setBackground(goldBright);
        sep.setForeground(goldBright);
        bossCard.add(sep);

        // Style all JLabels
        for (JLabel lbl : new JLabel[] { jLabel1, jLabel2 }) {
            lbl.setFont(labelFont);
            lbl.setForeground(goldBright);
        }

        // Welcome label - bigger and bold
        jLabel3.setFont(new Font("Segoe UI Black", Font.BOLD, 22));
        jLabel3.setForeground(goldBright);

        // ComboBox styling
        typeoffile.setFont(fieldFont);
        typeoffile.setBackground(new Color(255, 255, 255, 230));
        typeoffile.setBorder(new LineBorder(gold, 2, true));

        // Choose file button styling
        choosefile.setFont(buttonFont);
        choosefile.setBackground(navyDark);
        choosefile.setForeground(goldBright);
        choosefile.setBorder(new LineBorder(goldBright, 3, true));
        choosefile.setFocusPainted(false);

        choosefile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent e) {
                choosefile.setBackground(goldBright);
                choosefile.setForeground(navyDark);
            }

            public void mouseExited(java.awt.event.MouseEvent e) {
                choosefile.setBackground(navyDark);
                choosefile.setForeground(goldBright);
            }
        });

        // Upload button styling
        upload.setFont(buttonFont);
        upload.setBackground(navyDark);
        upload.setForeground(goldBright);
        upload.setBorder(new LineBorder(goldBright, 3, true));
        upload.setFocusPainted(false);

        upload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent e) {
                upload.setBackground(goldBright);
                upload.setForeground(navyDark);
            }

            public void mouseExited(java.awt.event.MouseEvent e) {
                upload.setBackground(navyDark);
                upload.setForeground(goldBright);
            }
        });
    }

    private void centerComponents() {
        int startX_label = 80;
        int startX_field = 300; // moved field right to give more space for labels
        int width_label = 200; // wider labels to fit "SELECT FILE TO UPLOAD"
        int width_field = 330;
        int height = 33;
        int labelHeight = 25;

        int y = 100;

        // Welcome message centered
        jLabel3.setBounds(220, y, 300, 30);

        y += 70;

        // Type of file row
        jLabel2.setBounds(startX_label, y, width_label, labelHeight);
        typeoffile.setBounds(startX_field, y - 5, width_field, height);

        y += 55;

        // Select file row
        jLabel1.setBounds(startX_label, y, width_label, labelHeight);
        choosefile.setBounds(startX_field, y - 5, 200, 40);

        y += 90;

        // Upload button centered
        upload.setBounds(275, y, 150, 40);
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
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        upload = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        typeoffile = new javax.swing.JComboBox<>();
        choosefile = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("SELECT FILE TO UPLOAD ");

        upload.setText("UPLOAD");

        jLabel2.setText("TYPE OF FILE");

        typeoffile.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Historical", "Legal", "Goverment Records", "Survey", "General Knowledge", "Science" }));

        choosefile.setText("CHOOSE FILE");
        choosefile.addActionListener(this::choosefileActionPerformed);

        jLabel3.setText("WELCOME ARCHIVER");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(upload, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(typeoffile, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(choosefile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(234, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel3)
                .addGap(159, 159, 159)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(typeoffile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(choosefile))
                .addGap(65, 65, 65)
                .addComponent(upload)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void choosefileActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_choosefileActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            selectedFile = fileChooser.getSelectedFile();
            choosefile.setText(selectedFile.getName());
        }
    }// GEN-LAST:event_choosefileActionPerformed

    private void uploadActionPerformed(java.awt.event.ActionEvent evt) {
        // Upload action handler
        try {
            if (selectedFile == null) {
                JOptionPane.showMessageDialog(this, "Please select a file first");
                return;
            }
            String id = String.valueOf(UUID.randomUUID());
            String type = String.valueOf(typeoffile.getSelectedItem());
            String time = String.valueOf(LocalDateTime.now());
            FileUploader fileUploader = new FileUploader();
            String fileUrl = fileUploader.uploadFile(selectedFile);
            DataBase.saveDoc(id, type, time, fileUrl);

            JOptionPane.showMessageDialog(this, "Upload Success");
            choosefile.setText("CHOOSE FILE");
            selectedFile = null;

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Something went wrong");
        }
    }

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
        java.awt.EventQueue.invokeLater(() -> new ArchiverPage().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton choosefile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> typeoffile;
    private javax.swing.JButton upload;
    // End of variables declaration//GEN-END:variables
}

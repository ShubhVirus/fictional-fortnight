/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventorysoftware.LogIn;

import login.CPU;
import login.HARDDISK;
import login.KEYBOARD;
import login.LAPTOP;
import login.MOUSE;
import login.Repairable;
import login.ROUTER1;
import login.MONITOR;
import login.MOTHERBOARD1;
import login.PRINTER;
import login.PROJECTOR;
import login.RAM;
import login.SERVER;

/**
 *
 * @author Nilesh Naik
 */
public class MAIN extends javax.swing.JFrame {

    /**
     * Creates new form ADMIN
     */
    public MAIN() {
        initComponents();
        HOME.setOpaque(false);
        //jPanel4.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        keyboard = new javax.swing.JButton();
        mouse = new javax.swing.JButton();
        cpu = new javax.swing.JButton();
        printer = new javax.swing.JButton();
        projector = new javax.swing.JButton();
        monitor = new javax.swing.JButton();
        router = new javax.swing.JButton();
        harddisk = new javax.swing.JButton();
        laptop = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        ram = new javax.swing.JButton();
        server = new javax.swing.JButton();
        motherboard = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        HOME = new javax.swing.JButton();
        USER = new javax.swing.JButton();
        DPRODUCT = new javax.swing.JButton();
        TRASH = new javax.swing.JButton();
        BILLS = new javax.swing.JButton();
        SETTING = new javax.swing.JButton();
        EXIT = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1180, 900));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        keyboard.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        keyboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro/electronics.png"))); // NOI18N
        keyboard.setBorder(null);
        keyboard.setOpaque(false);
        keyboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyboardActionPerformed(evt);
            }
        });

        mouse.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        mouse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro/computer.png"))); // NOI18N
        mouse.setOpaque(false);
        mouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mouseActionPerformed(evt);
            }
        });

        cpu.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        cpu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro/cpu.png"))); // NOI18N
        cpu.setBorder(null);
        cpu.setBorderPainted(false);
        cpu.setOpaque(false);
        cpu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpuActionPerformed(evt);
            }
        });

        printer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro/print.png"))); // NOI18N
        printer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printerActionPerformed(evt);
            }
        });

        projector.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro/projector.png"))); // NOI18N
        projector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectorActionPerformed(evt);
            }
        });

        monitor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro/monitor (1).png"))); // NOI18N
        monitor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monitorActionPerformed(evt);
            }
        });

        router.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro/router.png"))); // NOI18N
        router.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routerActionPerformed(evt);
            }
        });

        harddisk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spl pro/icons8-hdd-100.png"))); // NOI18N
        harddisk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                harddiskActionPerformed(evt);
            }
        });

        laptop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro/computer (2).png"))); // NOI18N
        laptop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laptopActionPerformed(evt);
            }
        });

        jLabel3.setText("C.P.U");

        jLabel5.setText("Printer");

        jLabel6.setText("                          Mouse");

        jLabel7.setText("                       Keyboard");

        jLabel8.setText("                        Laptop");

        jLabel9.setText("Hard Disk");

        jLabel10.setText("                        Monitor");

        jLabel11.setText("Projector");

        jLabel12.setText("Router");

        ram.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro/icons8-smartphone-ram-100.png"))); // NOI18N
        ram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ramActionPerformed(evt);
            }
        });

        server.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro/server.png"))); // NOI18N
        server.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                serverActionPerformed(evt);
            }
        });

        motherboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro/icons8-motherboard-100.png"))); // NOI18N
        motherboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                motherboardActionPerformed(evt);
            }
        });

        jLabel13.setText("RAM");

        jLabel14.setText("Server");

        jLabel15.setText("Mother Board");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel11)
                .addGap(182, 182, 182)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(132, 132, 132))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addComponent(jLabel15)
                .addGap(180, 180, 180)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(137, 137, 137))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(laptop, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cpu, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(projector, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(motherboard, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel3)))
                .addGap(86, 86, 86)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(monitor, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(keyboard, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(router, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(ram, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(server, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(printer, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mouse, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(harddisk, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(61, 61, 61))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(136, 136, 136))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mouse, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cpu, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(keyboard, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(laptop, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monitor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(printer, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(projector, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(router, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(harddisk, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(motherboard, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ram, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(server, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 840, 540));

        jPanel3.setOpaque(false);
        jPanel3.setPreferredSize(new java.awt.Dimension(300, 650));

        HOME.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        HOME.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro/home.png"))); // NOI18N
        HOME.setText("Home");
        HOME.setOpaque(false);
        HOME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HOMEActionPerformed(evt);
            }
        });

        USER.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        USER.setText("User");
        USER.setOpaque(false);
        USER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USERActionPerformed(evt);
            }
        });

        DPRODUCT.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        DPRODUCT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro/wrench.png"))); // NOI18N
        DPRODUCT.setText("Default Products");
        DPRODUCT.setOpaque(false);
        DPRODUCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DPRODUCTActionPerformed(evt);
            }
        });

        TRASH.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.disabledForeground"));
        TRASH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro/trash.png"))); // NOI18N
        TRASH.setText("Trash");
        TRASH.setOpaque(false);
        TRASH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TRASHActionPerformed(evt);
            }
        });

        BILLS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro/invoice.png"))); // NOI18N
        BILLS.setText("Bills");
        BILLS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BILLSActionPerformed(evt);
            }
        });

        SETTING.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro/settings.png"))); // NOI18N
        SETTING.setOpaque(false);
        SETTING.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SETTINGActionPerformed(evt);
            }
        });

        EXIT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pro/exit.png"))); // NOI18N

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(169, 224, 49));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/icons8_DOT_100px.png"))); // NOI18N
        jLabel18.setText("RSS QbiSoft");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TRASH, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BILLS, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DPRODUCT, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(USER, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HOME, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(SETTING)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EXIT)
                .addGap(43, 43, 43))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(HOME, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(USER, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(DPRODUCT, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(TRASH, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(BILLS, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SETTING)
                    .addComponent(EXIT))
                .addGap(46, 46, 46))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 0, -1, 660));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bg/Stellar.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 660));

        jLabel16.setBackground(new java.awt.Color(51, 153, 255));
        jLabel16.setOpaque(true);
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 890, 30));

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spl pro/icons8-restart-32.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 30, 30, 30));

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/spl pro/icons8-shutdown-32.png"))); // NOI18N
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 30, 30, 30));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1200, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void keyboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keyboardActionPerformed
        // TODO add your handling code here:
        KEYBOARD KB = new KEYBOARD();
        KB.setVisible(true);
    }//GEN-LAST:event_keyboardActionPerformed

    private void mouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mouseActionPerformed
        // TODO add your handling code here:
        MOUSE MO = new MOUSE();
        MO.setVisible(true);
    }//GEN-LAST:event_mouseActionPerformed

    private void cpuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpuActionPerformed
        // TODO add your handling code here:
        CPU.setDefaultLookAndFeelDecorated(rootPaneCheckingEnabled);
        CPU cp = new CPU();
        cp.setVisible(true);
    }//GEN-LAST:event_cpuActionPerformed

    private void printerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printerActionPerformed
        // TODO add your handling code here:
        PRINTER MO = new PRINTER();
        MO.setVisible(true);
    }//GEN-LAST:event_printerActionPerformed

    private void projectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectorActionPerformed
        // TODO add your handling code here:
        PROJECTOR PR = new PROJECTOR();
        PR.setVisible(true);
    }//GEN-LAST:event_projectorActionPerformed

    private void monitorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monitorActionPerformed
        // TODO add your handling code here:
        MONITOR MN = new MONITOR();
        MN.setVisible(true);
    }//GEN-LAST:event_monitorActionPerformed

    private void routerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routerActionPerformed
        // TODO add your handling code here:
        ROUTER1 RO = new ROUTER1();
        RO.setVisible(true);
    }//GEN-LAST:event_routerActionPerformed

    private void harddiskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_harddiskActionPerformed
        // TODO add your handling code here:
        HARDDISK HD = new HARDDISK();
        HD.setVisible(true);
    }//GEN-LAST:event_harddiskActionPerformed

    private void laptopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laptopActionPerformed
        // TODO add your handling code here:
        LAPTOP LP = new LAPTOP();
        LP.setVisible(true);
        
    }//GEN-LAST:event_laptopActionPerformed

    private void ramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ramActionPerformed
        // TODO add your handling code here:
        RAM RM = new RAM();
        RM.setVisible(true);
    }//GEN-LAST:event_ramActionPerformed

    private void serverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_serverActionPerformed
        // TODO add your handling code here:
        SERVER SR = new SERVER();
        SR.setVisible(true);
    }//GEN-LAST:event_serverActionPerformed

    private void motherboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_motherboardActionPerformed
        // TODO add your handling code here:
        MOTHERBOARD1 MB = new MOTHERBOARD1();
        MB.setVisible(true);
    }//GEN-LAST:event_motherboardActionPerformed

    private void HOMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HOMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HOMEActionPerformed

    private void USERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USERActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_USERActionPerformed

    private void TRASHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TRASHActionPerformed
        // TODO add your handling code here:
        //TRASH TR = new TRASH();
        //TR.setVisible(true);
    }//GEN-LAST:event_TRASHActionPerformed

    private void SETTINGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SETTINGActionPerformed
        // TODO add your handling code here:
        //jPanel4.setVisible(true);
    }//GEN-LAST:event_SETTINGActionPerformed

    private void DPRODUCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DPRODUCTActionPerformed
        // TODO add your handling code here:
        Repairable rp = new Repairable();
        rp.setVisible(true);
    }//GEN-LAST:event_DPRODUCTActionPerformed

    private void BILLSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BILLSActionPerformed
        // TODO add your handling code here:
        //BILLS bl = new BILLS();
        //bl.setVisible(true);
    }//GEN-LAST:event_BILLSActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MAIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BILLS;
    private javax.swing.JButton DPRODUCT;
    private javax.swing.JButton EXIT;
    private javax.swing.JButton HOME;
    private javax.swing.JButton SETTING;
    private javax.swing.JButton TRASH;
    private javax.swing.JButton USER;
    private javax.swing.JButton cpu;
    private javax.swing.JButton harddisk;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton keyboard;
    private javax.swing.JButton laptop;
    private javax.swing.JButton monitor;
    private javax.swing.JButton motherboard;
    private javax.swing.JButton mouse;
    private javax.swing.JButton printer;
    private javax.swing.JButton projector;
    private javax.swing.JButton ram;
    private javax.swing.JButton router;
    private javax.swing.JButton server;
    // End of variables declaration//GEN-END:variables
}
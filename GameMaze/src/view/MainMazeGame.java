package view;

import model.Tempat;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MainMazeGame extends javax.swing.JFrame {

    Tempat tempat;
    File file;

    public MainMazeGame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        choice1 = new java.awt.Choice();
        jSeparator1 = new javax.swing.JSeparator();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        perintah = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnRestar = new javax.swing.JButton();
        pixelPanel = new javax.swing.JPanel();
        okButton = new javax.swing.JButton();
        langkahLabel = new javax.swing.JLabel();
        langkahText = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        gameMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        mapMenu = new javax.swing.JMenu();
        map1MenuItem = new javax.swing.JMenuItem();
        map2MenuItem = new javax.swing.JMenuItem();
        map3MenuItem = new javax.swing.JMenuItem();
        caraMainMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        perintah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perintahActionPerformed(evt);
            }
        });

        jLabel1.setText("PERINTAH");

        btnRestar.setText("RESTART");
        btnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });

        pixelPanel.setForeground(new java.awt.Color(240, 240, 240));

        javax.swing.GroupLayout pixelPanelLayout = new javax.swing.GroupLayout(pixelPanel);
        pixelPanel.setLayout(pixelPanelLayout);
        pixelPanelLayout.setHorizontalGroup(
            pixelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );
        pixelPanelLayout.setVerticalGroup(
            pixelPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 361, Short.MAX_VALUE)
        );

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        langkahLabel.setText("Jumlah Langkah :");

        langkahText.setText("0");

        saveButton.setText("SAVE");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        gameMenu.setText("Game");
        gameMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameMenuActionPerformed(evt);
            }
        });

        openMenuItem.setText("Open");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        gameMenu.add(openMenuItem);

        mapMenu.setText("Map");
        mapMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        map1MenuItem.setText("Map 1");
        map1MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                map1MenuItemActionPerformed(evt);
            }
        });
        mapMenu.add(map1MenuItem);

        map2MenuItem.setText("Map 2");
        map2MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                map2MenuItemActionPerformed(evt);
            }
        });
        mapMenu.add(map2MenuItem);

        map3MenuItem.setText("Map 3");
        map3MenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                map3MenuItemActionPerformed(evt);
            }
        });
        mapMenu.add(map3MenuItem);

        gameMenu.add(mapMenu);

        caraMainMenuItem.setText("Cara Bermain");
        caraMainMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caraMainMenuItemActionPerformed(evt);
            }
        });
        gameMenu.add(caraMainMenuItem);

        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        gameMenu.add(exitMenuItem);

        menuBar.add(gameMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pixelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(perintah, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(okButton)
                        .addGap(67, 67, 67)
                        .addComponent(btnRestar)
                        .addGap(79, 79, 79)
                        .addComponent(saveButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(langkahLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(langkahText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addComponent(pixelPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(langkahLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(langkahText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(perintah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(okButton)
                        .addComponent(btnRestar)
                        .addComponent(saveButton)))
                .addContainerGap())
        );

        pixelPanel.getAccessibleContext().setAccessibleName("");

        setSize(new java.awt.Dimension(703, 561));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed

        int returnVal = jFileChooser1.showOpenDialog(this);
        if (returnVal == jFileChooser1.APPROVE_OPTION) {
            file = jFileChooser1.getSelectedFile();
            tempat = new Tempat(file);
            pixelPanel.add(tempat);
            tempat.setSize(tempat.getLebar(), tempat.getTinggi());
            int lebar = pixelPanel.getWidth();
            int tinggi = pixelPanel.getHeight();
            int x = (lebar - tempat.getWidth()) / 2;
            int y = (tinggi - tempat.getHeight()) / 2;
            tempat.setLocation(x, y);
            langkahText.setText("0");
        }
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void gameMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameMenuActionPerformed

    }//GEN-LAST:event_gameMenuActionPerformed

    private void btnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarActionPerformed
        tempat.restart();

    }//GEN-LAST:event_btnRestarActionPerformed

    private void map1MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_map1MenuItemActionPerformed
        map1MenuItem.setSelected(true);
        map2MenuItem.setSelected(false);
        map3MenuItem.setSelected(false);
        pixelPanel.removeAll();
        tempat = new Tempat(new File("map1.txt"));
        pixelPanel.add(tempat);
        tempat.setSize(tempat.getLebar(), tempat.getTinggi());
        int lebar = pixelPanel.getWidth();
        int tinggi = pixelPanel.getHeight();
        int x = (lebar - tempat.getWidth()) / 2;
        int y = (tinggi - tempat.getHeight()) / 2;
        tempat.setLocation(x, y);
        langkahText.setText("0");

        JOptionPane.showMessageDialog(null, "       SELAMAT DATANG DI\n             === MAP 1 ===");
    }//GEN-LAST:event_map1MenuItemActionPerformed

    private void map2MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_map2MenuItemActionPerformed
        map1MenuItem.setSelected(false);
        map2MenuItem.setSelected(true);
        map3MenuItem.setSelected(false);
        pixelPanel.removeAll();
        tempat = new Tempat(new File("map2.txt"));
        pixelPanel.add(tempat);
        tempat.setSize(tempat.getLebar(), tempat.getTinggi());
        int lebar = pixelPanel.getWidth();
        int tinggi = pixelPanel.getHeight();
        int x = (lebar - tempat.getWidth()) / 2;
        int y = (tinggi - tempat.getHeight()) / 2;
        tempat.setLocation(x, y);

        JOptionPane.showMessageDialog(null, "       SELAMAT DATANG DI\n             === MAP 2 ===");
    }//GEN-LAST:event_map2MenuItemActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        tempat.save();
        JOptionPane.showMessageDialog(null, "Konfigurasi Sudah Tersimpan!\nSAMPAI BERTEMU LAGI !");
        pixelPanel.removeAll();
        pixelPanel.setBackground(null);
    }//GEN-LAST:event_saveButtonActionPerformed

    private void map3MenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_map3MenuItemActionPerformed
        map1MenuItem.setSelected(false);
        map2MenuItem.setSelected(false);
        map3MenuItem.setSelected(true);
        map3MenuItem.setSelected(true);
        pixelPanel.removeAll();
        tempat = new Tempat(new File("map3.txt"));
        pixelPanel.add(tempat);
        tempat.setSize(tempat.getLebar(), tempat.getTinggi());
        int lebar = pixelPanel.getWidth();
        int tinggi = pixelPanel.getHeight();
        int x = (lebar - tempat.getWidth()) / 2;
        int y = (tinggi - tempat.getHeight()) / 2;
        tempat.setLocation(x, y);
        JOptionPane.showMessageDialog(null, "       SELAMAT DATANG DI\n             === MAP 3 ===");
    }//GEN-LAST:event_map3MenuItemActionPerformed

    private void caraMainMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caraMainMenuItemActionPerformed
        JOptionPane.showMessageDialog(null, "SELAMAT DATANG DI PERMAINAN MAZE GAME !\n"
                + "\n"
                + "Gunakan perintah pada keyboard untuk \n"
                + "menggerakkan pemain menuju tujuannya\n"
                + "\n"
                + "Format perintah :\n"
                + "X(spasi)N\n"
                + "\n"
                + "X = arah gerakan\n"
                + "N = jumlah langkah\n"
                + "\n"
                + "Arah Gerakan :\n"
                + "U = naik\n"
                + "D = turun\n"
                + "R = kanan\n"
                + "L = kiri\n"
                + "\n"
                + "Harap pilih map permainan \n"
                + "pada menu yang tersedia.\n"
                + "\n"
                + "Kamu dapat mereset, menyimpan dan \n"
                + "mengulang permainan untuk satu map yang\n"
                + "sama.\n"
                + "\n"
        );
    }//GEN-LAST:event_caraMainMenuItemActionPerformed

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed

        tempat.Completed();
    }//GEN-LAST:event_okButtonActionPerformed

    private void perintahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perintahActionPerformed
        tempat.PerintahGerak(perintah.getText());
        perintah.setText("");
        langkahText.setText(String.valueOf(tempat.getAllperintah().size()));
        tempat.Completed();
    }//GEN-LAST:event_perintahActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMazeGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRestar;
    private javax.swing.JMenuItem caraMainMenuItem;
    private java.awt.Choice choice1;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu gameMenu;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel langkahLabel;
    private javax.swing.JLabel langkahText;
    private javax.swing.JMenuItem map1MenuItem;
    private javax.swing.JMenuItem map2MenuItem;
    private javax.swing.JMenuItem map3MenuItem;
    private javax.swing.JMenu mapMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JButton okButton;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JTextField perintah;
    private javax.swing.JPanel pixelPanel;
    private javax.swing.JButton saveButton;
    // End of variables declaration//GEN-END:variables
}

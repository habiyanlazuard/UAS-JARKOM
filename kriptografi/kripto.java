/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package kriptografi;

import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class kripto extends javax.swing.JFrame {

    /** Creates new form kripto */

    public kripto() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popupMenu1 = new java.awt.PopupMenu();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        panel1 = new java.awt.Panel();
        jFrame1 = new javax.swing.JFrame();
        btEnkrip = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPesan = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        txtKey = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAsli = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        txtKey1 = new javax.swing.JTextField();
        btDeskrip = new javax.swing.JToggleButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtHasil = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        canvas1 = new java.awt.Canvas();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        popupMenu1.setLabel("popupMenu1");

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane5.setViewportView(jList1);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cryptografi By Habbyan Lazuard");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(0, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        setIconImage(new javax.swing.ImageIcon(getClass().getResource("/kriptografi/logo.jpg")).getImage());
        addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                formComponentAdded(evt);
            }
        });
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        btEnkrip.setText("Enkripsi");
        btEnkrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEnkripActionPerformed(evt);
            }
        });
        getContentPane().add(btEnkrip);
        btEnkrip.setBounds(190, 300, 100, 23);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Silahkan Masukkan Pesan");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 120, 173, 14);

        txtPesan.setColumns(20);
        txtPesan.setRows(5);
        txtPesan.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtPesan);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 140, 270, 132);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Silahkan Masukkan Kunci :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 280, 280, 14);

        txtKey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKeyActionPerformed(evt);
            }
        });
        getContentPane().add(txtKey);
        txtKey.setBounds(20, 300, 160, 30);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hasil Proses Enkripsi");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(320, 120, 132, 14);

        txtAsli.setColumns(20);
        txtAsli.setRows(5);
        jScrollPane2.setViewportView(txtAsli);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(310, 360, 340, 120);

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Masukkan Kata Kunci Disini :");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(310, 280, 330, 14);
        getContentPane().add(txtKey1);
        txtKey1.setBounds(310, 300, 227, 30);

        btDeskrip.setText("Deskripsi");
        btDeskrip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDeskripActionPerformed(evt);
            }
        });
        getContentPane().add(btDeskrip);
        btDeskrip.setBounds(550, 300, 100, 23);

        txtHasil.setColumns(20);
        txtHasil.setRows(5);
        jScrollPane3.setViewportView(txtHasil);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(20, 360, 270, 120);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Pesan Rahasia :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 340, 169, 14);

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(310, 140, 340, 132);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Hasilnya :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(300, 340, 80, 14);

        jLabel8.setFont(new java.awt.Font("Franklin Gothic Demi Cond", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PROGRAM CRYPTOGRAFI");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(190, 20, 250, 28);

        jToggleButton1.setText("Keluar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(240, 500, 115, 23);

        jLabel6.setFont(new java.awt.Font("Charlemagne Std", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 255));
        jLabel6.setText("CREATE By : Habbyan lazuard");
        jLabel6.setToolTipText("");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 530, 270, 40);
        getContentPane().add(canvas1);
        canvas1.setBounds(660, 60, 0, 0);

        jLabel10.setForeground(new java.awt.Color(0, 255, 255));
        jLabel10.setText("Untuk Memenuhi UAS JARKOM");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(230, 50, 180, 20);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/kriptografi/background.jpg"))); // NOI18N
        jLabel11.setText("jLabel11");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, -20, 730, 620);

        setSize(new java.awt.Dimension(709, 622));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btEnkripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEnkripActionPerformed
        // TODO add your handling code here:
         String key = txtKey.getText();
        String isitext = (key.length())+key+txtPesan.getText();
        String out="";
        for (int i = 0; i< isitext.length(); i++) {
            int index = isitext.charAt(i);
            char s = (char)(index+1);
            out = out+ String.valueOf(s);
        }
        txtHasil.setText(out);
        txtPesan.setText("");
        txtKey.setText("");
         

    }//GEN-LAST:event_btEnkripActionPerformed

    private void btDeskripActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDeskripActionPerformed
        // TODO add your handling code here:
        String isitext = txtHasil.getText();
        char k = (char)(isitext.charAt(0));
        String key = "",out = "";
        int jumkey = Integer.parseInt(String.valueOf(k))-1;
        
        for (int i = 1 ; i <= jumkey; i++){
            int index = isitext.charAt(i);
            char s = (char)(index-1);
            key = key + String.valueOf(s);
        }
        if (key.equals(txtKey1.getText())){
            for(int i = (jumkey + 1);i < isitext.length(); i++){
                int index = isitext.charAt(i);
                char s = (char)(index-1);
                out = out + String.valueOf(s);
            }
            txtAsli.setText(out);
            }
        else{
            JOptionPane.showMessageDialog(null,"key tidak cocok\nsilahkan coba lagi");
        }
    }//GEN-LAST:event_btDeskripActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_formFocusGained

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void txtKeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKeyActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtKeyActionPerformed

    private void formComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_formComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_formComponentAdded

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
            java.util.logging.Logger.getLogger(kripto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kripto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kripto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kripto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        try {
//UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
// UIManager.setLookAndFeel("com.jtattoo.plaf.aero.AeroLookAndFeel");
// UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
// UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
// UIManager.setLookAndFeel("com.jtattoo.plaf.fast.FastLookAndFeel");
//UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
// UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
// UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
// UIManager.setLookAndFeel("com.jtattoo.plaf.mcwin.McWinLookAndFeel");
// UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
// UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
// UIManager.setLookAndFeel("com.jtattoo.plaf.smart.SmartLookAndFeel");
// UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
// TAMPILKAN MAIN UTAMA APLIKASI ANDA DI PERINTAH DIBAWAH INI
} catch (Exception e) {
JOptionPane.showMessageDialog(null, "Terjadi error Thema, Pada : \n"+e);
}
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kripto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btDeskrip;
    private javax.swing.JToggleButton btEnkrip;
    private java.awt.Canvas canvas1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JToggleButton jToggleButton1;
    private java.awt.Panel panel1;
    private java.awt.PopupMenu popupMenu1;
    private javax.swing.JTextArea txtAsli;
    private javax.swing.JTextArea txtHasil;
    private javax.swing.JTextField txtKey;
    private javax.swing.JTextField txtKey1;
    private javax.swing.JTextArea txtPesan;
    // End of variables declaration//GEN-END:variables

}
package gui;
import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JFrame;

public class Login extends javax.swing.JFrame {

    public Login() {
        initComponents();
        this.hide2.setVisible(false);
        setLocationRelativeTo(this);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        twitter_link = new javax.swing.JLabel();
        instagram_link = new javax.swing.JLabel();
        youtube_link = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        txtusername = new javax.swing.JTextField();
        hide1 = new javax.swing.JLabel();
        hide2 = new javax.swing.JLabel();
        txtpass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnlogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_management_120px_3.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 120, 120));

        jLabel4.setFont(new java.awt.Font("Agency FB", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Inventory And Management");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 210, 50));

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("I  M  A  N");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 150, 50));

        twitter_link.setForeground(new java.awt.Color(255, 255, 255));
        twitter_link.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_twitter_30px.png"))); // NOI18N
        twitter_link.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        twitter_link.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                twitter_linkMouseClicked(evt);
            }
        });
        jPanel1.add(twitter_link, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, -1, 30));

        instagram_link.setForeground(new java.awt.Color(255, 255, 255));
        instagram_link.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Instagram_30px_1.png"))); // NOI18N
        instagram_link.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        instagram_link.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                instagram_linkMouseClicked(evt);
            }
        });
        jPanel1.add(instagram_link, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 440, -1, 30));

        youtube_link.setForeground(new java.awt.Color(255, 255, 255));
        youtube_link.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_YouTube_30px.png"))); // NOI18N
        youtube_link.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        youtube_link.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                youtube_linkMouseClicked(evt);
            }
        });
        jPanel1.add(youtube_link, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, -1, 30));

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 230, 30));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 230, 30));

        txtusername.setBackground(new java.awt.Color(0, 0, 102));
        txtusername.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        txtusername.setForeground(new java.awt.Color(255, 255, 255));
        txtusername.setToolTipText("");
        txtusername.setBorder(null);
        txtusername.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 230, 30));
        txtusername.getAccessibleContext().setAccessibleName("");

        hide1.setForeground(new java.awt.Color(255, 255, 255));
        hide1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_eye_20px.png"))); // NOI18N
        hide1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hide1MousePressed(evt);
            }
        });
        jPanel2.add(hide1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, 30));

        hide2.setForeground(new java.awt.Color(255, 255, 255));
        hide2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_hide_20px.png"))); // NOI18N
        hide2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                hide2MousePressed(evt);
            }
        });
        jPanel2.add(hide2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, -1, 30));

        txtpass.setBackground(new java.awt.Color(0, 0, 102));
        txtpass.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtpass.setForeground(new java.awt.Color(255, 255, 255));
        txtpass.setBorder(null);
        txtpass.setCaretColor(new java.awt.Color(255, 255, 255));
        jPanel2.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 210, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_search_account_120px.png"))); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 120, 140));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_user_25px.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, 30));

        jLabel9.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Password");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 70, 20));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_lock_25px.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, 30));

        jLabel10.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Username");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 70, 20));

        btnlogin.setFont(new java.awt.Font("Berlin Sans FB", 0, 16)); // NOI18N
        btnlogin.setForeground(new java.awt.Color(255, 255, 255));
        btnlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_enter_50px.png"))); // NOI18N
        btnlogin.setText("  Login");
        btnlogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnlogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnloginMouseClicked(evt);
            }
        });
        jPanel2.add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnloginMouseClicked
        MenuUtama menu = new MenuUtama();
        menu.setVisible(true);
    }//GEN-LAST:event_btnloginMouseClicked

    private void instagram_linkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_instagram_linkMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_instagram_linkMouseClicked

    private void youtube_linkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_youtube_linkMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_youtube_linkMouseClicked

    private void twitter_linkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_twitter_linkMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_twitter_linkMouseClicked

    private void hide1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide1MousePressed
        hide2.setVisible(true);
        hide1.setVisible(false);
        txtpass.setEchoChar((char)0);
    }//GEN-LAST:event_hide1MousePressed

    private void hide2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hide2MousePressed
        hide1.setVisible(true);
        hide2.setVisible(false);
        txtpass.setEchoChar('*');
    }//GEN-LAST:event_hide2MousePressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnlogin;
    private javax.swing.JLabel hide1;
    private javax.swing.JLabel hide2;
    private javax.swing.JLabel instagram_link;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel twitter_link;
    private javax.swing.JPasswordField txtpass;
    private javax.swing.JTextField txtusername;
    private javax.swing.JLabel youtube_link;
    // End of variables declaration//GEN-END:variables
}

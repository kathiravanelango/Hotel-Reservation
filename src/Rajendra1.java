
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Date;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kathir
 */
public class Rajendra1 extends javax.swing.JFrame {

    /**
     * Creates new form Rajendra1
     */
    public Rajendra1() {
        initComponents();
    }

    private static long daysBetween(Date one, Date two) {
         long difference = (one.getTime()-two.getTime())/86400000;
         return Math.abs(difference);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Untitled-15.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, -1, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(219, 183, 120));
        jLabel7.setText("Rajendra 1- 8");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 160, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("The Rajendra Hall, which is 2465 sq mt in area, reflects much \nof the grandeur of this King and his rule. This hall has\nacoustically treated partitions, in built, strategically placed \noverhead projection (ensuring overall coverage of the venue),\nWi-Fi / high speed broadband Internet, extensive audio-visual \nsupport and an on floor conference concierge.");
        jTextArea1.setBorder(null);
        jTextArea1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTextArea1ComponentAdded(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 450, 110));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(219, 183, 120));
        jLabel8.setText("Events");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 110, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/RajendraEvent.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 410, 240));

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 140, 30));

        jDateChooser2.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 590, 140, 30));

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel4.setText("Enter Your Name : ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 680, 130, 20));

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel5.setText("Check Out");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 570, -1, -1));

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel6.setText("Check In ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, 20));

        jTextField1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 640, 60, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "am", "pm" }));
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 640, 70, -1));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(255, 255, 255));
        jTextField2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextField2.setText("Price : Rs.50,00,000 per day");
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, 230, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jButton1.setText("Book Meeting");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 730, 120, -1));

        jLabel9.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel9.setText("Enter Time : ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 100, 20));

        jTextField3.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 680, 120, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Monospaced", 0, 12)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 730, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 850));

        jScrollPane2.setViewportView(jPanel1);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 0, 490, 670);

        setSize(new java.awt.Dimension(505, 711));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextArea1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTextArea1ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextArea1ComponentAdded

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String mname = "Rajendra";
        java.util.Date utilDate1= (Date)jDateChooser1.getDate();
        java.sql.Date sqlDate1 = new java.sql.Date(utilDate1.getTime());
        java.util.Date utilDate2= (Date)jDateChooser2.getDate();
        java.sql.Date sqlDate2 = new java.sql.Date(utilDate2.getTime());
        String check1= String.valueOf(sqlDate1);
        String check2= String.valueOf(sqlDate2);
        Date d1=(Date)jDateChooser1.getDate();
        Date d2= (Date)jDateChooser2.getDate();
        long noofdays1 = daysBetween(d1,d2);
        String noofdays2=String.valueOf(noofdays1);
        int noofdays3=Integer.parseInt(noofdays2);
        int amt = 5000000*noofdays3;
        String name = jTextField3.getText();
        String time1 = jTextField1.getText();
        String dayt = (String)jComboBox1.getSelectedItem();
        String time2 = time1+dayt;
        if(name.length()==0||check1.length()==0||check2.length()==0||time1.length()==0)
        JOptionPane.showMessageDialog(null,"Fill-up the details Properly");
        else
        {
            try
            {
                Class.forName("java.sql.DriverManager");
                Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/katpro","root","123");
                Statement s=(Statement)con.createStatement();
                String q = "insert into meetevent values('"+name+"','"+mname+"','"+sqlDate1+"','"+sqlDate2+"','"+time2+"','"+amt+"');";
                int x = s.executeUpdate(q);
                if(x>0)
                {
                 JOptionPane.showMessageDialog(null,"Booking Successful");
                 new Payment2().setVisible(true);
                 this.dispose();
                }
                else 
                JOptionPane.showMessageDialog(null,"Entry Not Acceptable! Change Your Book-in Name!");
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        new MeetingsAndEvents1().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Rajendra1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rajendra1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rajendra1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rajendra1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rajendra1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}

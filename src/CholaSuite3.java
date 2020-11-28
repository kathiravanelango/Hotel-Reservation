
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
public class CholaSuite3 extends javax.swing.JFrame {

    /**
     * Creates new form CholaSuite3
     */
    public CholaSuite3() {
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

        jScrollPane3 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jTextField3 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jScrollPane3.setBorder(null);
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel1.setText("Check In ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton4.setText("-");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel2.setText("Check Out");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 70, -1));

        jDateChooser1.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 140, -1));

        jDateChooser2.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 140, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel4.setText("No.of Rooms ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel5.setText("Persons / Room");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 120, -1));

        jTextField1.setEditable(false);
        jTextField1.setText("1");
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 39, -1));

        jTextField2.setEditable(false);
        jTextField2.setText("1");
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 39, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton2.setText("-");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, -1, -1));

        jButton3.setText("+");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel3.setText("Room/Suite Type");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 170, -1));

        jLabel6.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jLabel6.setText("Inclusions");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 110, 20));

        jLabel7.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        jLabel7.setText("Dining");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        jLabel8.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        jLabel8.setText("Prepaid Breakfast ( Rs.1,200 / Package )");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", " ", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 400, 50, -1));

        jLabel9.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        jLabel9.setText("Prepaid Lunch ( Rs.1,500 / Package )");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", " " }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 50, -1));

        jLabel10.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        jLabel10.setText("Prepaid Dinner ( Rs.1,800 / Package )");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", " " }));
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 460, 50, -1));

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Monospaced", 3, 13)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Note : Details regarding your inclusions and\n       dining will taken from you when you \n       enter your room/suite.");
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, 360, 60));

        jLabel11.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 14)); // NOI18N
        jLabel11.setText("Chola Suite - The Luxury Suite");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 290, -1));

        jButton5.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton5.setText("Book");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 630, 90, 30));

        jRadioButton1.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        jRadioButton1.setText("Spa Treatment");
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 120, 20));

        jRadioButton2.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        jRadioButton2.setText("Swimming Pool");
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 120, 20));

        jRadioButton3.setFont(new java.awt.Font("Monospaced", 0, 11)); // NOI18N
        jRadioButton3.setText("Airport Transfers");
        jPanel1.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 160, 20));

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Monospaced", 3, 12)); // NOI18N
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, 110, -1));

        jButton6.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jButton6.setText("Calculate Tariff");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 550, -1, -1));

        jLabel12.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel12.setText("Book In Name Of :");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, 20));

        jTextField4.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 130, -1));

        jButton7.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        jButton7.setText("Back");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 630, -1, 30));

        jScrollPane4.setBorder(null);
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea3.setEditable(false);
        jTextArea3.setBackground(new java.awt.Color(240, 240, 240));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Monospaced", 3, 12)); // NOI18N
        jTextArea3.setRows(5);
        jTextArea3.setText("Note : By clicking book, you will get\n       your preffered room booked.");
        jTextArea3.setBorder(null);
        jScrollPane4.setViewportView(jTextArea3);

        jPanel1.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 590, 270, 40));

        jScrollPane3.setViewportView(jPanel1);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(0, 0, 450, 710);

        setSize(new java.awt.Dimension(466, 750));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int np = Integer.parseInt(jTextField2.getText());
        if(np>1 && np<3)
          np--;
        else if(np>2 && np<4)
          np--;
        else if(np>3 && np<5)
          np--;
        else if(np==1)
          np=np;
        else if(np<=0||np>4)
          np=1;

        jTextField2.setText(String.valueOf(np));
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int nr = Integer.parseInt(jTextField1.getText());
        if(nr>0 && nr<2)
          nr++;
        else if(nr>1 && nr<3)
        {
            nr++;
        }
        else if(nr==3)
          nr=nr;
        else if(nr<=0||nr>3)
          nr=1;

        jTextField1.setText(String.valueOf(nr));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int nr = Integer.parseInt(jTextField1.getText());
        if(nr>1 && nr<3)
          nr--;
        else if(nr>2 && nr<4)
          nr--;
        else if(nr==1)
          nr=nr;
        else if(nr<=0||nr>3)
          nr=1;

        jTextField1.setText(String.valueOf(nr));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int np = Integer.parseInt(jTextField2.getText());
        if(np>0 && np<2)
          np++;
        else if(np>1 && np<3)
          np++;
        else if(np>2 && np<4)
          np++;
        else if(np==4)
          np=np;
        else if(np<=0||np>4)
          np=1;

        jTextField2.setText(String.valueOf(np));
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String name=jTextField4.getText();
        String rty= "Chola Suite - The Luxury Suite";
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
        int nroom = Integer.parseInt(jTextField1.getText());
        int nper = Integer.parseInt(jTextField2.getText());
        int totper = nroom*nper;
        int roomamount=25000*nroom*noofdays3;
        int inclu=0;
        if(jRadioButton1.isSelected())
          inclu=inclu+8000;
        if(jRadioButton2.isSelected())
          inclu=inclu+1000;
        if(jRadioButton3.isSelected())
          inclu=inclu+500;
        int brfs=(Integer.parseInt((String)jComboBox1.getSelectedItem()))*1200;
        int lun=(Integer.parseInt((String)jComboBox2.getSelectedItem()))*1500;
        int din=(Integer.parseInt((String)jComboBox3.getSelectedItem()))*1800;
        int dining = brfs+lun+din;
        int finalamount = roomamount+brfs+lun+dining+inclu;
        String dining2="";
        if (dining==0)
          dining2="No";
        else
          dining2="Yes";
        if(name.length()==0||check1.length()==0||check2.length()==0)
          JOptionPane.showMessageDialog(null,"Fill-up the details Properly");
        else
        {
            try
            {
                Class.forName("java.sql.DriverManager");
                Connection con=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/katpro","root","123");
                Statement s=(Statement)con.createStatement();
                String q = "insert into roombook values('"+name+"','"+rty+"','"+sqlDate1+"','"+sqlDate2+"','"+nroom+"','"+totper+"','"+dining2+"','"+finalamount+"');";
                int x = s.executeUpdate(q);
                if(x>0)
                {
                JOptionPane.showMessageDialog(null,"Booking Successful");
                new Payment1().setVisible(true);
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
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        int nroom = Integer.parseInt(jTextField1.getText());
        int nper = Integer.parseInt(jTextField2.getText());
        int totper = nroom*nper;
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
        int roomamount=25000*nroom*noofdays3;
        int inclu=0;
        if(jRadioButton1.isSelected())
          inclu=inclu+8000;
        if(jRadioButton2.isSelected())
          inclu=inclu+1000;
        if(jRadioButton3.isSelected())
          inclu=inclu+500;
        int brfs=(Integer.parseInt((String)jComboBox1.getSelectedItem()))*1200;
        int lun=(Integer.parseInt((String)jComboBox2.getSelectedItem()))*1500;
        int din=(Integer.parseInt((String)jComboBox3.getSelectedItem()))*1800;
        int dining = brfs+lun+din;
        int finalamount = roomamount+brfs+lun+dining+inclu;
        jTextField3.setText(String.valueOf(finalamount));
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        new CholaSuite2().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(CholaSuite3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CholaSuite3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CholaSuite3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CholaSuite3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CholaSuite3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}

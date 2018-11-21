import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Withdraw extends javax.swing.JInternalFrame {

    Connection con = null;
    PreparedStatement pst;
    ResultSet rs;
    
    public Withdraw() {
        initComponents();
        con = Dbconnect.connect();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        accountBox = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        wAmountBox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Withdraw Money");

        jLabel4.setText("Available Balance is");

        accountBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                accountBoxKeyReleased(evt);
            }
        });

        jLabel2.setText("Enter Account Number");

        wAmountBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wAmountBoxActionPerformed(evt);
            }
        });
        wAmountBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                wAmountBoxKeyReleased(evt);
            }
        });

        jLabel3.setText("Withdrawing Amount ");

        jButton1.setText("Withdraw");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(wAmountBox, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addComponent(accountBox, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(155, 155, 155)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
            .addGroup(layout.createSequentialGroup()
                .addGap(347, 347, 347)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accountBox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(wAmountBox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(233, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void accountBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_accountBoxKeyReleased
         int x=0;
        
           try {
               String sql = "SELECT account_number FROM account";
               pst = con.prepareStatement(sql);
               rs =pst.executeQuery();
                
               while(rs.next()){
                   String s = accountBox.getText();
                   String set = rs.getString("account_number") ;
                    
                  if(s.equals(set)){
                       x = 1;
                  } 
                 
               }
           }
           catch (Exception e) {
               System.out.println(e);
           }
       
       
           if(x==0){
                if( accountBox.getText().isEmpty() ){
                }
           else{
             JOptionPane.showMessageDialog(null,"account number is not found");
                    accountBox.setText("");
                }
             }
            
           try {
            String sql;
            sql = "SELECT account_balance FROM account where account_number=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, accountBox.getText());
           
           rs = pst.executeQuery();
           if(rs.next()){
                String set1;
                set1 = rs.getString("account_balance");
                jLabel5.setText(set1);
           }
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
         
    }//GEN-LAST:event_accountBoxKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         if("".equals(wAmountBox.getText()) || "".equals(accountBox.getText())){
       JOptionPane.showMessageDialog(null,"Please fill all fields");
       }  
         else{
          try {
            String sql;
            String amount = wAmountBox.getText();
            String account_num = accountBox.getText();
            sql = "UPDATE account SET account_balance=account_balance- '"+amount+"' WHERE account_number='"+account_num+"'";
            
      
            pst = con.prepareStatement(sql);
            pst.execute();
           
            JOptionPane.showMessageDialog(null, "withdrawed");
           accountBox.setText("");
            wAmountBox.setText("");
            
            
        } catch (SQLException | HeadlessException e) {
            JOptionPane.showMessageDialog(null, e);
        }
         }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
      accountBox.setText("");
      wAmountBox.setText("");
      jLabel5.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void wAmountBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_wAmountBoxKeyReleased
           
        double wa = Double.parseDouble(wAmountBox.getText());
        
        try {
            String qry = "SELECT account_balance From account where account_number ='"+accountBox.getText()+"'";
            pst = con.prepareStatement(qry);
            rs = pst.executeQuery();
            if(rs.next()){
                String balance=rs.getString("account_balance");
                JOptionPane.showMessageDialog(null, balance);
                Double bal = Double.parseDouble(balance);
            if (bal<wa)
            {  
                JOptionPane.showMessageDialog(null,"No suffiecient balance" );
                wAmountBox.setText("");
            }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
      
            if (wa<=0){
                    JOptionPane.showMessageDialog(null, "This field can't be a nagative value");
                    wAmountBox.setText("");
            }
        
    }//GEN-LAST:event_wAmountBoxKeyReleased

    private void wAmountBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wAmountBoxActionPerformed
       
    }//GEN-LAST:event_wAmountBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField accountBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField wAmountBox;
    // End of variables declaration//GEN-END:variables
}


package app;

import javax.swing.table.*; //rabota s tablici
import javax.swing.*;       //rabota s butoni labeli textFieldove i dr swing komponenti
import java.util.*;         // za arrayList koyto ni trqbva za dinamicnite masivi spisyci tablici soutove string integer 
public class App extends javax.swing.JFrame {

    public App() {

        initComponents();
        DefaultTableModel t = (DefaultTableModel) jTable1.getModel(); //rabota s dannite na tablicata(v interfeysa)
        ArrayList<String> getData = new ArrayList<>(); // spisyk v koyto shte napylnq dannite ot  bazite danni
        Connect query = new Connect(); //obekt ot fila "Connect"
        String[] columns = {"InvoiceId","CustomerId","BillingCity","BillingCountry"}; //izbiram kolonite koito iskam da zaredq v tablicata
        getData  = query.select(columns,"Invoices");    //vivejdam jelanite koloni za zarejdane  i imeto na tablicata
        for (int i = 0; i < getData.size(); i++) {// ot 0 do kolkoto zapisa ima viv fakturi t.ev getData
            String[] row = getData.get(i).split("---");
            t.addRow(new Object[]{
                row[0],
                row[1],
                row[2],
                row[3]
            });
                    
        }
    
    
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Код-Фактура", "Код-Клиент", "Град", "Държава"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Групирай");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(193, 193, 193))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            String columnName = jTextField1.getText();

            DefaultTableModel t = (DefaultTableModel) jTable1.getModel(); //rabota s dannite na tablicata(v interfeysa)
            t.setRowCount(0);//nuliram kolonite
        ArrayList<String> getData = new ArrayList<String>(); // spisyk v koyto shte napylnq dannite ot  bazite danni
        Connect query = new Connect(); //obekt ot fila "Connect"
        String[] columns = {"InvoiceId","CustomerId","BillingCity","BillingCountry"}; //izbiram kolonite koito iskam da zaredq v tablicata
        getData  = query.selectGroupBy(columns, columnName,"Invoices");    //vivejdam jelanite koloni za zarejdane  i imeto na tablicata
        for (int i = 0; i < getData.size(); i++) {// ot 0 do kolkoto zapisa ima viv fakturi t.ev getData
            String[] row = getData.get(i).split("---");
            t.addRow(new Object[]{
                row[0],
                row[1],
                i+" "+row[2],
                row[3]
            });
                    
        }
            
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}

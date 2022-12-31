package app;
//alt shift f ->to format code
import javax.swing.table.*; //rabota s tablici
import javax.swing.*;       //rabota s butoni labeli textFieldove i dr swing komponenti
import java.util.*;         // za arrayList koyto ni trqbva za dinamicnite masivi spisyci tablici soutove string integer 

public class App extends javax.swing.JFrame {

    public App() {

        initComponents();
        DefaultTableModel t = (DefaultTableModel) jTable1.getModel(); //rabota s dannite na tablicata(v interfeysa)
        ArrayList<String> getData = new ArrayList<>(); // spisyk v koyto shte napylnq dannite ot  bazite danni
        Connect query = new Connect(); //obekt ot fila "Connect"
        String[] columns = {"InvoiceId", "CustomerId", "BillingCity", "BillingCountry"}; //izbiram kolonite koito iskam da zaredq v tablicata
        getData = query.select(columns, "Invoices");    //vivejdam jelanite koloni za zarejdane  i imeto na tablicata
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
        jButton2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();

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

        jButton2.setText("Филтрирай");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 685, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        
        t.setRowCount(0);
        ArrayList<String> getData = new ArrayList<>(); // spisyk v koyto shte napylnq dannite ot  bazite danni
        Connect query = new Connect(); //obekt ot fila "Connect"
        String[] columns = {"InvoiceId", "CustomerId", "BillingCity", "BillingCountry"}; //izbiram kolonite koito iskam da zaredq v tablicata
        getData = query.selectGroupBy(columns,columnName, "Invoices");    //vivejdam jelanite koloni za zarejdane  i imeto na tablicata
        for (int i = 0; i < getData.size(); i++) {// ot 0 do kolkoto zapisa ima viv fakturi t.ev getData
            String[] row = getData.get(i).split("---");
            t.addRow(new Object[]{
                row[0],
                row[1],
                row[2],
               i+" "+ row[3]
            });

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            String genre = jTextField2.getText();
            
            ArrayList<String> genreData = new ArrayList<String>();
            Connect query = new Connect();
            genreData = query.select(new String[]{"GenreId", "Name"}, "Genres");
            System.out.println(genreData);
           String foundID="";
            for (int i = 0; i < genreData.size(); i++) {
                String[] row = genreData.get(i).split("---");
                if(row[1].equals(genre)){
                        foundID = row[0];
                                
                }
            }
                ArrayList<String> trackData = new ArrayList<String>();
                trackData = query.selectWhere(new String[]{"GenreId","Name"},
                                                new int[] {0}, 
                                                new String[]{foundID},
                                                "Tracks");
              jComboBox1.removeAllItems();
                for (int i = 0; i < trackData.size(); i++) {
                    String[] row = trackData.get(i).split("---");
                    jComboBox1.addItem(row[1]);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}

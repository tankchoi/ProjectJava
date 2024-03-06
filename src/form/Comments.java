package form;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class Comments extends javax.swing.JPanel {

    int id = 0;

    public Comments(int id) {
        initComponents();
        setOpaque(false);
        CommentTbl.addTableStyle(jScrollPane1);
        this.id = id;
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from posts where PostID = " + id);
            if(Rs.next()){
                ContentTa.setText(Rs.getString("Content"));
            }
        } catch (Exception e) {
        }
        DisplayComments();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel2 = new swing.RoundPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        CommentTbl = new swing.Table();
        jScrollPane2 = new javax.swing.JScrollPane();
        ContentTa = new javax.swing.JTextArea();

        roundPanel2.setBackground(new java.awt.Color(60, 60, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Comments Management");

        CommentTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "UserName", "Content", "RepID", "Like", "Action"
            }
        ));
        jScrollPane1.setViewportView(CommentTbl);
        if (CommentTbl.getColumnModel().getColumnCount() > 0) {
            CommentTbl.getColumnModel().getColumn(0).setMinWidth(150);
            CommentTbl.getColumnModel().getColumn(0).setPreferredWidth(150);
            CommentTbl.getColumnModel().getColumn(0).setMaxWidth(150);
            CommentTbl.getColumnModel().getColumn(2).setMinWidth(60);
            CommentTbl.getColumnModel().getColumn(2).setPreferredWidth(60);
            CommentTbl.getColumnModel().getColumn(2).setMaxWidth(60);
            CommentTbl.getColumnModel().getColumn(3).setMinWidth(100);
            CommentTbl.getColumnModel().getColumn(3).setPreferredWidth(100);
            CommentTbl.getColumnModel().getColumn(3).setMaxWidth(100);
            CommentTbl.getColumnModel().getColumn(4).setMinWidth(100);
            CommentTbl.getColumnModel().getColumn(4).setPreferredWidth(100);
            CommentTbl.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        ContentTa.setColumns(20);
        ContentTa.setRows(5);
        jScrollPane2.setViewportView(ContentTa);

        javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
        roundPanel2.setLayout(roundPanel2Layout);
        roundPanel2Layout.setHorizontalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 828, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    Connection Con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null;
    Statement St = null;

    private void DisplayComments() {
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from comments where PostID = " + id);
            Connection Con1 = null;
            PreparedStatement pst1 = null;
            ResultSet Rs1 = null;
            Statement St1 = null;
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("CommentID");
            model.addColumn("UserName");
            model.addColumn("Content");
            model.addColumn("PComment");
            model.addColumn("CreatedAt");
            model.addColumn("UpdatedAt");

            while (Rs.next()) {
                int commentID = Rs.getInt("CommentID");
                int userID = Rs.getInt("UserID");
                String userName = "";
                Con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
                St1 = Con1.createStatement();
                Rs1 = St1.executeQuery("select * from users where UserID = " + userID);
                if(Rs1.next()){
                    userName = Rs1.getString("Username");
                }
                Con1.close();
                String content = Rs.getString("Content");
                int pComment = Rs.getInt("PComment");
                Timestamp createdAt = Rs.getTimestamp("CreatedAt");
                Timestamp updatedAt = Rs.getTimestamp("UpdatedAt");

                model.addRow(new Object[]{commentID, userName, content, pComment, createdAt, updatedAt});
            }

            CommentTbl.setModel(model);
            Con.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Table CommentTbl;
    private javax.swing.JTextArea ContentTa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private swing.RoundPanel roundPanel2;
    // End of variables declaration//GEN-END:variables
}

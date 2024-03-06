package form;

import java.sql.*;
import javax.swing.JOptionPane;
import main.Main;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

public class Posts extends javax.swing.JPanel {

    public Posts() {
        initComponents();
        setOpaque(false);
        PostTbl.addTableStyle(jScrollPane1);
        DisplayPosts();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        roundPanel2 = new swing.RoundPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        PostTbl = new swing.Table();
        DetailBtn = new javax.swing.JButton();
        DeleteBtn = new javax.swing.JButton();
        RefeshBtn = new javax.swing.JButton();
        SearchBtn = new javax.swing.JButton();
        SearchTb = new javax.swing.JTextField();
        SearchCb = new javax.swing.JComboBox<>();

        roundPanel2.setBackground(new java.awt.Color(60, 60, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Posts Management");

        PostTbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "UserName", "Title", "Content", "Like", "Action"
            }
        ));
        PostTbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PostTblMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(PostTbl);
        if (PostTbl.getColumnModel().getColumnCount() > 0) {
            PostTbl.getColumnModel().getColumn(0).setMinWidth(150);
            PostTbl.getColumnModel().getColumn(0).setPreferredWidth(150);
            PostTbl.getColumnModel().getColumn(0).setMaxWidth(150);
            PostTbl.getColumnModel().getColumn(2).setPreferredWidth(200);
            PostTbl.getColumnModel().getColumn(3).setMinWidth(100);
            PostTbl.getColumnModel().getColumn(3).setPreferredWidth(100);
            PostTbl.getColumnModel().getColumn(3).setMaxWidth(100);
            PostTbl.getColumnModel().getColumn(4).setMinWidth(100);
            PostTbl.getColumnModel().getColumn(4).setPreferredWidth(100);
            PostTbl.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        DetailBtn.setText("Detail");
        DetailBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DetailBtnMouseClicked(evt);
            }
        });
        DetailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DetailBtnActionPerformed(evt);
            }
        });

        DeleteBtn.setText("Delete");
        DeleteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteBtnMouseClicked(evt);
            }
        });

        RefeshBtn.setText("Refresh");
        RefeshBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RefeshBtnMouseClicked(evt);
            }
        });

        SearchBtn.setText("Search");
        SearchBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchBtnMouseClicked(evt);
            }
        });

        SearchCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Title", "UserName", "PostID" }));

        javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
        roundPanel2.setLayout(roundPanel2Layout);
        roundPanel2Layout.setHorizontalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 812, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(31, 31, 31)
                        .addComponent(SearchTb, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(roundPanel2Layout.createSequentialGroup()
                                .addComponent(RefeshBtn)
                                .addGap(18, 18, 18)
                                .addComponent(DeleteBtn))
                            .addComponent(SearchCb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DetailBtn)
                            .addComponent(SearchBtn, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        roundPanel2Layout.setVerticalGroup(
            roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBtn)
                    .addComponent(SearchTb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DetailBtn)
                    .addComponent(DeleteBtn)
                    .addComponent(RefeshBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 505, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(roundPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
int id = 0;
    private void PostTblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PostTblMouseClicked
        DefaultTableModel model = (DefaultTableModel) PostTbl.getModel();
        int MyIndex = PostTbl.getSelectedRow();
        id = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
    }//GEN-LAST:event_PostTblMouseClicked

    private Main main;

    public void setMain(Main main) {
        this.main = main;
    }

    private void DetailBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DetailBtnMouseClicked
        if (id == 0) {
            JOptionPane.showMessageDialog(this, "Please choose post");
        } else {
            main.showForm(new Comments(id));
        }

    }//GEN-LAST:event_DetailBtnMouseClicked

    private void DetailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DetailBtnActionPerformed

    }//GEN-LAST:event_DetailBtnActionPerformed

    private void SearchBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchBtnMouseClicked
        if (SearchTb.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter searchbox");
        } else {
            if (SearchCb.getSelectedIndex() == 0) {
                SearchWithTitle();
            }
            if (SearchCb.getSelectedIndex() == 1) {
                SearchWithUserName();
            }
            if (SearchCb.getSelectedIndex() == 2) {
                SearchWithPostID();
            }
        }
    }//GEN-LAST:event_SearchBtnMouseClicked

    private void RefeshBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RefeshBtnMouseClicked
        DisplayPosts();
    }//GEN-LAST:event_RefeshBtnMouseClicked

    private void DeleteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteBtnMouseClicked
        if (id == 0) {
            JOptionPane.showMessageDialog(this, "Select the post to delete");
        } else {
            int confirmDialogResult = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete this post?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);

            if (confirmDialogResult == JOptionPane.YES_OPTION) {
                try {
                    Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
                    String Query = "DELETE FROM posts WHERE PostID = " + id;
                    Statement Del = Con.createStatement();
                    Del.executeUpdate(Query);
                    JOptionPane.showMessageDialog(this, "Post Deleted");
                    Con.close();
                    DisplayPosts();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, e);
                }
            }
        }
    }//GEN-LAST:event_DeleteBtnMouseClicked
    Connection Con = null;
    PreparedStatement pst = null;
    ResultSet Rs = null;
    Statement St = null;

    private void DisplayPosts() {
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
            St = Con.createStatement();
            Rs = St.executeQuery("select * from posts");
            Connection Con1 = null;
            PreparedStatement pst1 = null;
            ResultSet Rs1 = null;
            Statement St1 = null;
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("PostID");
            model.addColumn("UserName");
            model.addColumn("Title");
            model.addColumn("CreatedAt");
            model.addColumn("UpdatedAt");

            while (Rs.next()) {
                String userName = "";
                int userID = Rs.getInt("UserID");
                int postID = Rs.getInt("PostID");
                Con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
                St1 = Con1.createStatement();
                Rs1 = St1.executeQuery("select * from users where UserID = " + userID);
                if (Rs1.next()) {
                    userName = Rs1.getString("Username");
                }
                Con1.close();
                String title = Rs.getString("Title");
                Timestamp createdAt = Rs.getTimestamp("CreatedAt");
                Timestamp updatedAt = Rs.getTimestamp("UpdatedAt");

                model.addRow(new Object[]{postID, userName, title, createdAt, updatedAt});
            }

            PostTbl.setModel(model);
            Con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void SearchWithTitle() {
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
            String query = "SELECT * FROM posts WHERE Title LIKE ?";
            PreparedStatement search = Con.prepareStatement(query);
            search.setString(1, "%" + SearchTb.getText() + "%");
            Rs = search.executeQuery();
            Connection Con1 = null;
            PreparedStatement pst1 = null;
            ResultSet Rs1 = null;
            Statement St1 = null;
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("PostID");
            model.addColumn("UserName");
            model.addColumn("Title");
            model.addColumn("CreatedAt");
            model.addColumn("UpdatedAt");

            while (Rs.next()) {
                String userName = "";
                int userID = Rs.getInt("UserID");
                int postID = Rs.getInt("PostID");
                Con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
                St1 = Con1.createStatement();
                Rs1 = St1.executeQuery("select * from users where UserID = " + userID);
                if (Rs1.next()) {
                    userName = Rs1.getString("Username");
                }
                Con1.close();
                String title = Rs.getString("Title");
                Timestamp createdAt = Rs.getTimestamp("CreatedAt");
                Timestamp updatedAt = Rs.getTimestamp("UpdatedAt");

                model.addRow(new Object[]{postID, userName, title, createdAt, updatedAt});
            }

            PostTbl.setModel(model);
            Con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void SearchWithUserName() {
        try {
            Connection Con1 = null, Con2 = null;
            PreparedStatement pst1 = null, pst2 = null;
            ResultSet Rs1 = null, Rs2 = null;
            Statement St1 = null, St2 = null;
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
            String query = "SELECT * FROM posts WHERE UserID = ?";
            PreparedStatement search = Con.prepareStatement(query);
            Con2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
            pst2 = Con2.prepareStatement("select * from users where Username = ?");
            pst2.setString(1, SearchTb.getText() );
            Rs2 = pst2.executeQuery();
            int uID = 0;
            if (Rs2.next()) {
                uID = Rs2.getInt("UserID");
            }
            Con2.close();
            search.setInt(1, uID);
            Rs = search.executeQuery();

            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("PostID");
            model.addColumn("UserName");
            model.addColumn("Title");
            model.addColumn("CreatedAt");
            model.addColumn("UpdatedAt");

            while (Rs.next()) {
                String userName = "";
                int userID = Rs.getInt("UserID");
                int postID = Rs.getInt("PostID");
                Con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
                St1 = Con1.createStatement();
                Rs1 = St1.executeQuery("select * from users where UserID = " + userID);
                if (Rs1.next()) {
                    userName = Rs1.getString("Username");
                }
                Con1.close();
                String title = Rs.getString("Title");
                Timestamp createdAt = Rs.getTimestamp("CreatedAt");
                Timestamp updatedAt = Rs.getTimestamp("UpdatedAt");

                model.addRow(new Object[]{postID, userName, title, createdAt, updatedAt});
            }

            PostTbl.setModel(model);
            Con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void SearchWithPostID() {
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
            String query = "SELECT * FROM posts WHERE PostID LIKE ?";
            PreparedStatement search = Con.prepareStatement(query);
            search.setString(1, "%" + SearchTb.getText() + "%");
            Rs = search.executeQuery();
            Connection Con1 = null;
            PreparedStatement pst1 = null;
            ResultSet Rs1 = null;
            Statement St1 = null;
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("PostID");
            model.addColumn("UserName");
            model.addColumn("Title");
            model.addColumn("CreatedAt");
            model.addColumn("UpdatedAt");

            while (Rs.next()) {
                String userName = "";
                int userID = Rs.getInt("UserID");
                int postID = Rs.getInt("PostID");
                Con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");
                St1 = Con1.createStatement();
                Rs1 = St1.executeQuery("select * from users where UserID = " + userID);
                if (Rs1.next()) {
                    userName = Rs1.getString("Username");
                }
                Con1.close();
                String title = Rs.getString("Title");
                Timestamp createdAt = Rs.getTimestamp("CreatedAt");
                Timestamp updatedAt = Rs.getTimestamp("UpdatedAt");

                model.addRow(new Object[]{postID, userName, title, createdAt, updatedAt});
            }

            PostTbl.setModel(model);
            Con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteBtn;
    private javax.swing.JButton DetailBtn;
    private swing.Table PostTbl;
    private javax.swing.JButton RefeshBtn;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JComboBox<String> SearchCb;
    private javax.swing.JTextField SearchTb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private swing.RoundPanel roundPanel2;
    // End of variables declaration//GEN-END:variables
}

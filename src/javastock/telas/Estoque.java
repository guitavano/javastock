
package javastock.telas;

import javax.swing.JOptionPane;
import  javastock.conexoes.DBConnection;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Estoque extends javax.swing.JFrame {
    
    DBConnection conectar = new DBConnection();
    private int idSelecionado;
    
    public Estoque() {
        initComponents();
        atualizaEstoqueNaTela();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaDeProdutos = new javax.swing.JTable();
        inputQuantidadeEstoque = new javax.swing.JTextField();
        inputNomeEstoque = new javax.swing.JTextField();
        inputIdEstoque = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btnAdicionaEstoque = new javax.swing.JButton();
        btnAtualizaEstoque = new javax.swing.JButton();
        btnRemoveEstoque = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tabelaDeProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nome", "Quantidade"
            }
        ));
        tabelaDeProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaDeProdutosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaDeProdutos);

        inputQuantidadeEstoque.setMinimumSize(new java.awt.Dimension(20, 20));
        inputQuantidadeEstoque.setName(""); // NOI18N
        inputQuantidadeEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputQuantidadeEstoqueActionPerformed(evt);
            }
        });

        inputNomeEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomeEstoqueActionPerformed(evt);
            }
        });

        inputIdEstoque.setToolTipText("");
        inputIdEstoque.setMinimumSize(new java.awt.Dimension(20, 20));
        inputIdEstoque.setName(""); // NOI18N

        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javastock/imagens/car.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnAdicionaEstoque.setBackground(new java.awt.Color(0, 153, 0));
        btnAdicionaEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javastock/imagens/criar.png"))); // NOI18N
        btnAdicionaEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionaEstoqueActionPerformed(evt);
            }
        });

        btnAtualizaEstoque.setBackground(new java.awt.Color(0, 0, 153));
        btnAtualizaEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javastock/imagens/atualizar.png"))); // NOI18N
        btnAtualizaEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizaEstoqueActionPerformed(evt);
            }
        });

        btnRemoveEstoque.setBackground(new java.awt.Color(204, 0, 0));
        btnRemoveEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javastock/imagens/remover.png"))); // NOI18N
        btnRemoveEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveEstoqueActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        jLabel2.setText("Nome");

        jLabel3.setText("Quantidade");

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jLabel4.setText("Estoque");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1)
                        .addGap(117, 117, 117)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 594, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(inputIdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(inputNomeEstoque)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(261, 261, 261)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(inputQuantidadeEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnAdicionaEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnAtualizaEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnRemoveEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel3))))))
                .addContainerGap(8, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAdicionaEstoque, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputQuantidadeEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputNomeEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputIdEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnAtualizaEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoveEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        inputQuantidadeEstoque.getAccessibleContext().setAccessibleName("");
        inputNomeEstoque.getAccessibleContext().setAccessibleName("");
        inputIdEstoque.getAccessibleContext().setAccessibleName("");

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 640, 450));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javastock/imagens/bg.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 703, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        new Menu().setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void inputNomeEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomeEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNomeEstoqueActionPerformed

    private void btnAdicionaEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionaEstoqueActionPerformed
        cadastrarEstoque();
    }//GEN-LAST:event_btnAdicionaEstoqueActionPerformed

    private void inputQuantidadeEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputQuantidadeEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputQuantidadeEstoqueActionPerformed

    private void btnRemoveEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveEstoqueActionPerformed
        excluirProduto();
    }//GEN-LAST:event_btnRemoveEstoqueActionPerformed

    private void tabelaDeProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaDeProdutosMouseClicked
        JTable source = (JTable)evt.getSource();
        
        int row = source.rowAtPoint( evt.getPoint() );
        int column = 0;
                 
        String s = source.getModel().getValueAt(row, column)+"";
        idSelecionado = Integer.parseInt(s);
    }//GEN-LAST:event_tabelaDeProdutosMouseClicked

    private void btnAtualizaEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizaEstoqueActionPerformed
        atualizarProduto();
    }//GEN-LAST:event_btnAtualizaEstoqueActionPerformed

    
    public void atualizaEstoqueNaTela(){
        this.conectar.conectaBanco();
        
        DefaultTableModel model =(DefaultTableModel) tabelaDeProdutos.getModel();
         
        try{                
            this.conectar.executarSQL("SELECT * from estoque");
            model.setRowCount(0);
            while(this.conectar.getResultSet().next()){    
                String id = this.conectar.getResultSet().getString(1);
                String nome = this.conectar.getResultSet().getString(2);
                String quantidade = this.conectar.getResultSet().getString(3);

                model.addRow(new Object[]{
                id,
                nome,
                quantidade
                });

            }   

        } catch (Exception e) {    

            System.out.println("Erro ao consultar produtos " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao buscar dados de produtos");

        }finally{
            this.conectar.fechaBanco();  
        }    
    } 
    public void cadastrarEstoque(){
        this.conectar.conectaBanco();
        
        try {    
            String name = inputNomeEstoque.getText();
            int quantidade = Integer.parseInt(inputQuantidadeEstoque.getText());
            
            this.conectar.cadastra("INSERT INTO estoque ("
                    + "nome,"
                    + "quantidade"
                + ") VALUES ("
                    + "'" + name + "',"
                    + "'" + quantidade + "'"

                + ");");
            
        } catch (Exception e) {
            
            System.out.println("Erro ao cadastrar cliente " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar produto");
            
        } finally{            
            this.conectar.fechaBanco();
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso");
            limparCampos();
            atualizaEstoqueNaTela();
        }
    }
    public void excluirProduto(){
        this.conectar.conectaBanco();
        DefaultTableModel model =(DefaultTableModel) tabelaDeProdutos.getModel();
        
        if(inputIdEstoque.getText().equals("")){
            try{                
                this.conectar.cadastra("DELETE FROM estoque WHERE id=" + idSelecionado); 
                limparCampos();
            } catch (Exception e) {    

                System.out.println("Erro ao excluir produto " +  e.getMessage());
                JOptionPane.showMessageDialog(null, "Erro ao excluir produto");

            }finally{
                this.conectar.fechaBanco();  
                atualizaEstoqueNaTela();
            }  
        }else{
            try{                
                this.conectar.cadastra("DELETE FROM estoque WHERE id=" + Integer.parseInt(inputIdEstoque.getText())); 
                limparCampos();
            } catch (Exception e) {    

                System.out.println("Erro ao excluir produto " +  e.getMessage());
                JOptionPane.showMessageDialog(null, "Erro ao excluir produto");

            }finally{
                this.conectar.fechaBanco();  
                atualizaEstoqueNaTela();
            }    
        }
    }
    public void atualizarProduto(){
        this.conectar.conectaBanco();

        try{                
            this.conectar.atualiza("UPDATE estoque SET "
                    + "nome='" + inputNomeEstoque.getText() + "',"
                    + "quantidade=" + Integer.parseInt(inputQuantidadeEstoque.getText())
                    + " WHERE id=" + Integer.parseInt(inputIdEstoque.getText())); 
            limparCampos();
        } catch (Exception e) {    

            System.out.println("Erro ao excluir produto " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao excluir produto");

        }finally{
            this.conectar.fechaBanco();  
            atualizaEstoqueNaTela();
        }  

    }
    
    public void limparCampos(){
        inputIdEstoque.setText("");
        inputNomeEstoque.setText("");
        inputQuantidadeEstoque.setText("");
    }
    
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
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Estoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Estoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionaEstoque;
    private javax.swing.JButton btnAtualizaEstoque;
    private javax.swing.JButton btnRemoveEstoque;
    private javax.swing.JTextField inputIdEstoque;
    private javax.swing.JTextField inputNomeEstoque;
    private javax.swing.JTextField inputQuantidadeEstoque;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaDeProdutos;
    // End of variables declaration//GEN-END:variables
}

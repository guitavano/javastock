
package javastock.telas;

import javastock.conexoes.DBConnection;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Clientes extends javax.swing.JFrame {
    
    DBConnection conectar = new DBConnection();
    private String emailSelecionado;

    public Clientes() {
        initComponents();
        atualizaEstoqueNaTela();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        inputEmailCliente = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputNomeCliente = new javax.swing.JTextField();
        inputTelefoneCliente = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnAdicionaCliente = new javax.swing.JButton();
        btnAtualizaCliente = new javax.swing.JButton();
        btnRemoveCliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaDeClientes = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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

        inputEmailCliente.setToolTipText("");
        inputEmailCliente.setMinimumSize(new java.awt.Dimension(20, 20));
        inputEmailCliente.setName(""); // NOI18N

        jLabel1.setText("Email");

        jLabel2.setText("Nome");

        inputNomeCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNomeClienteActionPerformed(evt);
            }
        });

        inputTelefoneCliente.setMinimumSize(new java.awt.Dimension(20, 20));
        inputTelefoneCliente.setName(""); // NOI18N

        jLabel3.setText("Telefone");

        btnAdicionaCliente.setBackground(new java.awt.Color(0, 153, 0));
        btnAdicionaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javastock/imagens/criar.png"))); // NOI18N
        btnAdicionaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionaClienteActionPerformed(evt);
            }
        });

        btnAtualizaCliente.setBackground(new java.awt.Color(0, 0, 153));
        btnAtualizaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javastock/imagens/atualizar.png"))); // NOI18N
        btnAtualizaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizaClienteActionPerformed(evt);
            }
        });

        btnRemoveCliente.setBackground(new java.awt.Color(204, 0, 0));
        btnRemoveCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javastock/imagens/remover.png"))); // NOI18N
        btnRemoveCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveClienteActionPerformed(evt);
            }
        });

        tabelaDeClientes.setModel(new javax.swing.table.DefaultTableModel(
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
                "Email", "Nome", "Telefone"
            }
        ));
        tabelaDeClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaDeClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelaDeClientes);

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jLabel4.setText("Clientes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(107, 107, 107)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputEmailCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(inputNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(inputTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAdicionaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnAtualizaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRemoveCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))
                        .addGap(20, 20, 20))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAdicionaCliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputTelefoneCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputEmailCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnAtualizaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemoveCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

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

    private void inputNomeClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNomeClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNomeClienteActionPerformed

    private void btnAdicionaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionaClienteActionPerformed
        cadastrarCliente();
    }//GEN-LAST:event_btnAdicionaClienteActionPerformed

    private void btnAtualizaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizaClienteActionPerformed
        atualizarCliente();
    }//GEN-LAST:event_btnAtualizaClienteActionPerformed

    private void btnRemoveClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveClienteActionPerformed
        excluirCliente();
    }//GEN-LAST:event_btnRemoveClienteActionPerformed

    private void tabelaDeClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaDeClientesMouseClicked
        JTable source = (JTable)evt.getSource();
        
        int row = source.rowAtPoint( evt.getPoint() );
        int column = 0;
                 
        String s = source.getModel().getValueAt(row, column)+"";
        emailSelecionado = s;
    }//GEN-LAST:event_tabelaDeClientesMouseClicked


    public void cadastrarCliente(){
        this.conectar.conectaBanco();
        
        try {    
            String name = inputNomeCliente.getText();
            String email = inputEmailCliente.getText();
            String telefone = inputTelefoneCliente.getText();
            
            this.conectar.cadastra("INSERT INTO Clientes ("
                    + "email,"
                    + "nome,"
                    + "telefone"
                + ") VALUES ("
                    + "'" + email + "',"
                    + "'" + name + "',"
                    + "'" + telefone + "'"

                + ");");
            
        } catch (Exception e) {
            
            System.out.println("Erro ao cadastrar cliente " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar cliente");
            
        } finally{            
            this.conectar.fechaBanco();
            JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso");
            //novoCliente.limpaCliente();
            limparCampos();
            atualizaEstoqueNaTela();
        }
    }
    public void excluirCliente(){
        this.conectar.conectaBanco();
        DefaultTableModel model =(DefaultTableModel) tabelaDeClientes.getModel();
        
        if(inputEmailCliente.getText().equals("")){
            try{                
                this.conectar.cadastra("DELETE FROM Clientes WHERE email='" + emailSelecionado + "';"); 
                limparCampos();
            } catch (Exception e) {    

                System.out.println("Erro ao excluir cliente " +  e.getMessage());
                JOptionPane.showMessageDialog(null, "Erro ao excluir cliente");

            }finally{
                this.conectar.fechaBanco();  
                atualizaEstoqueNaTela();
            }  
        }else{
            try{                
                this.conectar.cadastra("DELETE FROM Clientes WHERE email='" + inputEmailCliente.getText() + "';"); 
                limparCampos();
            } catch (Exception e) {    

                System.out.println("Erro ao excluir cliente " +  e.getMessage());
                JOptionPane.showMessageDialog(null, "Erro ao excluir cliente");

            }finally{
                this.conectar.fechaBanco();  
                atualizaEstoqueNaTela();
            }    
        }
    }
    public void atualizarCliente(){
        this.conectar.conectaBanco();

        try{                
            this.conectar.atualiza("UPDATE Clientes SET "
                    + "nome='" + inputNomeCliente.getText() + "',"
                    + "telefone='" + inputTelefoneCliente.getText() + "'"
                    + " WHERE email='" + inputEmailCliente.getText()+ "'"); 
            limparCampos();
        } catch (Exception e) {    

            System.out.println("Erro ao excluir cliente " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao excluir cliente");

        }finally{
            this.conectar.fechaBanco();  
            atualizaEstoqueNaTela();
        }  

    }
    
    public void atualizaEstoqueNaTela(){
        this.conectar.conectaBanco();
        
        DefaultTableModel model =(DefaultTableModel) tabelaDeClientes.getModel();
         
        try{                
            this.conectar.executarSQL("SELECT * from Clientes");
            model.setRowCount(0);
            while(this.conectar.getResultSet().next()){    
                String email = this.conectar.getResultSet().getString(1);
                String nome = this.conectar.getResultSet().getString(2);
                String telefone = this.conectar.getResultSet().getString(3);

                model.addRow(new Object[]{
                email,
                nome,
                telefone
                });

            }   

        } catch (Exception e) {    

            System.out.println("Erro ao consultar clientes " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao buscar dados do perfil");

        }finally{
            this.conectar.fechaBanco();  
        }    
    } 

     public void limparCampos(){
        inputEmailCliente.setText("");
        inputNomeCliente.setText("");
        inputTelefoneCliente.setText("");
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
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdicionaCliente;
    private javax.swing.JButton btnAtualizaCliente;
    private javax.swing.JButton btnRemoveCliente;
    private javax.swing.JTextField inputEmailCliente;
    private javax.swing.JTextField inputNomeCliente;
    private javax.swing.JTextField inputTelefoneCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaDeClientes;
    // End of variables declaration//GEN-END:variables
}


package javastock.telas;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import javastock.conexoes.DBConnection;
import javax.swing.JOptionPane;

public class Relatorios extends javax.swing.JFrame {
    DBConnection conectar = new DBConnection();
    
    public Relatorios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        btnProdutos = new javax.swing.JToggleButton();
        btnVendas = new javax.swing.JToggleButton();
        btnClientes = new javax.swing.JToggleButton();
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

        btnProdutos.setBackground(new java.awt.Color(0, 51, 204));
        btnProdutos.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        btnProdutos.setForeground(new java.awt.Color(255, 255, 255));
        btnProdutos.setText("Relatório de Produtos");
        btnProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProdutosActionPerformed(evt);
            }
        });

        btnVendas.setBackground(new java.awt.Color(0, 51, 204));
        btnVendas.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        btnVendas.setForeground(new java.awt.Color(255, 255, 255));
        btnVendas.setText("Relatório de Vendas");
        btnVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVendasActionPerformed(evt);
            }
        });

        btnClientes.setBackground(new java.awt.Color(0, 51, 204));
        btnClientes.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes.setText("Relatório de Clientes");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jLabel4.setText("Relatoria");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addGap(139, 139, 139)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(jLabel4))
                .addGap(73, 73, 73)
                .addComponent(btnProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
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

    private void btnProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProdutosActionPerformed
        gerarPDF("produto", 3);
    }//GEN-LAST:event_btnProdutosActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        gerarPDF("cliente", 3);
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVendasActionPerformed
        gerarPDF("venda", 5);
    }//GEN-LAST:event_btnVendasActionPerformed

    
    private void gerarPDF(String tipo, int colunas){
        Document doc = new Document();
        
        String arquivoPdf = "relatorio.pdf";
        
        try{
            PdfWriter.getInstance(doc, new FileOutputStream(arquivoPdf));
            doc.open();
            
            Paragraph p = new Paragraph("Relatório");
            p.setAlignment(1);
            doc.add(p);
            
            p = new Paragraph("\n");          
            doc.add(p);
            p = new Paragraph("");          
            doc.add(p);
            
            PdfPTable table = new PdfPTable(colunas);
            
            if(tipo.equals("produto")){
                PdfPCell cel1 = new PdfPCell(new Paragraph("ID"));
                PdfPCell cel2 = new PdfPCell(new Paragraph("Nome"));
                PdfPCell cel3 = new PdfPCell(new Paragraph("Quantidade"));
                
                table.addCell(cel1);
                table.addCell(cel2);
                table.addCell(cel3);
                

                this.conectar.conectaBanco();

                try{                
                    this.conectar.executarSQL("SELECT * from estoque");

                    while(this.conectar.getResultSet().next()){    
                        String id = this.conectar.getResultSet().getString(1);
                        String nome = this.conectar.getResultSet().getString(2);
                        String quantidade = this.conectar.getResultSet().getString(3);

                        cel1 = new PdfPCell(new Paragraph(id));
                        cel2 = new PdfPCell(new Paragraph(nome));
                        cel3 = new PdfPCell(new Paragraph(quantidade));

                        table.addCell(cel1);
                        table.addCell(cel2);
                        table.addCell(cel3);
                    }   
                doc.add(table);
                doc.close();
                Desktop.getDesktop().open(new File(arquivoPdf));

                } catch (Exception e) {    

                    System.out.println("Erro ao consultar produtos " +  e.getMessage());
                    JOptionPane.showMessageDialog(null, "Erro ao buscar dados de produtos");

                }finally{
                    this.conectar.fechaBanco();  
                }   
            }else if(tipo.equals("cliente")){
                PdfPCell cel1 = new PdfPCell(new Paragraph("E-mail"));
                PdfPCell cel2 = new PdfPCell(new Paragraph("Nome"));
                PdfPCell cel3 = new PdfPCell(new Paragraph("Telefone"));
                
                table.addCell(cel1);
                table.addCell(cel2);
                table.addCell(cel3);
                

                this.conectar.conectaBanco();

                try{                
                    this.conectar.executarSQL("SELECT * from Clientes");

                    while(this.conectar.getResultSet().next()){    
                        String email = this.conectar.getResultSet().getString(1);
                        String nome = this.conectar.getResultSet().getString(2);
                        String telefone = this.conectar.getResultSet().getString(3);

                        cel1 = new PdfPCell(new Paragraph(email));
                        cel2 = new PdfPCell(new Paragraph(nome));
                        cel3 = new PdfPCell(new Paragraph(telefone));

                        table.addCell(cel1);
                        table.addCell(cel2);
                        table.addCell(cel3);
                    }   
                doc.add(table);
                doc.close();
                Desktop.getDesktop().open(new File(arquivoPdf));

                } catch (Exception e) {    

                    System.out.println("Erro ao consultar clientes " +  e.getMessage());
                    JOptionPane.showMessageDialog(null, "Erro ao buscar dados de clientes");

                }finally{
                    this.conectar.fechaBanco();  
                }  
            }else if(tipo.equals("venda")){
                PdfPCell cel1 = new PdfPCell(new Paragraph("Preço Venda"));
                PdfPCell cel2 = new PdfPCell(new Paragraph("Custo"));
                PdfPCell cel3 = new PdfPCell(new Paragraph("Comissão"));
                PdfPCell cel4 = new PdfPCell(new Paragraph("Frete"));
                PdfPCell cel5 = new PdfPCell(new Paragraph("Lucro"));
                
                table.addCell(cel1);
                table.addCell(cel2);
                table.addCell(cel3);
                table.addCell(cel4);
                table.addCell(cel5);
                

                this.conectar.conectaBanco();

                try{                
                    this.conectar.executarSQL("SELECT * from vendas");
                    
                    double total = 0;

                    while(this.conectar.getResultSet().next()){    
                        String venda = this.conectar.getResultSet().getString(1);
                        String custo = this.conectar.getResultSet().getString(2);
                        String comissao = this.conectar.getResultSet().getString(3);
                        String frete = this.conectar.getResultSet().getString(4);
                        double lucro = Double.parseDouble(venda)
                                       -Double.parseDouble(custo)
                                       -Double.parseDouble(comissao)
                                       -Double.parseDouble(frete);
                        
                        total += lucro;

                        cel1 = new PdfPCell(new Paragraph(venda));
                        cel2 = new PdfPCell(new Paragraph(custo));
                        cel3 = new PdfPCell(new Paragraph(comissao));
                        cel4 = new PdfPCell(new Paragraph(frete));
                        cel5 = new PdfPCell(new Paragraph(lucro + ""));

                        table.addCell(cel1);
                        table.addCell(cel2);
                        table.addCell(cel3);
                        table.addCell(cel4);
                        table.addCell(cel5);
                    }   
                    
                cel1 = new PdfPCell(new Paragraph(""));
                cel2 = new PdfPCell(new Paragraph(""));
                cel3 = new PdfPCell(new Paragraph(""));
                cel4 = new PdfPCell(new Paragraph("Total:"));
                cel5 = new PdfPCell(new Paragraph(total + ""));
                table.addCell(cel1);
                table.addCell(cel2);
                table.addCell(cel3);
                table.addCell(cel4);
                table.addCell(cel5);
                
                doc.add(table);
                doc.close();
                Desktop.getDesktop().open(new File(arquivoPdf));

                } catch (Exception e) {    

                    System.out.println("Erro ao consultar vendas " +  e.getMessage());
                    JOptionPane.showMessageDialog(null, "Erro ao buscar dados de vendas");

                }finally{
                    this.conectar.fechaBanco();  
                }  
            }
            
        }catch(Exception e){
            
        }
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
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Relatorios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Relatorios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnClientes;
    private javax.swing.JToggleButton btnProdutos;
    private javax.swing.JToggleButton btnVendas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

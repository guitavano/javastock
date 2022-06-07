/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javastock.conexoes;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnection {
    
    private Connection conn = null; //variável de conexão com o banco
    private Statement statement; //variável de manipulação do SQL
    private ResultSet resultSet;
    
    private String servidor = "localhost:3308";
    private String nomeDoBanco = "javastock";
    private String usuario = "root";
    private String senha = "";
    
    public DBConnection(){

    }
    
    public DBConnection(String servidor, String nomeDoBanco, String usuario, String senha){
        this.servidor = servidor;
        this.nomeDoBanco = nomeDoBanco;
        this.usuario = usuario;
        this.senha = senha;
    }
    
    public Connection getConn() {
        return conn;
    }
    
    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public Statement getStatement() {
        return statement;
    }

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public ResultSet getResultSet() {
        return resultSet;
    }

    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }
    
    public void conectaBanco(){
        try {
            //Class.forName("com.mysql.jdbc.Driver").newInstance();

            conn = DriverManager.getConnection("jdbc:mysql://" + servidor + "/" + nomeDoBanco, usuario, senha);
            //conn = DriverManager.getConnection("jdbc:mysql://localhost3306/banco_loja", "root", "root");
            
            if(conn != null){
                System.out.println("Conexão efetuada com sucesso! " + "ID: " + conn);
            }            
            
        } catch (Exception e) {
            System.out.println("Conexão não realizada - ERRO: " + e.getMessage());
        }
    }
    
    public boolean fechaBanco(){
        try {
            conn.close();
            return true;
        } catch (Exception e) {
            System.out.println("Erro ao fechar conexao " + e.getMessage());
            return false;
        }
    }
    
    public int cadastra(String SQL){
        int status = 0;
        try {
            //createStatement de con para criar o Statement
            this.setStatement(getConn().createStatement());            

            // Definido o Statement, executamos a query no banco de dados
            this.getStatement().executeUpdate(SQL);            
        
            return status;
        } catch (SQLException ex) {
            return status;
        }
    }
    
    public int atualiza(String SQL){
        int status = 0;
        try {
            //createStatement de con para criar o Statement
            this.setStatement(getConn().createStatement());            

            // Definido o Statement, executamos a query no banco de dados
            this.getStatement().executeUpdate(SQL);            
        
            return status;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return status;
        }
    }

    public void executarSQL(String sql){
        try{
            this.statement = conn.createStatement(
            ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            this.resultSet = this.statement.executeQuery(sql);
            
        }catch(SQLException sqlex){
            System.out.println(sqlex);
        }
    }
    
}

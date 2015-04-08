/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Pergunta;

/**
 *
 * @author Adriel
 */
public class PerguntaDao {
     public Boolean Pergunta(Pergunta pergunta) throws SQLException{
        Boolean retorno;
        
        String sql = "INSERT INTO Usuario(nome, senha, email)" + "VALUES (?,?,?)";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        try
        {
        pst.setString(1, pergunta.getPergunta());
        pst.setString(2, pergunta.getA());
        pst.setString(3, pergunta.getB());
        pst.setString(4, pergunta.getC());
        pst.setString(5, pergunta.getD());
        pst.setString(6, pergunta.getCerta());
                
                
                
        pst.executeUpdate();
        retorno = true;
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
            retorno = false;
        }
    return retorno;
        
     public List<Pergunta> listar()
    {
    List<Pergunta> lista = new ArrayList<Pergunta>();
    String sql = "SELECT * FROM Pergunta";
    PreparedStatement pst = Conexao.getPreparedStatement(sql);
    
    try{
        ResultSet res = pst.executeQuery();
        
        while(res.next())
        {
            Pergunta pergunta = new Pergunta();
            pergunta.setPergunta(res.getString(""));
            pergunta.setA( res.getString(""));
            pergunta.setB( res.getString(""));
            pergunta.setC( res.getString(""));
            pergunta.setD(res.getString(""));
            pergunta.setCerta(res.getString(""));
            
            lista.add(pergunta);
            
        }
        
    } catch (SQLException Ex) {
        Logger.getLogger(JogadorDao.class.getName()).log(Level.SEVERE, null, Ex);
    }
    return lista;
    }
   
    
    }
}

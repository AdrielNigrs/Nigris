/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package adrielpessoa;
import javax.swing.JOptionPane;
import modelo.Pessoa;
/**
 *
 * @author Adriel
 */
public class AdrielPessoa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Pessoa pessoa = new Pessoa();
        
        pessoa.setNome(JOptionPane.showInputDialog("Informe seu nome: "));
        pessoa.setCodigo(JOptionPane.showInputDialog("Informe o código: "));
        pessoa.setSexo(JOptionPane.showInputDialog("Informe o sexo: "));
                
        JOptionPane.showMessageDialog(null, "Nome: \n" + pessoa.getNome() + "Codigo: \n" + pessoa.getCodigo() + "Sexo: \n" + pessoa.getSexo());
        
        
                
        
    }
    
}

/*
 
 */

import javax.swing.JOptionPane;

public class Principal_Exemplo_While {
    
    public static void main (String args[]) {
        int numero=1;
        Exemplo_While exemplo_while = new Exemplo_While();
        
        while (numero != 0 ) {
            numero = Integer.parseInt(
            JOptionPane.showInputDialog("informe um numero"));
            exemplo_while.somar(numero);
        }//while
        
        JOptionPane.showMessageDialog(null, exemplo_while.mostra());
        
    }//metodo principal
    
}//classe

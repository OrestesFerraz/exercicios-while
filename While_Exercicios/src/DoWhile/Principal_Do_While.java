
package DoWhile;

import javax.swing.JOptionPane;

public class Principal_Do_While {
    
    public static void main ( String args[] ) {
        
        int numero;
        
        DoWhile1 dowhile1 = new DoWhile1();
        
        do {
            numero = Integer.parseInt(
                JOptionPane.showInputDialog("informe o numero"));
            dowhile1.somar(numero);
        } while (numero != 10);
        JOptionPane.showMessageDialog(null, dowhile1.mostra());
    }
}

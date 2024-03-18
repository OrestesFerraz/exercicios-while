/*

 */
package While_Ex;

import javax.swing.JOptionPane;

public class Principal_Ex01 {
    
   public static void main (String args[]) {
       int contador = 1;
       
       int numero = 0;
       
       Ex01 ex01 = new Ex01();
       
       while (contador <= 10) {
           numero = Integer.parseInt(
                JOptionPane.showInputDialog("informe um numero "));
            ex01.somar(numero);
            contador++;
       }
       JOptionPane.showMessageDialog(null, ex01.mostra());
   }
}

/*
 
 */
package While_Ex;


public class Ex01 {
    
    private int soma, numero;
    
    public void somar (int numero) {
        this.numero = numero;
        this.soma += this.numero;
    }
    public int mostra () {
        return this.soma;
    }
}

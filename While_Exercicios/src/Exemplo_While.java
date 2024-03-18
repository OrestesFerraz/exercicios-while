/*

 */


public class Exemplo_While {
    
    private int soma, numero;
    
    public void somar (int numero) {
       
        this.numero = numero;
        
        this.soma += this.numero;
        
    }
    public String mostra () {
        return " você digitou 0 " + this.soma + " vezes";
    }
}

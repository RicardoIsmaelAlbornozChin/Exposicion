/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_circular;

/**
 *
 * @author LUISCHI
 */
public class NodoLC {
    // Variable en la cual se va a guardar el valor.
    private int valor;
    // Variable para enlazar los nodos.
    private NodoLC siguiente;
    /**
     * Constructor que inicializamos el valor de las variables.
     */
    public void Nodo(){
        this.valor = 0;
        this.siguiente = null;
    }
    
    // Métodos get y set para los atributos.
    
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NodoLC getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLC siguiente) {
        this.siguiente = siguiente;
    }  
}

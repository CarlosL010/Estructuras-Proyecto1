/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDD;

/**
 * La clase Nodo representa un nodo individual en una estructura de datos.
 * Contiene un carácter y una lista de aristas adyacentes que representan conexiones con otros nodos.
 * 
 * @author Pinto
 */
public class Nodo {

    /** El carácter que almacena este nodo. */
    private String caracter;
    
    /** El siguiente nodo en la estructura de datos. */
    private Nodo pNext;
    
    /** Lista de aristas adyacentes a este nodo. */
    private ListaAristas caracteres_adyacentes;

    /**
     * Constructor que inicializa un nodo con un carácter específico.
     * 
     * @param caracter El carácter que el nodo va a almacenar.
     */
    public Nodo(String caracter) {
        this.caracter = caracter;
        this.pNext = null;
        this.caracteres_adyacentes = new ListaAristas();
    }

    /**
     * Constructor alternativo que inicializa un nodo con una lista de aristas adyacentes.
     * 
     * @param listainterna La lista de aristas adyacentes al nodo.
     */
    public Nodo(ListaAristas listainterna) {
        this.caracteres_adyacentes = listainterna;
    }

    /**
     * Obtiene el carácter almacenado en este nodo.
     * 
     * @return El carácter del nodo.
     */
    public String getCaracter() {
        return caracter;
    }

    /**
     * Establece el carácter de este nodo.
     * 
     * @param caracter El nuevo carácter para el nodo.
     */
    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }

    /**
     * Obtiene el siguiente nodo en la estructura de datos.
     * 
     * @return El siguiente nodo.
     */
    public Nodo getpNext() {
        return pNext;
    }

    /**
     * Establece el siguiente nodo en la estructura de datos.
     * 
     * @param pNext El nodo que se establecerá como el siguiente.
     */
    public void setpNext(Nodo pNext) {
        this.pNext = pNext;
    }

    /**
     * Obtiene la lista de aristas adyacentes a este nodo.
     * 
     * @return La lista de aristas adyacentes.
     */
    public ListaAristas getCaracteres_adyacentes() {
        return caracteres_adyacentes;
    }

    /**
     * Establece la lista de aristas adyacentes a este nodo.
     * 
     * @param caracteres_adyacentes La nueva lista de aristas adyacentes.
     */
    public void setCaracteres_adyacentes(ListaAristas caracteres_adyacentes) {
        this.caracteres_adyacentes = caracteres_adyacentes;
    }
}


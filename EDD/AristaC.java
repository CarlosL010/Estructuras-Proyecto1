/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 * La clase AristaC representa una arista en una estructura de datos de grafo.
 * Esta arista conecta dos nodos y puede ser parte de una lista enlazada de aristas.
 * 
 * @author pinto
 */
public class AristaC {

    /** El primer nodo de la arista. */
    public Nodo NodoA;
    
    /** El segundo nodo de la arista. */
    public Nodo NodoB;
    
    /** El siguiente elemento en la lista enlazada de aristas. */
    public AristaC pNext;

    /**
     * Constructor para crear una nueva arista que conecta dos nodos.
     * 
     * @param nodoA El primer nodo que esta arista conectará.
     * @param nodoB El segundo nodo que esta arista conectará.
     */
    public AristaC(Nodo nodoA, Nodo nodoB) {
        this.NodoA = nodoA;
        this.NodoB = nodoB;
        this.pNext = null;
    }
}


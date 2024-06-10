/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EDD;

/**
 * La clase ListaAristas gestiona una lista enlazada de aristas.
 * Permite insertar y buscar nodos dentro de la lista, así como verificar si está vacía.
 * 
 * @author Pinto
 */
public class ListaAristas {

    /** La primera arista en la lista enlazada. */
    private AristaC pFirst;
    
    /** La última arista en la lista enlazada. */
    private AristaC pLast;

    /**
     * Constructor que inicializa una nueva lista de aristas vacía.
     */
    public ListaAristas() {
        this.pFirst = null;
        this.pLast = null;
    }

    /**
     * Obtiene la primera arista de la lista.
     * 
     * @return La primera arista en la lista enlazada.
     */
    public AristaC getpFirst() {
        return pFirst;
    }

    /**
     * Establece la primera arista de la lista.
     * 
     * @param pFirst La arista que se establecerá como primera.
     */
    public void setpFirst(AristaC pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * Obtiene la última arista de la lista.
     * 
     * @return La última arista en la lista enlazada.
     */
    public AristaC getpLast() {
        return pLast;
    }

    /**
     * Establece la última arista de la lista.
     * 
     * @param pLast La arista que se establecerá como última.
     */
    public void setpLast(AristaC pLast) {
        this.pLast = pLast;
    }

    /**
     * Comprueba si la lista de aristas está vacía.
     * 
     * @return Verdadero si la lista está vacía, falso en caso contrario.
     */
    public boolean isEmpty() {
        return pFirst == null;
    }

    /**
     * Inserta una nueva arista al final de la lista.
     * 
     * @param nodoA El primer nodo de la nueva arista.
     * @param nodoB El segundo nodo de la nueva arista.
     */
    public void insertar(Nodo nodoA, Nodo nodoB) {
        AristaC nueva_Arista = new AristaC(nodoA, nodoB);
        if (this.isEmpty()) {
            this.setpLast(nueva_Arista);
            this.setpFirst(nueva_Arista);
        } else {
            this.pLast.pNext = nueva_Arista;
            this.setpLast(nueva_Arista);
        }
    }

    /**
     * Busca un nodo específico en la lista de aristas.
     * 
     * @param nodoA El nodo a buscar en la lista.
     * @return Verdadero si el nodo está presente en alguna arista, falso en caso contrario.
     */
    public boolean buscar_nodo(Nodo nodoA) {
        AristaC aux = pFirst;
        while (aux != null && (aux.NodoA != nodoA && aux.NodoB != nodoA)) {
            aux = aux.pNext;
        }
        return aux != null;
    }

    /**
     * Muestra las aristas de la lista en la consola.
     */
    public void mostrar_aristas() {
        AristaC aux = pFirst;
        if (aux != null) {
            System.out.print(aux.NodoA.getCaracter());
            while (aux != null) {
                System.out.print("-" + aux.NodoB.getCaracter());
                aux = aux.pNext;
            }
            System.out.println("");
        }
    }
}


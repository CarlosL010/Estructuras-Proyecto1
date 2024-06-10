/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EDD;

import java.util.HashMap;
import java.util.Map;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.SingleGraph;

/**
 * La clase Grafo representa un grafo de letras, donde cada letra puede estar conectada con otras formando una sopa de letras.
 * Permite realizar búsquedas en profundidad y amplitud para encontrar palabras dentro de la sopa de letras.
 * 
 * @author Pinto
 */
public class Grafo {
/** Número de letras en el grafo. */
    public int nro_letras;
/** Vector de nodos que representan las letras del grafo. */
    public Nodo[] v_letras;

/**
     * Constructor que inicializa un nuevo grafo con un número determinado de letras.
     * 
     * @param nro_letras El número de letras en el grafo.
     * @param caracteres Los caracteres que se utilizarán para inicializar los nodos del grafo.
     */

    public Grafo(int nro_letras, String caracteres) {
        this.nro_letras = nro_letras;
        this.v_letras = new Nodo[nro_letras];
        this.inicializar(caracteres);
    }
    
/**
     * Inicializa los nodos del grafo con los caracteres proporcionados.
     * 
     * @param caracteres Los caracteres para inicializar los nodos del grafo.
     */

    public void inicializar(String caracteres){
        for (int i = 0; i < nro_letras; i++) {
            this.v_letras[i] = new Nodo(String.valueOf(caracteres.charAt(i)));
        }
        this.inicializar_sopa_de_letras();
    }

/**
     * Conecta dos letras en el grafo.
     * 
     * @param i Índice de la primera letra a conectar.
     * @param j Índice de la segunda letra a conectar.
     */

    public void conectar_letras(int i, int j) {
        if (0 <= i && i < this.nro_letras && 0 <= j && j < this.nro_letras) {
            this.v_letras[i].getCaracteres_adyacentes().insertar(this.v_letras[i], this.v_letras[j]);
        }
    }

/**
     * Inicializa las conexiones entre las letras para formar la sopa de letras.
     */

    public void inicializar_sopa_de_letras() {
        for (int x = 0; x < this.nro_letras; x++) {
            switch (x) {
                case 0, 4, 8, 12 -> {
                    this.conectar_letras(x, x + 1);
                    if (x - 4 >= 0) {
                        this.conectar_letras(x, x - 3);
                        this.conectar_letras(x, x - 4);
                    }   if (x + 4 < 16) {
                        this.conectar_letras(x, x + 4);
                        this.conectar_letras(x, x + 5);
                        
                    }
                }
                case 3, 7, 11, 15 -> {
                    this.conectar_letras(x, x - 1);
                    if (x - 4 >= 0) {
                        this.conectar_letras(x, x - 5);
                        this.conectar_letras(x, x - 4);
                    }   if (x + 4 <= 16) {
                        this.conectar_letras(x, x + 3);
                        this.conectar_letras(x, x + 4);
                    }
                }
                default -> {
                    this.conectar_letras(x, x + 1);
                    this.conectar_letras(x, x - 1);
                    if (x - 4 >= 0) {
                        this.conectar_letras(x, x - 5);
                        this.conectar_letras(x, x - 4);
                        this.conectar_letras(x, x - 3);
                    }   if (x + 4 <= 16) {
                        this.conectar_letras(x, x + 3);
                        this.conectar_letras(x, x + 4);
                        this.conectar_letras(x, x + 5);
                    }
                }
            }
        }

    }

/**
     * Imprime las aristas de cada letra en el grafo.
     */

    public void imprimir() {
        for (int i = 0; i < 16; i++) {
            this.v_letras[i].getCaracteres_adyacentes().mostrar_aristas();
        }
    }

/**
     * Realiza una búsqueda en profundidad para encontrar una palabra en el grafo.
     * 
     * @param indice_vertice Índice del vértice actual.
     * @param letras_visitadas Array que indica si una letra ha sido visitada.
     * @param palabra La palabra que se busca en el grafo.
     * @param nro_letras_visitadas Número de letras visitadas hasta el momento.
     * @return Verdadero si se encuentra la palabra, falso en caso contrario.
     */
 
    private boolean DepthFirstSearch(int indice_vertice, boolean[] letras_visitadas, String palabra, int nro_letras_visitadas) {
        letras_visitadas[indice_vertice] = true;
        boolean encontrado = false;
        if (nro_letras_visitadas != palabra.length()) {
            for (int i = 0; i < this.nro_letras; i++) {
                if ((indice_vertice != i) && (!letras_visitadas[i]) && this.v_letras[indice_vertice].getCaracteres_adyacentes().buscar_nodo(this.v_letras[i]) && (this.v_letras[i].getCaracter().equals(String.valueOf(palabra.charAt(nro_letras_visitadas))))) {
                    int nro_actual = nro_letras_visitadas + 1;
                    encontrado = DepthFirstSearch(i, letras_visitadas, palabra, nro_actual);
                    if (encontrado) {
                        return encontrado;
                    }
                }
            }
            return encontrado;
        } else {
            return true;
        }
    }

/**
     * Realiza una búsqueda en profundidad para encontrar una palabra en el grafo.
     * 
     * @param palabra La palabra que se busca en el grafo.
     * @return Verdadero si se encuentra la palabra, falso en caso contrario.
     */

    public boolean profundidad(String palabra) {
        boolean visitados[] = new boolean[this.nro_letras];
        boolean encontrado = false;
        for (int i = 0; i < this.nro_letras; i++) {  
            visitados[i] = false;
        }
        for (int i = 0; i < this.nro_letras; i++) {    
            if (!visitados[i] && this.v_letras[i].getCaracter().equals(String.valueOf(palabra.charAt(0)))) {    
                visitados[i] = true;
                encontrado = DepthFirstSearch(i, visitados, palabra, 1);
                if (encontrado) {
                    return encontrado;
                }
            }
        }
        return encontrado;
    }

/**
     * Realiza una búsqueda en amplitud para encontrar una palabra en el grafo.
     * 
     * @param palabra La palabra que se busca en el grafo.
     * @return Verdadero si se encuentra la palabra, falso en caso contrario.
     */

    public boolean amplitud(String palabra) {
        Cola cola = new Cola();
        boolean visitados[] = new boolean[this.nro_letras];
        Nodo vertice_aux = null; 
        for (int i = 0; i < this.nro_letras; i++) {
            visitados[i] = false;
        }
        for (int i = 0; i < this.nro_letras; i++) {
            if (!visitados[i] && this.v_letras[i].getCaracter().equals(String.valueOf(palabra.charAt(0)))) {
                cola.encolar(this.v_letras[i]);
                visitados[i] = true;
                int pos = 1;
                while (!cola.isEmpty()) {
                    String p = palabra.substring(pos);
                    vertice_aux = cola.desencolar(); 
                    if (p.length() == 0) {
                        return true;
                    }
                    for (int j = 0; j < this.nro_letras; j++) {
                        if (vertice_aux.getCaracteres_adyacentes().buscar_nodo(this.v_letras[j]) && (!visitados[j]) && this.v_letras[j].getCaracter().equals(String.valueOf(palabra.charAt(pos)))) {
                            cola.encolar(this.v_letras[j]);
                            visitados[j] = true;
                        }
                    }
                    pos++;
                }
            }
        }
        return false;

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol;

/**
 *
 * @author WILY
 */
import java.util.*;
import java.io.*;

public class Arbol<T> {

    private Nodo<T> elementoraiz;

    /**
     * cnstructor de default
     *
     */
    public Arbol() {
        super();

    }

    /**
     * regresa el elemento que sea la rai de el abol
     *
     */
    public Nodo<T> getElementoRaiz() {
        return this.elementoraiz;

    }

    /**
     * establece el elemento raiz de el arbol
     *
     */
    public void setElementoRaiz(Nodo<T> elementoraiz) {
        this.elementoraiz = elementoraiz;

    }

    /**
     * regresa el arbol como una lista del Nodo
     *
     *
     */
    public List<Nodo<T>> pasarlist() {
        List<Nodo<T>> lista = new ArrayList<Nodo<T>>();
        Caminar(elementoraiz, lista);
        return lista;

    }

    /**
     * metodo recursivo llamado del metodo pasaList con los
     * con los elementos de la raiz. 
     * camina / recorre el arbol en peorden ,
     *
     */
    public void Caminar(Nodo<T> elemento, List<Nodo<T>> lista) {
        lista.add(elemento);
        for (Nodo<T> dato : elemento.getHijos()) {
            Caminar(dato, lista);
        }
    }

    /**
     * regresa una representacion del arbol
     *
     */
    public String toString() {
        return pasarlist().toString();
    }

}

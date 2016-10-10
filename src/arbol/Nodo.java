/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbol;

/**
 * @author WILY
 */
import java.util.*;
import java.io.*;

public class Nodo<T> {

    public T dato;
    public List<Nodo<T>> hijos;

    /**
     * constructor de default
     */
    public Nodo() {
        super();

    }

    /**
     * crea un nodo con la instancia de T
     */
    public Nodo(T dato) {
        this();
        setDato(dato);

    }

    /**
     * regresa a los hios del nodo.
     */
    public List<Nodo<T>> getHijos() {
        if (this.hijos == null) {
            return new ArrayList<Nodo<T>>();

        }
        return this.hijos;
    }

    /**
     * establece los hijos del Nodo <T>.
     */
    public void setHijos() {
        this.hijos = hijos;

    }

    /**
     * regresa el numero de los hijos de este nodo
     */
    public int getNumHijos() {
        if (hijos == null) {
            return 0;

        }
        return hijos.size();

    }

    /**
     *
     */
    public T getDato() {
        return this.dato;

    }

    public void setDato(T dato) {
        this.dato = dato;

    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoExamenEd2Arboles_3_p3;

/**
 *
 * @author pumar
 */
public class Nodo {
    public Nodo izq;
    public Nodo der;
    public int elem1;
    public int elem2;

    public Nodo(int elem1,int elem2) {
        izq = der = null;
        this.elem1 = elem1;
        this.elem2 = elem2;
    }
    
}

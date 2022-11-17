/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GRAFO;

import java.util.ArrayList;

/**
 *
 * @author Gus_m
 */
public class Grafo <E, P>{




private static final int INFINITO = 0;
	private E [] nodos;
	private P[][] arcos;
	private int limite;
	private int i;

	
	
	public Grafo(int limite) {
		this.limite=limite;
		this.i=0;
		this.nodos= (E[])new Object[limite];
		this.arcos=(P[][])new Object[limite][limite];
	}
	
	private boolean isFull() {
		return i==limite;
	}
    //Creando un nodo
	public void addNodo(E item) {
            if(!isFull())
                this.nodos[i]=item;
            i++;
            
            
        }
		
	//Como tal este es el dijkstra
	public ArrayList <String> addArco(E origen,E destino,P peso) {
		ArrayList<String> camino= new ArrayList<String>();
		  int distancia=Grafo.INFINITO;
		  E nodos=origen;
		  boolean fin=true;
		  camino.add((String) nodos);
		  while(fin);
		return camino; 
            
	
		
	}



}
	
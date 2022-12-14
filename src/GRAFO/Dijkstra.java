/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GRAFO;

import java.util.Scanner;

/**
 *
 * @author Gus_m
 */
public class Dijkstra {
    
     public int distance[] = new int[10];
    public int cost[][] = new int[10][10];

    public void calc(int n, int s) {
        int flag[] = new int[n + 1];
        int i, minpos = 1, k, c, minimum;

        for (i = 1; i <= n; i++) {
            flag[i] = 0;
            this.distance[i] = this.cost[s][i];
        }
        c = 2;
        while (c <= n) {
            minimum = 99;
            for (k = 1; k <= n; k++) {
                if (this.distance[k] < minimum && flag[k] != 1) {
                    minimum = this.distance[i];
                    minpos = k;
                }
            }
            flag[minpos] = 1;
            c++;
            for (k = 1; k <= n; k++) {
                if (this.distance[minpos] + this.cost[minpos][k] < this.distance[k] && flag[k] != 1) {
                    this.distance[k] = this.distance[minpos] + this.cost[minpos][k];
                }
            }
        }
    }

    public static void main(String[] args) {

        int nodes, source, i, j;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese el número de nodos\n");
        nodes = in.nextInt();
        Dijkstra d = new Dijkstra();
        System.out.println("Ingrese los pesos de la matriz de costos: \n");
        for (i = 1; i <= nodes; i++) {
            for (j = 1; j <= nodes; j++) {
                d.cost[i][j] = in.nextInt();
                if (d.cost[i][j] == 0) {
                    d.cost[i][j] = 999;
                }
            }
        }
        System.out.println("Introduzca el vértice de origen:\n");
        source = in.nextInt();

        d.calc(nodes, source);
        System.out.println("El camino más corto desde la fuente \t" + source + "\t a todos los demás vértices son: \n");
        for (i = 1; i <= nodes; i++) {
            if (i != source) {
                System.out.println("fuente :" + source + "\t destino :" + i + "\t El costo mínimo es:" + d.distance[i] + "\t");
            }
        }

    }
}
    


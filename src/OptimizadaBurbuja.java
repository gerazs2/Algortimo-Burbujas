/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gerardo
 */
public class OptimizadaBurbuja {
    public int n;
    public double tiempo_i;
    public double tiempo_f;
    public double tiempo_t;
    public int []numeros =new int[n];
    public int cambios=0;
    
     public void llenar_Arreglo(){
            for (int x=0;x<numeros.length;x++)
      numeros[x] = (int) (Math.random()*20)+1;
        }

    public OptimizadaBurbuja(int n,int numeros[]) {
    this.n=n;
    this.numeros=numeros;
    }
     
     
    public void ordenar(){//burbuja optimizada
            
            int aux;
           this.tiempo_i=System.currentTimeMillis();
            for (int i = 0; i < numeros.length; i++) {
                for (int j = 0; j <i; j++) {
                    if (numeros[i]<numeros[j]) {
                        aux=numeros[j];
                        numeros[j]=numeros[i];
                        numeros[i]=aux; 
                        cambios=cambios+1;
                    }
 
                }
            this.tiempo_f=System.currentTimeMillis();
            }
            this.tiempo_t=tiempo_f-tiempo_i;
            
        }

    public double getTiempo_t() {
        return tiempo_t;
    }

public static void main (String args[]){


System.out.println();
}
    
}

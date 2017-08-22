/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gerardo
 */
public class Burbuja {
         
    public int n;
    public int []numeros =new int[n];
    public int contador=0;
    public double tiempo_i;
    public double tiempo_f;
    public double tiempo_t;

    public Burbuja(int n,int num[]) {
        this.n=n;
        this.numeros=num;
    }
    
    
    public void generar_Arreglo(){
    
        for (int x=0;x<numeros.length;x++)
  numeros[x] = (int) (Math.random()*20)+1;
        
    }
    
         public void imprimir_arreglo(){
            for (int i = 0; i <numeros.length; i++) {
                  System.out.println(numeros[i]);
            }
          
        }
    public double ordenar(){//burbuja normal
            int aux;
            boolean cambios=false;
            this.tiempo_i=System.currentTimeMillis();
            while(true){
                cambios=false;
                for (int i = 1; i<numeros.length; i++) {
                    if (numeros[i]<numeros[i-1]) {
                        aux=numeros[i];
                        numeros[i]=numeros[i-1];
                        numeros[i-1]=aux;
                        cambios=true;
                        contador=contador+1;
                    }
                }
                if(cambios==false)
                    break;
                this.tiempo_f=System.currentTimeMillis();
            }
       this.tiempo_t= tiempo_f - tiempo_i;
       return tiempo_t;
        }
    
    public static void main(String args[]){
      
        System.out.println("");
        
        
    }

    public double getTiempo_t() {
        return tiempo_t;
    }

}



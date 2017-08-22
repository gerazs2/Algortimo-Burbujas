 import org.jfree.chart.ChartFactory; 
 import org.jfree.chart.ChartFrame; 
 import org.jfree.chart.JFreeChart; 
 import org.jfree.chart.plot.PlotOrientation; 
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

public class Graficar {

    public static void main(String[] args) {

        XYSeries series = new XYSeries("Algortimo A");
        XYSeries series2 = new XYSeries("Algortimo B");

        // Introduccion de datos
      int n = 5000;
      int numeros[]=new int[n];
          for (int x=0;x<numeros.length;x++){
      numeros[x] = (int) (Math.random()*20)+1;
          }
     int numeros2[] = numeros.clone();
          OptimizadaBurbuja ob= new OptimizadaBurbuja(n, numeros2);
          Burbuja b = new Burbuja(n,numeros);
            
          b.ordenar();
          ob.ordenar();
          double tiempo=b.getTiempo_t();
          double tiempo2=ob.getTiempo_t();
        for (int x = 0; x < 10; x++) {
            
            series.add(x, tiempo);
            series.add(x,tiempo2);
       
        }
   
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);
        dataset.addSeries(series2);

        JFreeChart chart = ChartFactory.createXYLineChart(
                "Algortimos", // Título
                "Tiempo (x)", // Etiqueta Coordenada X
                "", // Etiqueta Coordenada Y
                dataset, // Datos
                PlotOrientation.VERTICAL,
                true, // Muestra la leyenda de los productos (Producto A)
                false,
                false
        );

        // Mostramos la grafica en pantalla
        ChartFrame frame = new ChartFrame("Ejemplo Grafica Lineal", chart);
        frame.pack();
        frame.setVisible(true);

    }

}
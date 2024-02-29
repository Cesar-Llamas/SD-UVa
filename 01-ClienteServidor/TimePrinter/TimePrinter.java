/*
 * TimePrinter Imprime la hora cada segundo.
 */
package ejemplo.timeprinter;

public class TimePrinter implements Runnable {
   public void run() {
      while (true) {
         System.out.println(new java.util.Date());
	 try {
	    Thread.sleep(1000);
	 } catch (InterruptedException x) {
	    System.out.println("Fin del reloj");
	 }
      }
   }
}

/*
 * TimePrinter2 Imprime la hora cada segundo.
 */
package ejemplo.timeprinter;

public class TimePrinter2 implements Runnable {
   private Integer entero;

   public TimePrinter2(Integer i) {
      entero = i;
   }

   public void run() {
      while (true) {
         System.out.println(entero + ": " +new java.util.Date());
	 try {
	    Thread.sleep(1000);
	 } catch (InterruptedException x) {
	    System.out.println("Fin del reloj");
	 }
      }
   }
}

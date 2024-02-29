/* Lanzador de TimePrinter */
package ejemplo;

public class Launcher {
   public static void main(String [] args) {
      final Runnable tarea     = new ejemplo.timeprinter.TimePrinter2();
      final Runnable otraTarea = new ejemplo.timeprinter.TimePrinter2();

      Integer variable = new Integer(4);

      Thread hiloNuevo     = new Thread(tarea,     "Hilo de TimePrinter");
      Thread otroHiloNuevo = new Thread(otraTarea, "Otro hilo de TimePrinter");
      hiloNuevo.start();
      otroHiloNuevo.start();
      while (true) {
       try {
         Thread.sleep(1000);
	 variable. // incrementar el contenido de la variable
	 // si es un singleton y es inmutable, hay que crear un contenedor.
	 // y corregir TimePrinter 2.
       } catch (Exception e) {}
      }
      // resto del programa.
   }
}

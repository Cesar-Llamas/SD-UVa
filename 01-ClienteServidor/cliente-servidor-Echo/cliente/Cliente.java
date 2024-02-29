package ejemplo.socket;

public class Cliente {
  public static final int PUERTO_SERVIDOR = 2000;
  public static final String NOMBRE_SERVIDOR = "localhost";

  public static void main(String[] args) {
    String linea = null;

    try {
      java.io.BufferedReader teclado = new java.io.BufferedReader(
                  new java.io.InputStreamReader(System.in));

      java.net.Socket miSocket =
                  new java.net.Socket(NOMBRE_SERVIDOR, PUERTO_SERVIDOR);

      java.io.BufferedReader inred = new java.io.BufferedReader(
             new java.io.InputStreamReader(
                     miSocket.getInputStream()));
      java.io.PrintStream outred = new java.io.PrintStream(
                     miSocket.getOutputStream());

      while ((linea = teclado.readLine()) != null) {
        outred.println(linea);    // envia al servidor
        linea = inred.readLine(); // lee del servidor
        System.out.println("Recibido: "+linea); // eco local del servidor
      } // fin while
    } catch (Exception e) { e.printStackTrace(); }
  } // fin main
}

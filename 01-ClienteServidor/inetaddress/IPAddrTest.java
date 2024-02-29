package ejemplo;

import java.io.*;
import java.net.*;

public class IPAddrTest {
  public static void main(final String[ ] args) {
    try {
      InetAddress ip=InetAddress.getByName("localhost");
      System.out.println("IpAddress: " + ip.toString());
      String name = ip.getHostName(); 
      System.out.println("Host Nombre: " + name);
      name = ip.getCanonicalHostName(); 
      System.out.println("Host Nombre completo: " + name);
    } catch (Exception e) {}
  }
}

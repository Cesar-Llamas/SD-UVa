<!-- README.TXT formato Markdown -->

# Código fuente contenido en la Lección 2

* Asignatura: Sistemas Distribuidos.
* Titulación: Grado en Ingeniería Informática
* Universidad de Valladolid.
* Escuela de Ingeniería Informática de Valladolid (EIInformática-Valladolid).
* Puedes utilizar libremente este código fuente Java para crear el tuyo propio citando esta fuente original siempre que lo utilices fuera del contexto de esta asignatura en el Grado de Ingeniería Informática, de la EIInformática-Valladolid.
* (C) César Llamas Bello, 2000-2023.

Este documento describe los archivos contenidos en este archivador y el código Java es tal cual, sin más garantías de funcionamiento. Salvo pequeñas variaciones de nombres de clases idéntico al contenido en el archivo PDF que describe la Lección 2 y contiene:

* Archivos comunes al cliente y servidor:
  ```
  ./MalMensajeProtocoloException.java
  ./MensajeProtocolo.java
  ./MensajeProtocoloTest.java
  ./Primitiva.java
  ```

* Archivos exclusivos del cliente en el folder `cliente`:
  ```
  ./cliente/cliente.sh
  ./cliente/ClienteLargo.java
  ./cliente/Hello.java
  ./cliente/PullNoWait.java
  ./cliente/PullWait.java
  ./cliente/Push.java
  ```

* Archivos exclusivos del servidor en el folder `servidor`:
  ```
  ./servidor/MultiMap.java
  ./servidor/MultiMapTest.java
  ./servidor/Servidor.java
  ./servidor/Sirviente.java
  ```

## **Importante**

Recuerda que tus proyectos o tus folders deben reflejar un sistema cliente-servidor separados. Ten en cuenta que hay clases que son comunes a los dos, y también clases que son exclusivas de cada lado.

Ten un cuidado especial en preservar los nombres de los paquetes para que coincidan con el enunciado y los de tus compañeros y así evitar inconsistencias en los espacios de nombres.
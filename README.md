# Produzione Bicchieri – Esercitazione Thread Java

  

## Descrizione del progetto

Questo progetto simula un semplice **processo industriale di produzione di bicchieri**

utilizzando i **thread in Java**.

Ogni fase della lavorazione è rappresentata da un thread separato, e il programma principale

coordina le varie fasi tramite i metodi `sleep()` e `join()`.

  

---

  

## Struttura del progetto

- **Stampaggio.java** → rappresenta la prima fase (stampaggio del bicchiere).

- **Rifinitura.java** → rappresenta la seconda fase (rifinitura e controllo qualità).

- **ProduzioneBicchieri.java** → classe principale che coordina i thread.

  

---

  

## Funzionamento

1. Il programma avvia la produzione con `ProduzioneBicchieri`.

2. Viene eseguito il thread di `Stampaggio`.

3. Dopo la conclusione del primo thread, parte il thread `Rifinitura`.

4. Ogni thread usa `Thread.sleep()` per simulare tempi di lavorazione.

5. Il main utilizza `join()` per sincronizzare le fasi.

  

---

  

##  Tecnologie utilizzate

- Linguaggio: **Java**

- IDE: **IntelliJ IDEA**

- Strumenti aggiuntivi:

- **Visual Paradigm Online** → per creare il diagramma UML

- **JavaDoc** → per generare la documentazione automatica

  

---

  

##  Contact

Created by Renzetti Lorenzetti Elisa

contact renzettielisa3@gmail.com

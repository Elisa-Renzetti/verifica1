/**
 * Classe che rappresenta la fase di rifinitura dei bicchieri.
 * @author Renzetti Elisa

 */
public class Rifinitura extends Thread {

    /**
     * Metodo che simula la fase di rifinitura dei bicchieri.
     *
     * <p>Include una pausa temporale con sleep() per rappresentare
     * il tempo necessario alla lavorazione.</p>
     *
     */
    @Override
    public void run() {
        System.out.println("Inizio rifinitura bicchieri...");
        try {
            Thread.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Fine rifinitura bicchieri.");
    }
}


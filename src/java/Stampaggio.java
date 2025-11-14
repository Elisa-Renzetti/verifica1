/**
 * Classe che rappresenta la fase di stampaggio dei bicchieri.
 *
 * <p>Questa classe estende Thread e sovrascrive il metodo {@link #run()}
 * per simulare la fase di stampaggio con un ritardo temporale. È la prima fase
 * del processo di produzione dei bicchieri.</p>
 *
 * @author Renzetti Elisa
 * @version 1.0
 *
 */
public class Stampaggio extends Thread {

    /**
     * Metodo che simula il lavoro di stampaggio dei bicchieri.
     *
     * <p>Stampa a video i messaggi di inizio e fine lavorazione e utilizza
     * il metodo sleep per simulare il tempo di produzione.</p>
     *
     *
     */
    @Override
    public void run() {
        System.out.println("Inizio stampaggio bicchieri...");
        try {
            Thread.sleep(1000); // simula il tempo di lavorazione
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Fine stampaggio bicchieri.");
    }
}

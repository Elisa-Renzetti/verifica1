
/**
 * Classe principale che gestisce l’intero processo di produzione dei bicchieri.
 * @author Renzetti Elisa
 * @version 1.0
 */
public class ProduzioneBicchieri {

    /**
     * Metodo principale che avvia il processo di produzione dei bicchieri.
     *
     * <p>In questa fase vengono create e gestite le istanze dei thread
     * @see Thread#sleep(long)
     * @see Thread#join()
     */
    public static void main(String[] args) {
        System.out.println("== AVVIO PRODUZIONE BICCHIERI ==");

        // Creazione dei due thread per le fasi produttive
        Stampaggio fase1 = new Stampaggio();
        Rifinitura fase2 = new Rifinitura();

        // Avvio del primo thread (stampaggio)
        fase1.start();
        try {
            fase1.join(); // attende che finisca lo stampaggio
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Avvio del secondo thread (rifinitura)
        fase2.start();
        try {
            fase2.join(); // attende la conclusione della rifinitura
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("== PRODUZIONE COMPLETATA ==");
    }
}

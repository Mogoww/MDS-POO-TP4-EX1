import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Journalisation {

    //-------------------------------- ATTRIBUTS --------------------------------
    private static Journalisation uniqueInstance;
    private String log;

    //-------------------------------- CONSTRUCTEUR --------------------------------
    private Journalisation() {
        this.log = new String();
    }

    //-------------------------------- METHODES --------------------------------

    // Retourne l'instance unique de la classe
    public synchronized static Journalisation getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Journalisation();
        }
        return uniqueInstance;
    }

    // ajoute un message au journal
    public void ajouterLog(String message) {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yy HH'h'mm");
        this.log+="["+dateFormat.format(date)+"] "+message+"\n";
    }

    // affiche tout le journal
    public String afficherLog() {
        return this.log;
    }



}

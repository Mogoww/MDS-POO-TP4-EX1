import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class Journalisation {

    //-------------------------------- ATTRIBUTS --------------------------------
    private static HashMap instances = new HashMap();
    private String log;

    //-------------------------------- CONSTRUCTEUR --------------------------------
    private Journalisation() {
        this.log = new String();
    }

    //-------------------------------- METHODES --------------------------------

    // Retourne l'instance unique de la classe
    public static synchronized Journalisation getInstance(String clef)
    {
        Journalisation inst = (Journalisation) instances.get(clef);
        if (inst == null)
        {
            inst = new Journalisation();
            instances.put(clef, inst);
        }
        return inst;
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

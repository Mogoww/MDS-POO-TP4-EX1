public class CompteBancaire {
    //--------------------------------------------------------------------------------Atributs
    private int numero;
    private double solde;

    //--------------------------------------------------------------------------------Constructeur
    public CompteBancaire(int numero) {
        this.numero = numero;
        this.solde = 0.0;
    }

    //--------------------------------------------------------------------------------Méthodes
    // depose un montant sur le compte
    public void deposer(double montant) {
        if(montant > 0.0) {
            this.solde += montant;
            Journalisation.getInstance().ajouterLog("Dépôt de " + montant + " sur le compte " + this.numero);
        }else {
            Journalisation.getInstance().ajouterLog("Tentative de dépôt de " + montant + " sur le compte " + this.numero);
        }
    }

    // retire un montant sur le compte
    public void retirer(double montant) {
        if(montant > 0.0 && montant <= this.solde) {
            this.solde -= montant;
            Journalisation.getInstance().ajouterLog("Retrait de " + montant + " sur le compte " + this.numero);
        }else {
            Journalisation.getInstance().ajouterLog("Tentative de retrait de " + montant + " sur le compte " + this.numero);
        }
    }

}

public class Main {
    public static void main(String[] args) {

        // test class
        CompteBancaire compte = new CompteBancaire(1);
        compte.deposer(100);    // Dépôt de 100.0 sur le compte 1
        compte.retirer(50);     // Retrait de 50.0 sur le compte 1
        compte.retirer(100);    // Tentative de retrait de 100.0 sur le compte 1
        compte.deposer(-100);   // Tentative de dépôt de -100.0 sur le compte 1
        System.out.println(Journalisation.getInstance("info").afficherLog());
        System.out.println(Journalisation.getInstance("erreur").afficherLog());

    }
}
package inf3055.concepts;

public class Voiture{
    protected String nom;
    protected int puissance;
    protected boolean estDemarre;
    protected  double vitesse;

    public  Voiture(String nom, int puissance, boolean estDemarre, double vitesse) {
        this.nom =nom;
        this.puissance = puissance;
        this.estDemarre = estDemarre;
        this.vitesse = vitesse;
    }
    public void afficher() {
        System.out.println("Nom: "+ nom);
        System.out.println("Puissance :" +puissance);
        System.out.println("Demarree : " +estDemarre);
        System.out.println("Vitesse : " + vitesse);

    }
}

public class VoitureELectrique extends Voiture {
    private String typechargeur;
    public VoitureELectrique(String nom, int puissance, boolean estDemarre, double vitesse, String typeChargeur){
        super(nom, puissance, estDemarre, vitesse);
        this.typechargeur = typeChargeur
    }

    @Override
    public void afficher() {
        super.afficher();
        System.out.println("Type de chargeur :" + typechargeur);
    }
}

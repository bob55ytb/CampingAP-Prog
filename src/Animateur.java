public class Animateur {

    private String nomAnimateur;
    private String prenomAnimateur;
    private String gmailAnimateur;
    private int codePostalAnimateur;
    private String rueAnimateur;
    private String villeAnimateur;
    private int telephoneAnimateur;

    public Animateur(String nomAnimateur, String prenomAnimateur, String gmailAnimateur, int codePostalAnimateur, String rueAnimateur, String villeAnimateur, int telephoneAnimateur){

        this.codePostalAnimateur = codePostalAnimateur;
        this.nomAnimateur = nomAnimateur;
        this.prenomAnimateur = prenomAnimateur;
        this.gmailAnimateur = gmailAnimateur;
        this.rueAnimateur = rueAnimateur;
        this.villeAnimateur =villeAnimateur;
        this.telephoneAnimateur = telephoneAnimateur;

    }

    public String getPrenomAnimateur() {
        return prenomAnimateur;
    }

    public String getGmailAnimateur() {
        return gmailAnimateur;
    }

    public int getCodePostalAnimateur() {
        return codePostalAnimateur;
    }

    public String getRueAnimateur() {
        return rueAnimateur;
    }

    public String getVilleAnimateur() {
        return villeAnimateur;
    }

    public int getTelephoneAnimateur() {
        return telephoneAnimateur;
    }

    public String getNomAnimateur() {
        return nomAnimateur;
    }

    public void setNomAnimateur(String nomAnimateur) {
        nomAnimateur = nomAnimateur;
    }

    public void setPrenomAnimateur(String prenomAnimateur) {
        prenomAnimateur = prenomAnimateur;
    }

    public void setGmailAnimateur(String gmailAnimateur) {
        gmailAnimateur = gmailAnimateur;
    }

    public void setCodePostalAnimateur(int codePostalAnimateur) {
        codePostalAnimateur = codePostalAnimateur;
    }

    public void setRueAnimateur(String rueAnimateur) {
        rueAnimateur = rueAnimateur;
    }

    public void setVilleAnimateur(String villeAnimateur) {
        villeAnimateur = villeAnimateur;
    }

    public void setTelephoneAnimateur(int telephoneAnimateur) {
        telephoneAnimateur = telephoneAnimateur;
    }
}

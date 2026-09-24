import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

public class Animation {


    private String nomAnimation;
    private LocalDate dateAnimation;
    private LocalTime debutHeureAnimation;
    private LocalTime finHeureAnimation;
    // Déclaration de la liste
    private ArrayList<Animateur> lesAnimateurs;

    public Animation(String nomAnimation, LocalDate dateAnimation, LocalTime debutHeureAnimation, LocalTime finHeureAnimation){
        this.dateAnimation = dateAnimation;
        this.nomAnimation = nomAnimation;
        this.debutHeureAnimation = debutHeureAnimation;
        this.finHeureAnimation = finHeureAnimation;

        // On crée la liste, elle est actuellement vide
        this.lesAnimateurs = new ArrayList<>();
    }

    public String getNomAnimation() {
        return nomAnimation;
    }

    public ArrayList<Animateur> getLesAnimateurs() {
        return lesAnimateurs;
    }

    public LocalTime getFinHeureAnimation() {
        return finHeureAnimation;
    }

    public LocalDate getDateAnimation() {
        return dateAnimation;
    }

    public LocalTime getDebutHeureAnimation() {
        return debutHeureAnimation;
    }

    public void setNomAnimation(String nomAnimation) {
        this.nomAnimation = nomAnimation;
    }

    public void setDateAnimation(LocalDate dateAnimation) {
        this.dateAnimation = dateAnimation;
    }

    public void setDebutHeureAnimation(LocalTime debutHeureAnimation) {
        this.debutHeureAnimation = debutHeureAnimation;
    }

    public void setFinHeureAnimation(LocalTime finHeureAnimation) {
        this.finHeureAnimation = finHeureAnimation;
    }

    public void setLesAnimateurs(ArrayList<Animateur> lesAnimateurs) {
        this.lesAnimateurs = lesAnimateurs;
    }
}

import java.util.Scanner;

public class Compte {
    private final Scanner sc = new Scanner(System.in);
    int id;
    String user;
    String password;
    int perm;

    public Compte(int id, String user , String password, int perm){
        this.id         = id;
        this.user       = user;
        this.password   = password;
        this.perm       = perm;
    }

    public void Connect(String user , String password){
        System.out.println("Veuillez vous identifier...");
        String pseudo = sc.next("Pseudo :");


    }

}

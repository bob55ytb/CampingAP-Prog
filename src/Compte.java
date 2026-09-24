import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Compte {
    private static final DBase dbase = new DBase();
    private static final Scanner sc = new Scanner(System.in);
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

    public static void Connect(String user , String password) throws SQLException {

        String sql = "SELECT `password_compte` FROM `Compte` WHERE `user_compte` = ?;";

        System.out.println("Veuillez vous identifier...");
        System.out.println("Pseudo : ");
        String pseudo = sc.next();
        System.out.println("Mot de passe : ");
        String pswd = sc.nextLine();

        try (Connection connexion = dbase.getConnexion()){
            PreparedStatement preparedStatement = connexion.prepareStatement(sql);

            preparedStatement.setString(1, pseudo);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    String mdp = resultSet.getString("password_compte");
                    System.out.println("Utilisateur trouvé");
                } else {
                    System.out.println("Aucun utilisateur");
                }
            }
        }
    }
}


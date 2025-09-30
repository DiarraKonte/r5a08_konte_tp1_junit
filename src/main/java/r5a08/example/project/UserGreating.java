package r5a08.example.project;

public class UserGreating {

    public static String formatGreeting(String nom) {
        if (nom == null) {
            throw new UserGreatingFailureException("Le nom ne peut pas être null");
        }
        if (nom.isEmpty()) {
            throw new UserGreatingFailureException("Le nom ne peut pas être vide");
        }
        if (nom.length() > 10) {
            throw new UserGreatingFailureException("Le nom ne doit pas dépasser 10 caractères");
        }
        if (!nom.matches("^[a-zA-Z0-9]+$")) {
            throw new UserGreatingFailureException("Le nom ne doit pas contenir d'espaces ou de caractères spéciaux");
        }

        return "Bonjour, " + nom;
    }
}

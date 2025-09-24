package r5a08.example.project;

public class UserGreating {

    public String formatGreeting(String nom) throws IllegalAccessException {
        if (nom == null){
            throw new IllegalAccessException("Le nom ne peut pas etre null");
        }
        return "Bonjour, " + nom;
    }
}

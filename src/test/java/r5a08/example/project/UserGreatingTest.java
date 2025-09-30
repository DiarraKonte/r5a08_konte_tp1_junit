package r5a08.example.project;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UserGreatingTest {

    @Test
    void test_FormatGreeting_success() {
        String resultat = UserGreating.formatGreeting("Diarra");
        assertEquals("Bonjour, Diarra", resultat);
    }

    @Test
    void test_with_name_null() {
        Exception exception = assertThrows(UserGreatingFailureException.class, () -> {
            UserGreating.formatGreeting(null);
        });
        assertEquals("Le nom ne peut pas être null", exception.getMessage());
    }

    @Test
    void test_with_empty_name() {
        Exception exception = assertThrows(UserGreatingFailureException.class, () -> {
            UserGreating.formatGreeting("");
        });
        assertEquals("Le nom ne peut pas être vide", exception.getMessage());
    }

    @Test
    void test_name_too_long() {
        Exception exception = assertThrows(UserGreatingFailureException.class, () -> {
            UserGreating.formatGreeting("DiarraKonteBUT3");
        });
        assertEquals("Le nom ne doit pas dépasser 10 caractères", exception.getMessage());
    }

    @Test
    void test_with_special_character() {
        Exception exception = assertThrows(UserGreatingFailureException.class, () -> {
            UserGreating.formatGreeting("Diarra-Konte");
        });
        assertEquals("Le nom ne doit pas contenir d'espaces ou de caractères spéciaux", exception.getMessage());
    }

    @Test
    void test_name_with_space() {
        Exception exception = assertThrows(UserGreatingFailureException.class, () -> {
            UserGreating.formatGreeting("Diarra Konte");
        });
        assertEquals("Le nom ne doit pas contenir d'espaces ou de caractères spéciaux", exception.getMessage());
    }
}


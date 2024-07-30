package src.main.java.com.java.trips.tricks.and.techniques.java9.privateMethodeInterface;

import org.junit.Assert;
import org.junit.Test;
import src.main.java.com.java.trips.tricks.and.techniques.java9.privateMethodeInterface.util.CalculatriceUtils;

import static org.junit.Assert.assertEquals;

public class CalculatriceTest {

    Calculatrice calculatrice = new Calculatrice() {

    };

    @Test
    public void testAddition() {
        assertEquals(5, calculatrice.addition(2, 3));
        assertEquals(0, calculatrice.addition(-1, 1));
        assertEquals(-4, calculatrice.addition(-2, -2));
    }

    @Test
    public void testSoustraction() {
        assertEquals(1, calculatrice.subtraction(3, 2));
        assertEquals(-2, calculatrice.subtraction(-1, 1));
        assertEquals(0, calculatrice.subtraction(-2, -2));
    }

    @Test
    public void testMultiplication() {
        assertEquals(6, calculatrice.multiplication(2, 3));
        assertEquals(-1, calculatrice.multiplication(-1, 1));
        assertEquals(4, calculatrice.multiplication(-2, -2));
    }

    //ou avec l'utilisation de la classe utilitaire pour tester la méthode private
    @Test
    public void testOperationCommune() {
        assertEquals(5, CalculatriceUtils.operationCommune(2, 3));
        assertEquals(0, CalculatriceUtils.operationCommune(-1, 1));
        assertEquals(-4, CalculatriceUtils.operationCommune(-2, -2));
    }
}

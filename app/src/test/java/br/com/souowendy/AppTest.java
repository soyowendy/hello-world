package br.com.souowendy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 * @author souowendy
 */
class AppTest {
    @Test void appHasAGreeting() {
        App app = new App();
        Assertions.assertNotNull(app.getGreeting(), "app should have a greeting");
    }
}

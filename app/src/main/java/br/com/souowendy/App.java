package br.com.souowendy;

/**
 * @author souowendy
 */
public class App {
  /**
   * @return The string "Hello World!"
   */
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}

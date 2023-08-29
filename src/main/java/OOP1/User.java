package OOP1;

public class User {
    private final String login;
    private String pass;
    private final Basket basket;

    public User(String login, String pass, Basket basket) {
        this.login = login;
        this.pass = pass;
        this.basket = basket;
    }
}

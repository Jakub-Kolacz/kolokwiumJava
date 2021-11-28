package pl.jakubkolacz;

public class Client {
    private final String pesel;
    private final Basket basket;

    public Client(String pesel, Basket basket) {
        this.pesel = pesel;
        this.basket = basket;
    }

    public String getPesel() {
        return pesel;
    }

    public Basket getBasket() {
        return basket;
    }
}

package d.impl.good;

public class ShoppingBasket {

    private final IPersistence persistence;
    private final IPaymentMethod paymentMethod;


    public ShoppingBasket(IPersistence persistence, IPaymentMethod paymentMethod) {
        this.persistence = persistence;
        this.paymentMethod = paymentMethod;
    }

    public void buy(Shopping shopping) {
        persistence.save(shopping);
        paymentMethod.pay(shopping);
    }
}

package domain.models;

import domain.enums.Language;

public class HalfPriceTicket extends Ticket {

    private final double DISCOUNT = 0.5; 

    public HalfPriceTicket(double value, String movie, Language language) {
        super(value, movie, language);
        setDiscount(value);
    }

    protected void setDiscount(double value) { setValue(value * DISCOUNT); }
}

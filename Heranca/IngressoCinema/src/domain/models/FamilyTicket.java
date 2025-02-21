package domain.models;

import domain.enums.Language;

public class FamilyTicket extends Ticket {

    private final double DISCOUNT = 0.95;
    private final int MIN_MEMBERS = 4; 
    private int _familyMembers;


    public FamilyTicket(double value, String movie, Language language, int familyMembers) {
        super(value, movie, language);

        this._familyMembers = familyMembers;
        
        setDiscount(value, familyMembers);
    }

    protected void setDiscount(double value, int familyMembers) {

        if (familyMembers >= MIN_MEMBERS) setValue(value * familyMembers * DISCOUNT);
        else setValue(value * familyMembers);
    }

    public int getFamilyMembers() { return this._familyMembers; }

    @Override
    public String toString() { 
        return  
            "\n" +
            "Ticket Type: " + getClass().getCanonicalName() + "\n" +
            "Members: "  + String.valueOf(getFamilyMembers()) + "\n" +
            "Value: " + String.valueOf(getValue()) + "\n" +
            "Movie: " + String.valueOf(getMovie()) + "\n" + 
            "Language: " + String.valueOf(getLanguage().getValue()) + "\n" 
            ; 
    }
}

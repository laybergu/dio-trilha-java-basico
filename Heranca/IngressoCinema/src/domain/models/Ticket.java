package domain.models;

import domain.enums.Language;

public class Ticket {
    
    private double _value ;
    private String _movie ; 
    private Language _language ;

    public Ticket(double value, String movie, Language language ) { 
        this._value = value;
        this._movie = movie;
        this._language = language;
    }

    public double getValue() { return this._value; }

    public String getMovie() { return this._movie; }

    public Language getLanguage() { return this._language; }

    protected void setValue(double value) { this._value = value; }

    @Override
    public String toString() { 
        return  
            "\n" +
            "Ticket Type: " + getClass().getCanonicalName() + "\n" +
            "Value: " + String.valueOf(getValue()) + "\n" +
            "Movie: " + String.valueOf(getMovie()) + "\n" + 
            "Language: " + String.valueOf(getLanguage().getValue()) + "\n"
            ; 
    }
}

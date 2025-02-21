package domain.enums;

public enum Language {
    
    PT_BR("BRAZILIAN PORTUGUESE"),
    EN_US("ENGLISH");

    private String _language; 

    private Language(String language) {
        this._language = language;
    }

    public String getValue() { return this._language ;}
}

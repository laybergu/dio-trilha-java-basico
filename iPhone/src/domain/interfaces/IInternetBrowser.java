package domain.models.interfaces; 

public interface IInternetBrowser {

    public void displayPage(String url);
    public void refreshPage();
    public void minimizePage();
    public void addNewTab();
    public void closeTab();
    public void closeAll();
} 
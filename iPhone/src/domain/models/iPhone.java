package domain.models;

import domain.models.interfaces.*;

public class iPhone implements IInternetBrowser, IMusicPlayer, ITelephone {
    
    @Override
    public void displayPage(String url) {
        System.out.println("Displaying page: " + url);
    }

    @Override
    public void refreshPage() {
        System.out.println("Refreshing page");
    }

    @Override
    public void minimizePage() {
        System.out.println("Minimizing page");
    }

    @Override
    public void addNewTab() {
        System.out.println("Adding new tab");
    }

    @Override
    public void closeTab() {
        System.out.println("Closing tab");
    }

    @Override
    public void closeAll() {
        System.out.println("Closing all tabs");
    }

    @Override
    public void playMusic(String Music) {
        System.out.println("Playing music " + Music);
    }

    @Override
    public void pauseMusic() {
        System.out.println("Pausing current music");
    }

    @Override
    public void nextMusic() {
        System.out.println("Playing next music");
    }

    @Override
    public void prevMusic() {
        System.out.println("PLaying previous music");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Increasing volume");
    }

    @Override
    public void reduceVolume() {
        System.out.println("Reducing volume");
    }

    @Override
    public void call(String number) {
        System.out.println("Calling " + number);
    }

    @Override
    public void answerCall() {
        System.out.println("Answering call");
    }

    @Override
    public void endCall() {
        System.out.println("Ending call");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("Starting voice mail");
    }

    @Override
    public void endVoiceMail() {
        System.out.println("Ending voice mail");
    }
}

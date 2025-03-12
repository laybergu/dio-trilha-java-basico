package domain.models.interfaces;

public interface IMusicPlayer {
    
    public void playMusic(String music); 
    public void pauseMusic();
    public void nextMusic();
    public void prevMusic();
    public void increaseVolume();
    public void reduceVolume();
}

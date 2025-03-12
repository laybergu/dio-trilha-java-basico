package domain.models.interfaces;

public interface ITelephone {

    public void call(String number);
    public void answerCall();
    public void endCall();
    public void startVoiceMail();
    public void endVoiceMail();
}
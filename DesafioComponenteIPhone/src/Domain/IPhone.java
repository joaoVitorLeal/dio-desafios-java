package Domain;

import services.BrowserService;
import services.MusicPlayerService;
import services.TelephonyService;

public class IPhone {

    private MusicPlayerService musicPlayer;
    private TelephonyService telephony;
    private BrowserService browser;

    public IPhone() { }

    public IPhone(BrowserService browser, MusicPlayerService musicPlayer, TelephonyService telephony) {
        this.browser = browser;
        this.musicPlayer = musicPlayer;
        this.telephony = telephony;
    }

    // Delegate Methods //
    /// Music Player Services ///
    public void playMusic() {
        musicPlayer.playMusic();
    }

    public void pauseMusic() {
        musicPlayer.pauseMusic();
    }

    public void selectMusic(String music) {
        musicPlayer.selectMusic(music);
    }

    /// Telephony Services ///
    public void callNumber(String number) {
        telephony.call(number);
    }

    public void answerCall() {
        telephony.answerCall();
    }

    public void startVoicemail() {
        telephony.startVoicemail();
    }

    /// Browser Services ///
    public void openWebPage(String url) {
        browser.showWebPage(url);
    }

    public void addNewTab() {
        browser.addNewTab();
    }

    public void refreshPage() {
        browser.refreshPage();
    }
}
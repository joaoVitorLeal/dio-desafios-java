import Domain.IPhone;
import services.BrowserService;
import services.MusicPlayerService;
import services.TelephonyService;
import services.impl.BrowserServiceImpl;
import services.impl.MusicPlayerServiceImpl;
import services.impl.TelephonyServiceImpl;

public class IPhoneApp {

    public static void main(String[] args) {

        ///  Initializing services ///
        MusicPlayerService musicPlayer = new MusicPlayerServiceImpl();
        BrowserService browser = new BrowserServiceImpl();
        TelephonyService telephony = new TelephonyServiceImpl();

        ///  Instantiating the IPhone and injecting dependencies ///
        final IPhone iphone = new IPhone(browser, musicPlayer, telephony);

        /// Actions ///
        // Telephony Act //
        iphone.callNumber("+5571-988-885-555");
        iphone.answerCall();
        iphone.startVoicemail();
        System.out.println("========================");

        // Browser Act //
        iphone.openWebPage("https://github.com/joaoVitorLeal");
        iphone.addNewTab();
        iphone.refreshPage();
        System.out.println("========================");

        // Music Player Act //
        iphone.selectMusic("505");
        iphone.playMusic();
        iphone.pauseMusic();
    }
}

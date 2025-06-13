package services.impl;

import services.TelephonyService;

public class TelephonyServiceImpl implements TelephonyService {

    @Override
    public void call(String number) {
        System.out.println("Calling the number: " + number);
    }

    @Override
    public void answerCall() {
        System.out.println("Answered call");
    }

    @Override
    public void startVoicemail() {
        System.out.println("Started voicemail");
    }
}

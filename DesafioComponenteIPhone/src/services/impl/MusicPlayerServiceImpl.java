package services.impl;

import services.MusicPlayerService;

public class MusicPlayerServiceImpl implements MusicPlayerService {

    @Override
    public void playMusic() {
        System.out.println("Playing the some music");
    }

    @Override
    public void pauseMusic() {
        System.out.println("Paused music");
    }

    @Override
    public void selectMusic(String music) {
        System.out.println("Selected music: " + music);
    }
}

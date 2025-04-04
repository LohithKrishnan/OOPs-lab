abstract class MediaPlayer {
    abstract void play();
    abstract void pause();
}

class AudioPlayer extends MediaPlayer {
    void play() {
        System.out.println("Playing audio...");
    }
    void pause() {
        System.out.println("Audio paused.");
    }
}

class VideoPlayer extends MediaPlayer {
    void play() {
        System.out.println("Playing video...");
    }
    void pause() {
        System.out.println("Video paused.");
    }
}

public class Abstractclass2 {
    public static void main(String[] args) {
        MediaPlayer player1 = new AudioPlayer();
        player1.play();
        player1.pause();

        MediaPlayer player2 = new VideoPlayer();
        player2.play();
        player2.pause();
    }
}

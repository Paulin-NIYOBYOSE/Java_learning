interface Playable{
    void play();
    void pause();
    void stop();
    //Default method
    default void displayMetadata(){
        System.out.println("Metadata: Not available");
    }

    //Static method
    static boolean isDigital() {
        return true;
    }
}

class MP3Player implements Playable{
    private String songName;
    public MP3Player(String songName) {
        this.songName = songName;
    }

    @Override
    public void play() {
        System.out.println("Playing: " + songName);
    }

    @Override
    public void pause() {
        System.out.println("Paused: " + songName);
    }

    @Override
    public void stop() {
        System.out.println("Stopped: " + songName);
    }

    @Override
    public void displayMetadata() {
        System.out.println("Metadata: " + songName);
    }
}
class VideoPlayer implements Playable{
    private String videoName;

    public VideoPlayer(String videoName) {
        this.videoName = videoName;
    }
    @Override
    public void play(){
        System.out.println("Playing: " + videoName);
    }

    @Override
    public void pause() {
        System.out.println("Paused: " + videoName);
    }
    @Override
    public void stop() {
        System.out.println("Stopped: " + videoName);
    }
}

class MediaPlayerApp{
    public static void main(String[] args){
        Playable mp3 = new MP3Player("Shape of you");
        Playable video = new VideoPlayer("Jugumila");

        mp3.play();
        mp3.pause();
        mp3.stop();

        video.play();
        video.pause();
        video.stop();
    }
}
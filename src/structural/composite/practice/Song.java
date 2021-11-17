package structural.composite.practice;

// Leaf
public class Song implements IComponent {
    private String songName;
    private String artist;
    private float speed;

    public Song(String name, String artist) {
        this.songName = name;
        this.artist = artist;
        this.speed = 1.00f;
    }

    @Override
    public void play() {
        System.out.println("play " + songName);
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        this.speed = speed;
    }

    @Override
    public String getName() {
        return this.songName;
    }

    public String getArtist() {
        return this.artist;
    }
}

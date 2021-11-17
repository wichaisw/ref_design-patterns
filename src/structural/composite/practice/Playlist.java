package structural.composite.practice;

import java.util.ArrayList;

// Composite
public class Playlist implements IComponent {
    private String playlistName;
    private ArrayList<IComponent> playlist;

    public Playlist(String name) {
        this.playlistName = name;
        this.playlist = new ArrayList<IComponent>();
    }

    public void getSong(int trackNumber) {
        this.playlist.get(trackNumber);
    }

    public void addSong(IComponent component) {
        this.playlist.add(component);
    }

    public void removeSong(IComponent component) {
        System.out.println("remove: " + component.getName());
        this.playlist.remove(component);
    }

    @Override
    public void play() {
        System.out.println("playlist: " + playlistName);
        for(IComponent song : this.playlist) {
            song.play();
        }
    }

    @Override
    public void setPlaybackSpeed(float speed) {
        for(IComponent component : this.playlist){
            component.setPlaybackSpeed(speed);
        }
    }

    @Override
    public String getName() {
        return this.playlistName;
    }
}

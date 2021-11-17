package structural.composite.practice;

// Client
public class Program {
    public static void main(String[] args) {
        Song unravel = new Song("Unravel", "TK");
        Song kiseki = new Song("Kiseki", "Flow");
        Song days = new Song("Days", "Flow");

        Playlist animePlaylist = new Playlist("Anime Playlist");
        animePlaylist.addSong(unravel);
        animePlaylist.addSong(kiseki);
        animePlaylist.addSong(days);
        animePlaylist.play();

        animePlaylist.removeSong(kiseki);
        animePlaylist.play();
    }
}

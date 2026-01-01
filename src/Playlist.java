import java.util.ArrayList;

public class Playlist extends Song {
    private String playlistName;
    private ArrayList<Song> songs = new ArrayList<>();

    public Playlist(String title, int duration, Artist artist, String playlistName) {
        super(title, duration, artist);
        this.playlistName = playlistName;
    }

    public String getPlaylistName() { return playlistName; }

    public void addSong(Song song) { songs.add(song); }

    public ArrayList<Song> getSongs() { return songs; }

    public String showPlaylist() {
        String result = "Playlist: " + playlistName + "\n";
        for (int i = 0; i < songs.size(); i++) {
            result += (i+1) + ". " + songs.get(i).toString() + "\n";
        }
        return result;
    }
}

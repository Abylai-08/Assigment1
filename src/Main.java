public class Main {
    public static void main(String[] args) {
        Song song1 = new Song(1, "TER", 183);
        Song song2 = new Song(2, "UADE", 253);
        Artist artist = new Artist(1, "SHIZA", "RAP");
        Playlist playlist = new Playlist(1, "AABB");

        System.out.println("Playlist: " + playlist.getPlaylistName());
        System.out.println("Artist: " + artist.getName() + " (" + artist.getGenre() + ")");
        System.out.println("Song 1: " + song1.getTitle() + ", duration: " + song1.getDuration());
        System.out.println("Song 2: " + song2.getTitle() + ", duration: " + song2.getDuration());
        song1.setTitle("Imagine (Remastered)");
        System.out.println("Updated song title: " + song1.getTitle());

        // сравнение объектов
        if (song1.getDuration() > song2.getDuration()) {
            System.out.println("Song 1 is longer");
        } else {
            System.out.println("Song 2 is longer");
        }

    }
}
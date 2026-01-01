import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Artist shiza = new Artist("SHIZA", "RAP");
        Artist lennon = new Artist("Lennon", "Rock");


        Song song1 = new Song("TER", 183, shiza);
        Song song2 = new Song("UADE", 253, shiza);
        Song song3 = new Song("Imagine", 200, lennon);


        Playlist playlist = new Playlist("TER", 183, shiza, "My Playlist");
        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);


        System.out.println("Current playlist:");
        System.out.println(playlist.showPlaylist());


        System.out.print(" ");
        int index = sc.nextInt();
        sc.nextLine();

        if (index >= 1 && index <= playlist.getSongs().size()) {
            System.out.print(" ");
            String newTitle = sc.nextLine();
            playlist.getSongs().get(index - 1).setTitle(newTitle);

            System.out.println("\nUpdated playlist:");
            System.out.println(playlist.showPlaylist());
        } else {
            System.out.println("Invalid song number!");
        }

        sc.close();
    }
}

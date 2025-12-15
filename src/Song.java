public class Song {

    private int songId;
    private String title;
    private int duration;

    public Song(int songId, String title, int duration) {
        this.songId = songId;
        this.title = title;
        this.duration = duration;
    }
    public int getSongId(int SongId){
        return SongId;
    }
    public void setSongId(int songId){
        this.songId = songId;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public int getDuration(){
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}

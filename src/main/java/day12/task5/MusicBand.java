package day12.task5;

import java.util.List;

public class MusicBand {

    private String name;
    private int year;
    private List<MusicArtist> members;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMusicArtists(List<MusicArtist> musicArtist) {
        this.members = musicArtist;
    }

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }


    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", musicArtists=" + members +
                '}';
    }

    public static void transferMembers(MusicBand A, MusicBand B) {
        B.getMembers().addAll(A.getMembers());
        A.getMembers().removeAll(A.getMembers());
    }

}








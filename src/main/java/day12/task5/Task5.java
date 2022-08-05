package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {


        List<MusicArtist> members = new ArrayList<>();

        MusicBand A = new MusicBand("A", 1960, new ArrayList<>());

        A.getMembers().add(new MusicArtist("Ringo Star", 55));
        A.getMembers().add(new MusicArtist("John Lennon", 60));

        MusicBand B = new MusicBand("B", 1970, new ArrayList<>());

        B.getMembers().add(new MusicArtist("Brian May", 54));
        B.getMembers().add(new MusicArtist("Freddie Mercury", 48));
        B.getMembers().add(new MusicArtist("Roger Taylor", 46));


        MusicBand.transferMembers(A, B);
        System.out.println(A);
        System.out.println(B);

    }
}

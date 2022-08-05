package day12.task3;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {

        List<MusicBand> bands = new ArrayList<>(10);

        bands.add(new MusicBand("Linkin Park", 1996));
        bands.add(new MusicBand("Beatles", 1960));
        bands.add(new MusicBand("Queen", 1970));
        bands.add(new MusicBand("Slipknot", 2004));
        bands.add(new MusicBand("Snow Patrol", 2005));
        bands.add(new MusicBand("Korn", 2008));
        bands.add(new MusicBand("DDT", 1990));
        bands.add(new MusicBand("Nautilus", 1991));
        bands.add(new MusicBand("Metallica", 1980));
        bands.add(new MusicBand("Green Day", 1999));


        Collections.shuffle(bands);

        System.out.println(bands);
        System.out.println(groupsAfter2000(bands));
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> bandsAfter2000 = new ArrayList<>(10);
        for (int i = 0; i < bands.size(); i++) {
            if (bands.get(i).getYear() > 2000) {
                bandsAfter2000.add(bands.get(i));
            }
        }
        return bandsAfter2000;

    }

}

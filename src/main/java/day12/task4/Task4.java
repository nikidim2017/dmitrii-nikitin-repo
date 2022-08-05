package day12.task4;

import javax.swing.plaf.multi.MultiScrollBarUI;
import java.util.List;
import java.util.ArrayList;

public class Task4 {
    public static void main(String[] args) {

        MusicBand A = new MusicBand("A", 1960, new ArrayList<>());
        A.getMembers().add("Paul McCartney");
        A.getMembers().add("Ringo Star");
        A.getMembers().add("John Lennon");

        MusicBand B = new MusicBand("B", 1970, new ArrayList<>());
        B.getMembers().add("Brian May");
        B.getMembers().add("Freddie Mercury");
        B.getMembers().add("Roger Taylor");


        MusicBand.transferMembers(A, B);
        System.out.println(A);
        System.out.println(B);


    }

}

package ua.andrey;

import ua.andrey.album.Disk;
import ua.andrey.song.Record;
import ua.andrey.song.Style;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Disk disk=new Disk();
        Record r1=new Record("Name1",10.4, Style.BLUES);
        Record r2=new Record("Name2",10.5, Style.COUNTRY);
        Record r3=new Record("Name3",1.9, Style.LATINA);

        disk.write(r2,r1);
        disk.write(r3);
        System.out.println(disk);
        disk.sortedByStyles();
        System.out.println(disk);
        System.out.println();
        List<Record> listInRange=disk.findFromRangeLength(3,13);
        System.out.println(listInRange);





    }
}

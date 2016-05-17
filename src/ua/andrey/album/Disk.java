package ua.andrey.album;

import ua.andrey.song.Record;

import java.util.*;
import java.util.stream.Collectors;


interface IDisk {
    void write(Record... records);

    void delete(int id);

    Record get(int id);

    void sortedByStyles();

    double getLength();

    List<Record> findFromRangeLength(double min,double max);
}

public class Disk implements IDisk {
    private List<Record> list = new ArrayList<>();
    private double length = 0;


    /**
     *
     * @param min
     * @param max
     * @return list with length in range(min,max)
     */
    @Override
    public List<Record> findFromRangeLength(double min, double max) {
        if(min>max){
            double t=min;
            min=max;
            max=t;
        }
        List<Record> newList=new ArrayList<>();
        for (Record record : list) {
            if(record.getLength()>min&&record.getLength()<max){
                newList.add(record);
            }
        }
        return newList;
    }

    @Override
    public void write(Record... records) {
        Arrays.stream(records).collect(Collectors.toCollection(()->list));

    }

    @Override
    public void delete(int id) {
        list.remove(id);
    }

    @Override
    public Record get(int id) {
        return list.get(id);
    }

    @Override
    public void sortedByStyles() {
        Collections.sort(list,(Record r1, Record r2)->r1.getStyle().compareTo(r2.getStyle()));
    }

    @Override
    public double getLength() {
        length=0;
        for (Record record : list) {
            length+=record.getLength();
        }
        return length;
    }

    @Override
    public String toString() {
        return "Album{" +
                "list=" + list +
                ", length=" + length +
                '}';
    }
}

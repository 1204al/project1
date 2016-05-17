package ua.andrey.song;


public class Record {
    private String name;
    private double length;
    private Style style;

    @Override
    public String toString() {
        return "Record{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", style=" + style +
                '}';
    }

    /**
     * Create record without style. It is Style.DEFAULT (NoStyle)
     * @param name
     * @param length
     */
    public Record(String name, double length) {
        this.name = name;
        this.length = length;
        this.style=Style.DEFAULT;
    }

    /**
     * Create record
     * @param name
     * @param length
     * @param style
     */
    public Record(String name, double length, Style style) {
        this.name = name;
        this.length = length;
        this.style = style;
    }

    /**
     * Create record without name and style
     * @param length
     */
    public Record(double length) {
        this.length = length;
        this.name="NoName";
        this.style= Style.DEFAULT;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public Style getStyle() {
        return style;
    }

    public void setStyle(Style style) {
        this.style = style;
    }
}

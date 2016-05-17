package ua.andrey.song;

public enum Style {
    LATINA("musica latinoamericana"),
    BLUES("blue devils"),
    JAZZ("jazz"),
    COUNTRY("country music"),
    DEFAULT("NoStyle");


   private final String styleName;

    Style(String styleName) {
        this.styleName=styleName;
    }

    @Override
    public String toString() {
        return  styleName;
    }
}

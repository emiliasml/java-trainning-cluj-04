package _2_oo_code_challenges_2;

import javax.print.DocFlavor;

public class Studio {
    private String name;
    private Film[] films;

    public Studio(String name, Film[] films) {
        this.name = name;
        this.films = films;
    }

    public String getName() {
        return this.name;
    }

    public Film[] getFilms() {
        return this.films;
    }
}
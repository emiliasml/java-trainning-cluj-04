package _2_oo_code_challenges_2;

public class Film {
    private Integer releaseDate;
    private String name;
    private Actor[] actors;

    public Film(Integer releaseDate, String name, Actor[] actors) {
        this.releaseDate = releaseDate;
        this.name = name;
        this.actors = actors;
    }

    public Integer getReleaseDate() {
        return this.releaseDate;
    }

    public String getName() {
        return this.name;
    }

    public Actor[] getActors() {
        return this.actors;
    }
}

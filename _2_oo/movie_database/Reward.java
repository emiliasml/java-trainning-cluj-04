package _2_oo_code_challenges_2;

import java.nio.charset.IllegalCharsetNameException;

public class Reward {
    private String name;
    private Integer year;

    public Reward(String name, Integer year) {
        this.name = name;
        this.year = year;
    }

    public String getName() {
        return this.name;
    }

    public Integer getYear() {
        return this.year;
    }
}

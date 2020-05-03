package _2_oo_code_challenges_2;

public class Actor {
    private String name;
    private Integer age;
    private Reward[] rewards;

    public Actor(String name, Integer age, Reward[] rewards) {
        this.name = name;
        this.age = age;
        this.rewards = rewards;
    }

    public String getName() {
        return this.name;
    }

    public Integer getAge() {
        return this.age;
    }

    public Reward[] getRewards() {
        return this.rewards;
    }
}

package _2_oo_code_challenges;

public class Fighter {
    private final String name;
    private int health;
    private final int damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    //getters
    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void attack(Fighter opponent) {
        opponent.health = opponent.health - this.damagePerAttack;
    }
}

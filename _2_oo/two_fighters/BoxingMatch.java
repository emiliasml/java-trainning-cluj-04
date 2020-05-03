package _2_oo_code_challenges;

public class BoxingMatch {
    private Fighter firstFighter;
    private Fighter secondFighter;

    public BoxingMatch(Fighter firstFighter, Fighter secondFighter) {
        this.firstFighter = firstFighter;
        this.secondFighter = secondFighter;
    }

    //returns the name of the winner
    public String fight() {
        while (firstFighter.getHealth() > 0 && secondFighter.getHealth() > 0) {
            firstFighter.attack(secondFighter);
            secondFighter.attack(firstFighter);
        }
        if (firstFighter.getHealth() > 0)
            return firstFighter.getName();
        else return secondFighter.getName();
    }

    public static void main(String[] args) {
        Fighter firstFighter = new Fighter("Joe", 2000, 100);
        Fighter secondFighter = new Fighter("Bob", 3000, 80);
        BoxingMatch box = new BoxingMatch(firstFighter, secondFighter);
        System.out.println(box.fight());
    }
}


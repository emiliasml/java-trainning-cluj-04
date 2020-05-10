package occurrence;

public class Word {
    int nrOfAppearances;
    String word;

    public Word(String w) {
        this.word = w;
        this.nrOfAppearances = 0;
    }
    public void increaseNrOfAppearances(){
        nrOfAppearances++;
    }
}

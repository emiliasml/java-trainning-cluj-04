package pairs;

public class ShoesMain {
    public static void main(String[] args){
        Running runningShoe1 = new Running("yellow", 38);
        Running runningShoe2 = new Running("yellow", 39);
        Heels heelsShoe1 = new Heels("red", 37);
        Heels heelsShoe2 = new Heels("blue", 39);
        Boot bootShoe1 = new Boot("rainbow", 40);
        Boot bootShoe2 = new Boot("rainbow", 40);
        try {
           Pair<Running> runningPair = new Pair<>(runningShoe1, runningShoe2);
       }catch( ColorsDontMatchException | SizesDontMatchException ce){
           System.out.println(ce);
       }
        try {
            Pair<Heels> heelsPair = new Pair<>(heelsShoe1, heelsShoe2);
        }catch (ColorsDontMatchException | SizesDontMatchException se){
            System.out.println(se);
        }
        try {
            Pair<Boot> bootPair = new Pair<>(bootShoe1, bootShoe2);
        }catch (ColorsDontMatchException | SizesDontMatchException se){
            System.out.println(se);
        }
    }
}

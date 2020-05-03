package _2_oo_code_challenges_2;

import java.awt.desktop.SystemEventListener;
import java.util.concurrent.locks.ReadWriteLock;

public class Stage2and3 {
    public static void main(String[] args) {
        //stage 2
        Reward oscar1990 = new Reward("oscar", 1990);
        Reward oscar2000 = new Reward("oscar", 2000);
        Reward oscar2010 = new Reward("oscar", 2010);

        Actor actorOscar1990 = new Actor("actor with 2 oscars", 35, new Reward[]{oscar1990, oscar2000});
        Actor actorWithoutRewards = new Actor("actor without oscars", 33, new Reward[]{});
        Actor actorWithOneOscar = new Actor("actor with one oscar", 90, new Reward[]{oscar2010});

        Film film1 = new Film(1999, "film1",
                new Actor[]{actorOscar1990, actorWithOneOscar, actorWithoutRewards});
        Film film2 = new Film(2021, "film2", new Actor[]{});
        Film film3 = new Film(1980, "film3",
                new Actor[]{actorOscar1990, actorWithOneOscar});
        Film film4 = new Film(1900, "film4",
                new Actor[]{actorWithOneOscar, actorOscar1990});

        Studio studio1 = new Studio("Disney", new Film[]{film1, film2, film3});
        Studio studio2 = new Studio("unknownStudio", new Film[]{film4});

        Studio[] studioDataBase = new Studio[]{studio1, studio2};

        //stage3
        System.out.println("--Studios with more than 2 movies--");
        String[] studios;
        int index = 0;
        studios = getStudiosWithMoreThan2Films(studioDataBase);
        if (studios[0] == null) System.out.println("There are no studios with more than 2 movies");
        else while (studios[index] != null) {
            System.out.println(studios[index]);
            index++;
        }

        System.out.println("--Studios in witch plays the author with name \"actor with 2 oscars\"--");
        printStudiosForActor(studioDataBase);

        System.out.println("--Movies in witch plays at least an actor with age above 50--");
        printMovieNamesInWitchPlaysAtLeastAnActorWithAgeAbove50(studioDataBase);
    }

    //get all the studio names that have published more than 2 movies
    public static String[] getStudiosWithMoreThan2Films(Studio[] studios) {
        String[] toReturnStudios = new String[10];
        int index = 0;
        for (Studio studio : studios) {
            if (studio.getFilms().length > 2) {
                toReturnStudios[index] = studio.getName();
                index++;
            }
        }
        return toReturnStudios;
    }

    //get all the studio names in witch plays the author with name "actor with 2 oscars"
    public static void printStudiosForActor(Studio[] studios) {
        boolean value;
        for (Studio st : studios) {
            value = false;
            for (Film f : st.getFilms()) {
                for (Actor a : f.getActors()) {
                    if (a.getName().equals("actor with 2 oscars")) {
                        value = true;
                        break;
                    }
                }
            }
            if (value) System.out.println(st.getName());
        }
    }

    //get movie names in witch plays at least an actor with age above 50
    public static void printMovieNamesInWitchPlaysAtLeastAnActorWithAgeAbove50(Studio[] studios){
        boolean value;
        for(Studio st:studios){
            for(Film f: st.getFilms()){
                value=false;
                for(Actor a:f.getActors())
                    if (a.getAge() > 50) {
                        value = true;
                        break;
                    }
                if(value)
                System.out.println(f.getName());
            }
        }
    }

}
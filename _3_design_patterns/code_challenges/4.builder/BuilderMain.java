package builder;

public class BuilderMain {
    static public void main(String[] args){
        Person person = new Person.BuilderP("Mary")
                .setJob("teacher")
                .setDrivingLicence(true)
                .setIsMarried(true)
                .build();
        System.out.println(person);
    }
}

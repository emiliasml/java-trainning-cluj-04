package builder;

public class Person {
    private final String name; //required parameter
    private final String job, university;  // optional parameters
    private final boolean drivingLicence, isMarried;

    public String getName() {
        return this.name;
    }

    public String getJob() {
        return this.job;
    }

    public String getUniversity() {
        return this.university;
    }

    public boolean getDrivingLicence() {
        return this.drivingLicence;
    }

    public boolean getIsMarried() {
        return this.isMarried;
    }

    private Person(BuilderP BuilderP) {
        this.name = BuilderP.name;
        this.job = BuilderP.job;
        this.university = BuilderP.university;
        this.drivingLicence = BuilderP.drivingLicence;
        this.isMarried = BuilderP.isMarried;
    }

    @Override
    public String toString() {
        return "Person {" +
                " name = '" + name + '\'' +
                ", job = '" + job + '\'' +
                ", university= '" + university + '\'' +
                ", drivingLicence = " + drivingLicence +
                ", isMarried = " + isMarried +
                " }";
    }

    public static class BuilderP {
        private final String name;
        private String job, university;
        private boolean drivingLicence, isMarried;

        public BuilderP(String name) {
            this.name = name;
        }

        public BuilderP setJob(String job) {
            this.job = job;
            return this;
        }

        public BuilderP setUniversity(String university) {
            this.university = university;
            return this;
        }

        public BuilderP setDrivingLicence(boolean drivingLicence) {
            this.drivingLicence = drivingLicence;
            return this;
        }

        public BuilderP setIsMarried(boolean isMarried) {
            this.isMarried = isMarried;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}

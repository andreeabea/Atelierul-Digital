package builder;

public class Person {

    String name, job, university, drivingLicense;
    boolean isMarried;

    private Person(Builder b)
    {
        this.name=b.name;
        this.job=b.job;
        this.university=b.university;
        this.drivingLicense=b.drivingLicense;
        this.isMarried=b.isMarried;
    }

    public static class Builder
    {
        String name, job, university, drivingLicense;
        boolean isMarried;

        public Builder(String name)
        {
            this.name=name;
        }

        public Builder job(String job)
        {
            this.job=job;
            return this;
        }

        public Builder university(String university)
        {
            this.university=university;
            return this;
        }

        public Builder drivingLicense(String drivingLicense)
        {
            this.drivingLicense=drivingLicense;
            return this;
        }

        public Person build()
        {
            return new Person(this);
        }
    }
}

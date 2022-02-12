public class Course {

    private String name;
    private int duration;
    private boolean isStarted;


    public Course(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public boolean isStarted(boolean isStarted) {
        this.isStarted = isStarted;
        return isStarted;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", isStarted=" + isStarted +
                '}';
    }
}

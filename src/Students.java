public class Students {

    String first_name;
    private String last_name;
    private int year;
    Course course;

    public Students(String first_name, String last_name, int year) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.year = year;
    }

    public Students(){

    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void yearUp (){
        if (year != 4){
            year++;
        }
        else  {
            System.out.println("Student " + first_name + " " + last_name +  " je na završnoj godini");
        }
    }

    @Override
    public String toString() {
        return "Students{" +
                "first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", year=" + year +
                ", course=" + course +
                '}';
    }
}

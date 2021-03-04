import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Students {
    public String name;
    public int rollNumber;
//    public List<String> subject = new ArrayList<>();
    public Optional<List<String>> subjects;

    public Students (String name, int rollNumber, Optional<List<String>> subjects){
        this.name = name;
        this.rollNumber = rollNumber;
        this.subjects = subjects;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Optional<List<String>> getSubjects() {
        return subjects;
    }

    public void setSubjects(Optional<List<String>> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", optionalsubject=" + subjects +
                '}';
    }

}

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ClassRoom {
    public String roomID;
//    public static List<Students> studentList = new ArrayList<>();
    Optional<List<Students>> studentList;

    public ClassRoom(String roomID , Optional<List<Students>> studentList){
        this.roomID = roomID;
        this.studentList = studentList;
    }

    public String getRoomID() {
        return roomID;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public Optional<List<Students>> getStudentList() {
        return studentList;
    }

    public void setStudentList(Optional<List<Students>> studentList) {
        this.studentList = studentList;
    }

    public void getstudentsubjects(Optional<List<Students>> studentList){
        studentList.get().stream()
                .collect(Collectors.toList())
                .forEach(student -> System.out.println(student.getSubjects()));
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "roomID='" + roomID + '\'' +
                ", optionalstudentList=" + studentList +
                '}';
    }

}
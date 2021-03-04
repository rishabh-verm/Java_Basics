import java.nio.channels.ClosedSelectorException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class main {

    public static void main(String[] args) {

        Students student1 = new Students("Rishabh",1,Optional.of(Arrays.asList("Java")));
        Students student2 = new Students("Kritika",2,Optional.of(Arrays.asList("Sanskrit","Maths")));
        Students student3 = new Students("Shashank",3,Optional.empty());

        List<Students> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);


        ClassRoom room1 = new ClassRoom("1A",Optional.of(Arrays.asList(student1)));
        ClassRoom room2 = new ClassRoom("1A",Optional.of(Arrays.asList(student2)));
        ClassRoom room3 = new ClassRoom("1A",Optional.of(Arrays.asList(student3)));
        ClassRoom room4 = new ClassRoom("1B",Optional.empty());


        List<ClassRoom> ifstudentsassociated = new ArrayList<>();
        ifstudentsassociated.add(room1);
        ifstudentsassociated.add(room2);
        ifstudentsassociated.add(room3);

        // 1. Find the students associated with a room that have no subjects associated.
        System.out.println("part1");
        StudentsWithaRoomAndnoSubject.accept(students);


//      2. Find the subjects of students associated with a room = "xyz".
//        StudentsWithaRoom.accept(ifstudentsassociated);
        System.out.println("part2");
        roomassociated.accept("1A",ifstudentsassociated);

//      3.print "hello Student" if a room has students associated.
        System.out.println("part3");
        RoomHasAStudent.accept(ifstudentsassociated);


    }

    static Consumer<List<Students>> StudentsWithaRoomAndnoSubject = students -> {
        students.stream()
                    .filter(student -> student.getSubjects().isEmpty())
                    .collect(Collectors.toList())
                    .forEach(System.out::println);
    };

    static Consumer<List<ClassRoom>> StudentsWithaRoom = students -> {
        students.stream().filter(room -> room.getRoomID().equals("1A"))
                .filter(room -> room.getStudentList().isPresent())
                .collect(Collectors.toList())
                .forEach(System.out::println);
    };


    static Consumer<List<ClassRoom>> RoomHasAStudent = room -> {

                    room.stream()
                    .filter(rooms -> rooms.getStudentList().isPresent())
                    .collect(Collectors.toList())
                    .forEach(student-> System.out.println("hello student"));
    };



    static BiConsumer<String,List<ClassRoom>> roomassociated = (roomID, room) -> {
        for(ClassRoom c: room){
            if(roomID == c.roomID){
                c.getstudentsubjects(c.studentList);
            }
        }
    };
}

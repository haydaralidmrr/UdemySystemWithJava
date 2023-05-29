import java.util.ArrayList;

public class Course {
    private String name;
    private ArrayList <Lesson> lessonInCourse;
    private ArrayList <Teacher> teachersInCourse;
    private ArrayList <Student> studentsInCourse;
    private boolean isActive;

    public Course(String name,Teacher teacher) {
        this.name = name;
       lessonInCourse=new ArrayList<>();
       teachersInCourse=new ArrayList<>();
       studentsInCourse=new ArrayList<>();
       teachersInCourse.add(0,teacher);
       this.isActive=false;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Lesson> getLessonInCourse() {
        return lessonInCourse;
    }

    public ArrayList<Student> getStudentsInCourse() {
        return studentsInCourse;
    }
    public void addLesson(Lesson lesson){
        lessonInCourse.add(lesson);
    }
    public int numberOfLesson(){
        return lessonInCourse.size();
    }
    public void addTeachers(Teacher teacher){
        if(!teachersInCourse.contains(teacher)){
            teachersInCourse.add(teacher);
            System.out.println(teacher.getName()+" teacher added in the course");

        }else {
            System.out.println(teacher.getName()+" teacher already added");

        }
    }
    public void removeTeachers(Teacher teacher){
        if (teacher.getName().equals(teachersInCourse.get(0).getName())){
            System.out.println("this teacher is head teacher of this course cannot remove");
        }else {
            teachersInCourse.remove(teacher);
            System.out.println(teacher.getName()+ " was removed");
        }
    }
    private int timeLessonInCourse(){
        double time=0;
        for (Lesson lesson:lessonInCourse){
            time+=lesson.getLessonTime();
        }
        return (int) time;
    }
    public boolean active(){
        if (lessonInCourse.size()>=5 && timeLessonInCourse()>60){
            isActive=true;
            return true;
        }else {
            isActive=false;
            return false;
        }

    }


}

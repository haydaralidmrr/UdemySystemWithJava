import java.util.ArrayList;
import java.util.LinkedList;

public class Student extends Person{
    private ArrayList<Course> takenCourse ;
    private LinkedList<Lesson> watchLesson;

    public Student(String name, String identifyWord, String userName) {
        super(name, identifyWord, userName);
        this.takenCourse=new ArrayList<>();
        this.watchLesson=new LinkedList<>();
    }

    public ArrayList<Course> getTakenCourse() {
        return takenCourse;
    }

    public void setTakenCourse(ArrayList<Course> takenCourse) {
        this.takenCourse = takenCourse;
    }

    public LinkedList<Lesson> getWatchLesson() {
        return watchLesson;
    }

    public void setWatchLesson(LinkedList<Lesson> watchLesson) {
        this.watchLesson = watchLesson;
    }
    public void joinCourse(Course java){
        if (java.active()){
            java.getStudentsInCourse().add(this);
            takenCourse.add(java);
            System.out.println(this.getName()+" join the "+ java.getName()+" course");
        }else {
            System.out.println("that course which is trying to join you have not actived yet");
        }
    }
    public void watchWillLesson(Lesson lesson){
        if (takenCourse.size()>0){
         boolean finish=false;
            for (Course temp:takenCourse){
                if (temp.getLessonInCourse().contains(lesson)){
                    watchLesson.add(lesson);
                    System.out.println("list of watches "+temp.getName()+" course's" +lesson.getLessonName()+" lesson was added");
                    finish=true;
                    break;
                }
            }
            if (!finish){
                System.out.println("Sorry we did not find the lesson that entered in your taken courses");
            }
        }
    }

    @Override
    public String toString() {
        return super.toString()+ "Student{" +
                "takenCourse=" + takenCourse + '}';
    }
}

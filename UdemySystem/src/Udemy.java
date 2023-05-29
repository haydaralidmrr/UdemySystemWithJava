public class Udemy {
    public static void main(String[] args) {
        Student ogr1=new Student("Ali","alinin tanitim yazisi","Ahido");
        Teacher egt1=new Teacher("Mustafa","mustafa java","Mustafa_coskun");
        Teacher egt2=new Teacher("deneme","deneme java","deneme123");
        Student ogr2=new Student("Haydar","my brain is the best","BestStudent");
        System.out.println(ogr1);
        System.out.println(egt1);
        System.out.println(ogr2);

        Lesson lesson=new Lesson(20.2,1,"Introduction");
        Lesson lesson2=new Lesson(12.0,2,"Primitive types");
        Lesson lesson3=new Lesson(19.2,3,"Operation Functain");
        Lesson lesson4=new Lesson(12.4,4,"Control Structure");
        Lesson lesson5=new Lesson(22.5,5,"Array");

        Course c1=new Course("Java",egt1);
        Course c2=new Course("Kotlin",egt2);

        c1.addLesson(lesson);
        c1.addLesson(lesson2);
        c1.addLesson(lesson3);
        c1.addLesson(lesson4);
        c1.addLesson(lesson5);
        System.out.println(c1.getLessonInCourse());
        System.out.println(c1.active());
        System.out.println(c1.getName());
        System.out.println(c1.numberOfLesson());
        c1.removeTeachers(egt1);
        c1.addTeachers(egt2);
        c1.removeTeachers(egt2);

        ogr1.joinCourse(c1);
        ogr1.watchWillLesson(lesson3);
    }
}

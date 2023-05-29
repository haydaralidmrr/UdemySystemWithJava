public class Lesson {
    private double lessonTime;
    private int lessonNo;
    private String lessonName;

    public Lesson(double lessonTime, int lessonNo, String lessonName) {
        this.lessonTime = lessonTime;
        this.lessonNo = lessonNo;
        this.lessonName = lessonName;
    }

    public double getLessonTime() {
        return lessonTime;
    }

    public void setLessonTime(double lessonTime) {
        this.lessonTime = lessonTime;
    }

    public int getLessonNo() {
        return lessonNo;
    }

    public void setLessonNo(int lessonNo) {
        this.lessonNo = lessonNo;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "lessonTime=" + lessonTime +
                ", lessonNo=" + lessonNo +
                ", lessonName='" + lessonName + '\'' +
                '}';
    }
}

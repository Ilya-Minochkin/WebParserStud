package com;

public class Lesson {

    public Lesson(String lessonName, String lessonType, String teacher) {
        this.lessonName = lessonName;
        this.lessonType = lessonType;
        this.teacher = teacher;
    }

    public Lesson() {
    }

    private Integer id;
    private String lessonName;
    private String lessonType;
    private String teacher;



    public Integer getId() {
        return id;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }

    public String getLessonType() {
        return lessonType;
    }

    public void setLessonType(String lessonType) {
        this.lessonType = lessonType;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
}

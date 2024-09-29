package org.launchcode;

import java.util.Objects;

public class Course {
    private String title;
    private int credit;
    private String instructor;

    public Course (String title, int credit,String instructor){
        this.title = title;
        this.credit = credit;
        this.instructor =instructor;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(title, course.title) && Objects.equals(instructor, course.instructor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, instructor);
    }
}



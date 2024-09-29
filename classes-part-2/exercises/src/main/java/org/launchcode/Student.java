package org.launchcode;

public class Student {
    //initialize
    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    // constructor
    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    /*This constructor initializes only the name field and assigns a unique studentId using nextStudentId.
    It calls the second constructor using this(name, nextStudentId);.
    After assigning studentId, it increments nextStudentId to ensure the next Student created will have a different ID.
    Use this constructor when you only know the name and want the class to generate a unique studentId for you.*/

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa

        double totalScore = this.gpa * this.numberOfCredits;
        //numberOfCredits = numberOfCredits + courseCredits
        this.numberOfCredits += courseCredits;
        totalScore += courseCredits * grade;

        // Calculate new GPA
        this.gpa = totalScore / this.numberOfCredits;

    }

    //TODO: Uncomment and complete the getGradeLevel method here:
    public String getGradeLevel(int numberOfCredits) {
        // Determine the grade level of the student based on numberOfCredits
        if (numberOfCredits < 30) {
            return "Grad 1";
        } else if (numberOfCredits < 60) {
            return "Grad2";
        } else if (numberOfCredits < 90) {
            return "Grad3";
        } else {
            return "Need to check credit";
        }
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.
    /*public String toString() {
        return "Student Name :" + this.name +
                "\nID :" + this.studentId +
                "\nCredits :" + this.numberOfCredits +
                "\nGPA :" + String.format("%.2f", this.gpa);
    }*/

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.
    /*public boolean equals(Object objName) {
        if (this == objName) {
            return true;
        }
        if (objName == null || getClass() != objName.getClass()) {
            return false;
        }
         return true;
    }*/

    public String toString() {

        String studentReport = String.format("%s is a %s with %d credits and a GPA of %.2f", this.name, this.getGradeLevel(this.numberOfCredits), this.getNumberOfCredits(), this.getGpa());
        return studentReport;
    }

    public boolean equals(Object toBeCompared) {
        if (toBeCompared == this) {
            return true;
        }

        if (toBeCompared == null) {
            return false;
        }

        if (toBeCompared.getClass() != getClass()) {
            return false;
        }

        Student theStudent = (Student) toBeCompared;
        return theStudent.getStudentId() == getStudentId();
    }


    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally", 1, 1, 4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println("fdfjsog"+ sally);
        sally.addGrade(+ 12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);
    }
}
public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearOfTeaching;

    public Teacher (String firstName, String lastName, String subject,int yearOfTeaching){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject =  subject;
        this.yearOfTeaching = yearOfTeaching;
    }
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }
    public String getSubject(){
        return subject;
    }
    public int getYearOfTeaching(){
        return yearOfTeaching;
    }

    public void setFirstName(String aFirstName){
        firstName = aFirstName;
    }
    public void setLastName(String aLastName){
        lastName = aLastName;
    }
    public void setSubject(String aSubject){
        subject = aSubject;
    }

    public void setYearOfTeaching(int aYearOfTeaching){
        yearOfTeaching = aYearOfTeaching;
    }
}

public class Student {

   private String name;
   private String surName;
   private String studentID;

    public Student(String name, String studentID, String surName) {
        this.name = name;
        this.studentID = studentID;
        this.surName = surName;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
}

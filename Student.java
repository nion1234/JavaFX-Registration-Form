package sample;

public class Student {
    private String StudentFirstName = " ";
    private String StudentLastName = " ";
    private String EmailAddress = " ";
    private String ConfirmEmailAddress = " ";
    private String PasssWord = " ";
    private String ConfirmPassWord = " ";

    public String getStudentFirstName() {
        return StudentFirstName;
    }

    public String getStudentLastName() {
        return StudentLastName;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public String getConfirmEmailAddress() {
        return ConfirmEmailAddress;
    }

    public String getPasssWord() {
        return PasssWord;
    }

    public String getConfirmPassWord() {
        return ConfirmPassWord;
    }

    public void setStudentFirstName(String studentFirstName) {
       this.StudentFirstName = studentFirstName;
    }

    public void setStudentLastName(String studentLastName) {
       this. StudentLastName = studentLastName;
    }

    public void setEmailAddress(String emailAddress) {
       this. EmailAddress = emailAddress;
    }

    public void setConfirmEmailAddress(String confirmEmailAddress) {
       this. ConfirmEmailAddress = confirmEmailAddress;
    }

    public void setPasssWord(String passsWord) {
       this. PasssWord = passsWord;
    }

    public void setConfirmPassWord(String confirmPassWord) {
        this.ConfirmPassWord = confirmPassWord;
    }

    @Override
    public String toString() {
        return "Student{" +
                "StudentFirstName='" + StudentFirstName + '\'' +
                ", StudentLastName='" + StudentLastName + '\'' +
                ", EmailAddress='" + EmailAddress + '\'' +
                ", ConfirmEmailAddress='" + ConfirmEmailAddress + '\'' +
                ", PasssWord='" + PasssWord + '\'' +
                ", ConfirmPassWord='" + ConfirmPassWord + '\'' +
                '}';
    }
}

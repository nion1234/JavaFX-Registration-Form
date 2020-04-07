package sample;

public class StudentApp {
    public static void main(String[] args){
        System.out.println("Student information System");

        Student student=new Student();
        student.setStudentFirstName( "Rakib" );
        student.setStudentLastName( "Rahman" );
        student.setEmailAddress( "rahamanmdRakib@gmail.com" );
        student.setConfirmEmailAddress( "rahamanmdrakib@gmail.com" );
        student.setPasssWord( "HelloPass" );
        student.setConfirmPassWord( "HelloPass" );
        System.out.println(student.toString());
    }

}

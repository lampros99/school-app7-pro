package gr.aueb.cf.schoolapp.dto.exceptions;


import java.io.Serial;

public class TeacherNotFoundException extends Exception {

    @Serial
    public static long getSerialVersionUID = 1L;

    private static final long serialVersionUID = 1L;

    public TeacherNotFoundException(String message){
        super(message);
    }

}

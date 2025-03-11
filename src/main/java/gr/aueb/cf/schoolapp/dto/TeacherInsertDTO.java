package gr.aueb.cf.schoolapp.dto;

public class TeacherInsertDTO extends BaseDTO{

    public TeacherInsertDTO(){}

    public TeacherInsertDTO(Integer cityId, String email, String fatherName,
                            String firstname, String lastname, String phoneNumber,
                            String street, String streetNum, String vat, String zipCode) {
        super(cityId, email, fatherName, firstname, lastname, phoneNumber, street, streetNum, vat, zipCode);
    }



}

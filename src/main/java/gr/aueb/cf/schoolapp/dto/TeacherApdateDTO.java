package gr.aueb.cf.schoolapp.dto;

public class TeacherApdateDTO extends BaseDTO {
    private Integer id;

    public TeacherApdateDTO(){};



    public TeacherApdateDTO(Integer cityId, String email, String fatherName,
                            String firstname, String lastname, String phoneNumber,
                            String street, String streetNum, String vat, String zipCode, Integer id) {
        super(cityId, email, fatherName, firstname, lastname, phoneNumber, street, streetNum, vat, zipCode);
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void TeacherApdateDTO(Integer id) {
    this.id = id;
}

}
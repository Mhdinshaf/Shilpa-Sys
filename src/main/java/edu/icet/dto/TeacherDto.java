package edu.icet.dto;

import edu.icet.util.Gender;
import jakarta.persistence.criteria.CriteriaBuilder;

public class TeacherDto {
    private Integer id;
    private String name;
    private Integer phonenumber;
    private String  email;
    private String address;
    private Double salary;
    private Gender gender;

}

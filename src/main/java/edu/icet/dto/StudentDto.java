package edu.icet.dto;

import edu.icet.util.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class StudentDto {
    private Integer id;
    private String name;
    private String address;
    private Gender gender;
    private Integer clubId;
    private Integer schoolId;
    private Integer libraryId;
    private Integer mediumId;
    private Integer reportId;
}

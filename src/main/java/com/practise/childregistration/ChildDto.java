package com.practise.childregistration;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChildDto {

    private Integer regNo;
    private String name;
    private String birthPlace;
    private Date birthDay;
    private String gender;
    private Integer weight;
    private String mamaName;
    private String mamaOccupation;
    private Integer mamaAge;
    private String maritalStatus;
}

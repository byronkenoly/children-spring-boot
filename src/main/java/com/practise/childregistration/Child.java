package com.practise.childregistration;

import jakarta.persistence.*;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "personal-data")
public class Child {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer regNo;

    private String name;
    private String birthPlace;

    @Column(name = "birthdate")
    @Temporal(TemporalType.DATE)
    private Date birthDay;

    private String gender;
    private Integer weight;
    private String mamaName;
    private String mamaOccupation;
    private Integer mamaAge;
    private String maritalStatus;

}

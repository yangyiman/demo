package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.annotation.security.DenyAll;
import java.util.Date;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Employee {

	private Integer id;
    private String lastName;
    private String email;
    //1 male, 0 female
    private Integer gender;
    private Department department;
    private Date birth;


}

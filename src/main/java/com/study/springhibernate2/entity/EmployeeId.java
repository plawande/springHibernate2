package com.study.springhibernate2.entity;

import lombok.*;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Embeddable
public class EmployeeId implements Serializable {
    private int employeeNumber;
    private int deptId;
}

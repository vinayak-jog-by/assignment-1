package com.assignment.employeeservice.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("emp_skill")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeSkill {
    @PrimaryKey
    Integer emp_id;
    Double java_exp;
    Double spring_exp;
}

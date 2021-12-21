package dz.mycompany.testdemo.employees.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    private Long id ;
    private String username;
    private String email ;
    private Date birthday ;
    private int gender ;
    private float salary;
}

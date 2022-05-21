package example.springboot.ess.employee.controller;

import java.io.Serializable;
import lombok.Data;

@Data
public class EmployeeResponse implements Serializable {

  private Long id;
}

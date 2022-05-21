package example.springboot.ess.department.controller;

import java.io.Serializable;
import lombok.Data;

@Data
public class DepartmentRequest implements Serializable {

  private Long id;

  private String name;

  private String abbreviation;

}

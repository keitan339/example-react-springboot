package example.springboot.ess.department.controller;

import lombok.Data;

@Data
public class DepartmentRequest {

  private Long id;

  private String name;

  private String abbreviation;

}

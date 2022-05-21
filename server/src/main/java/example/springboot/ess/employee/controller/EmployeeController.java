package example.springboot.ess.employee.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

  @RequestMapping(value = "/find", method = RequestMethod.GET)
  public List<EmployeeResponse> find(EmployeeRequest request) {
    List<EmployeeResponse> response = new ArrayList<>();
    return response;
  }

  @RequestMapping(value = "/create", method = RequestMethod.POST)
  public EmployeeResponse create(EmployeeRequest request) {
    EmployeeResponse response = new EmployeeResponse();
    return response;
  }

  @RequestMapping(value = "/update", method = RequestMethod.POST)
  public EmployeeResponse update(EmployeeRequest request) {
    EmployeeResponse response = new EmployeeResponse();
    return response;
  }

  @RequestMapping(value = "/delete", method = RequestMethod.POST)
  public EmployeeResponse delete(EmployeeRequest request) {
    EmployeeResponse response = new EmployeeResponse();
    return response;
  }
}

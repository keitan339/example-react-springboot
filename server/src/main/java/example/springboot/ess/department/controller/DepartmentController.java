package example.springboot.ess.department.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import example.springboot.ess.department.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {

  @Autowired
  private DepartmentService departmentService;

  @RequestMapping(value = "/find", method = RequestMethod.GET)
  public List<DepartmentResponse> find(DepartmentRequest request) {
    List<DepartmentResponse> response = departmentService.find(request);
    return response;
  }

  @RequestMapping(value = "/create", method = RequestMethod.POST)
  public DepartmentResponse create(DepartmentRequest request) {
    DepartmentResponse response = departmentService.create(request);
    return response;
  }

  @RequestMapping(value = "/update", method = RequestMethod.POST)
  public DepartmentResponse update(DepartmentRequest request) {
    DepartmentResponse response = new DepartmentResponse();
    return response;
  }

  @RequestMapping(value = "/delete", method = RequestMethod.POST)
  public DepartmentResponse delete(DepartmentRequest request) {
    DepartmentResponse response = new DepartmentResponse();
    return response;
  }
}

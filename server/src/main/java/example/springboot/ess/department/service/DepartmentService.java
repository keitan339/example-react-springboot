package example.springboot.ess.department.service;

import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import example.springboot.ess.common.entity.DepartmentEntity;
import example.springboot.ess.common.repository.DepartmentRepository;
import example.springboot.ess.department.controller.DepartmentRequest;
import example.springboot.ess.department.controller.DepartmentResponse;

@Transactional
@Service
public class DepartmentService {

  @Autowired
  private DepartmentRepository departmentRepository;


  public List<DepartmentResponse> find(DepartmentRequest request) {

    DepartmentEntity inputEntity = new DepartmentEntity();
    inputEntity.setName(request.getName());
    inputEntity.setAbbreviation(request.getAbbreviation());

    List<DepartmentEntity> resultEntities = departmentRepository.findAll();

    List<DepartmentResponse> resultList = new ArrayList<>();

    resultEntities.forEach(elem -> {
      DepartmentResponse response = new DepartmentResponse();
      response.setId(elem.getId());
      resultList.add(response);
    });

    return resultList;
  }

  public DepartmentResponse create(DepartmentRequest request) {

    DepartmentEntity inputEntity = new DepartmentEntity();
    inputEntity.setName(request.getName());
    inputEntity.setAbbreviation(request.getAbbreviation());

    DepartmentEntity resultEntity = departmentRepository.save(inputEntity);

    DepartmentResponse response = new DepartmentResponse();
    response.setId(resultEntity.getId());

    return response;
  }
}

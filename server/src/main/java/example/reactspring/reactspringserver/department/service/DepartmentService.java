package example.reactspring.reactspringserver.department.service;

import java.util.ArrayList;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import example.reactspring.reactspringserver.common.entity.DepartmentEntity;
import example.reactspring.reactspringserver.common.repository.DepartmentRepository;
import example.reactspring.reactspringserver.department.controller.DepartmentRequest;
import example.reactspring.reactspringserver.department.controller.DepartmentResponse;

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

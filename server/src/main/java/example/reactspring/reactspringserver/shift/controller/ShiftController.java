package example.reactspring.reactspringserver.shift.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shift")
public class ShiftController {

  @RequestMapping(value = "/find", method = RequestMethod.GET)
  public List<ShiftResponse> find(ShiftRequest request) {
    List<ShiftResponse> response = new ArrayList<>();
    return response;
  }

  @RequestMapping(value = "/create", method = RequestMethod.POST)
  public ShiftResponse create(ShiftRequest request) {
    ShiftResponse response = new ShiftResponse();
    return response;
  }

  @RequestMapping(value = "/update", method = RequestMethod.POST)
  public ShiftResponse update(ShiftRequest request) {
    ShiftResponse response = new ShiftResponse();
    return response;
  }

  @RequestMapping(value = "/delete", method = RequestMethod.POST)
  public ShiftResponse delete(ShiftRequest request) {
    ShiftResponse response = new ShiftResponse();
    return response;
  }
}

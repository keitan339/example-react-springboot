package example.springboot.ess.shift.controller;

import java.io.Serializable;
import lombok.Data;

@Data
public class ShiftRequest implements Serializable {

  private Long id;
}

package pl.java.scalatech.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Builder;

@Data
@Builder
public class Country {
  private Long id;  
  private String name;
 
  
}

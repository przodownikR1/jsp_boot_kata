package pl.java.scalatech.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Builder;

@Data
@Builder
@EqualsAndHashCode(exclude="name")
@NoArgsConstructor
@AllArgsConstructor
public class Country {
  private Long id;  
  private String name;
 
  
}
